package com.beichuang.crm.project.service.impl;

import com.beichuang.crm.project.entity.Customer;
import com.beichuang.crm.project.dao.CustomerMapper;
import com.beichuang.crm.project.service.CustomerService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanghao
 * @since 2020-07-14
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
