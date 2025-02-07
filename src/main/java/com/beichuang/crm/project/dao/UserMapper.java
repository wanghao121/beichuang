package com.beichuang.crm.project.dao;

import com.beichuang.crm.project.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 用户信息表 Mapper 接口
 * </p>
 *
 * @author whao
 * @since 2020-07-04
 */
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from sys_user where login_name = #{loginName} ")
    User selectUserByName(String loginName);

    @Select("select * from sys_user where login_name <>'admin' order by user_id desc")
    List<User> selectUserList();

    @Insert("insert into sys_user (user_name,login_name,phone,sex,user_type,remark) " +
            "values (#{userName},#{loginName},#{phone},#{sex},#{userType},#{remark}) ")
    Integer addUser(User user);
}
