package com.beichuang.crm.framework.util.enums;

/**
 * @Description
 * @Date 2020/7/14 01:23
 * @Author wanghao
 * @Version 1.0
 */
public enum SexEnum implements BaseEnum{
    boy(0, "男"), girl(1, "女");

    private Integer value; // 值
    private String description; // 描述

    private SexEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}