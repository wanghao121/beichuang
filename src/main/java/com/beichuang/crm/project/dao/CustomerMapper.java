package com.beichuang.crm.project.dao;

import com.beichuang.crm.project.entity.Customer;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wanghao
 * @since 2020-07-14
 */
public interface CustomerMapper extends BaseMapper<Customer> {

    @Select("select * from sys_customer where c_type=0 order by c_id desc")
    List<Customer> selectCustomerList();

    //潜在客户
    @Select("select * from sys_customer where c_type=1 order by c_id desc")
    List<Customer> selectPotentialCustomerList();

    @Insert("insert into sys_customer (c_name,nick_name,phone,sex,birthday,remark,sign_time,c_type) " +
            "values (#{cName},#{nickName},#{phone},#{sex},#{birthday},#{remark},#{signTime},0) ")
    Integer addCustomer(Customer customer);

    //新增潜在客户
    @Insert("insert into sys_customer (c_name,nick_name,phone,sex,birthday,remark,sign_time,c_type) " +
            "values (#{cName},#{nickName},#{phone},#{sex},#{birthday},#{remark},#{signTime},1) ")
    Integer addPotentialCustomer(Customer customer);

}
