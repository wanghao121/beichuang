package com.beichuang.crm.project.service.impl;

import com.beichuang.crm.project.dao.UserMapper;
import com.beichuang.crm.project.entity.User;
import com.beichuang.crm.project.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author whao
 * @since 2020-07-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
