package com.beichuang.crm.project.controller;


import com.beichuang.crm.framework.util.help.DateTimeHelp;
import com.beichuang.crm.project.dao.CustomerMapper;
import com.beichuang.crm.project.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.Format;
import java.text.ParseException;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wanghao
 * @since 2020-07-05
 */
@Controller
public class CustomerController {

    @Autowired
    private CustomerMapper customerMapper;

    @GetMapping("/customer/list")
    public String userList(Model model) {
        List<Customer> list = customerMapper.selectCustomerList();
        model.addAttribute("customerList", list);
        return "customer/culist";
    }

    @GetMapping("/customer/add")
    public String add(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/addcustomer";
    }

    @PostMapping(value="/add_customer")
    public String addUser(@ModelAttribute() @Valid Customer customer, Errors errors) {
        if (errors.hasErrors()) {
            return "customer/addcustomer";
        }
        customerMapper.addCustomer(customer);
        return "redirect:/customer/list";
    }
}

