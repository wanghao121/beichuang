package com.beichuang.crm.project.controller;

import com.beichuang.crm.project.dao.UserMapper;
import com.beichuang.crm.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author whao
 * @since 2020-07-04
 */
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    //    简单登录验证
    @PostMapping("/check")
    public String checkLogin(@RequestParam("username") String username, @RequestParam("password") String password, Map<String, Object> map) {
//        User exampleUser = userMapper.selectById(username);
        User loginUser = userMapper.selectUserByName(username);
        if (null == loginUser) {
            map.put("msg", "用户名密码错误");
            return "login";
        }

        String userPassword = loginUser.getPassword();
        System.out.println(userPassword);
//        String userPassword = exampleUser.getPassword();
        if (userPassword.equals(password)) {
            return "index";
        } else {
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }

   /* @GetMapping("/select")
    @ResponseBody
    public User selectUser() {
        // 查询 User
        User exampleUser = userMapper.selectById(1);
        return exampleUser;
    }*/

    @GetMapping("/user/list")
    public String userList(Model model) {
        List<User> list = userMapper.selectUserList();
        model.addAttribute("userList", list);
        return "user/list";
    }

    /*@PostMapping("/user/list")
    @ResponseBody
    public List<User> selectUserList() {
        // 查询 User
        List<User> list = userMapper.selectUserList();
        return list;
    }*/
}

