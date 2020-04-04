package com.ty.service;

import com.ty.domain.Custom;
import com.ty.domain.House;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Customservice {
    //查询所有租户
    List<Custom> findall();
    //查询单个租户
    Custom findbyid(Custom custom);
    //添加租户
    void add(Custom custom);
    //修改租户信息
    void update(Custom custom);
    //删除租户信息
    void delete(Custom custom);
    //查询租户姓名
    List<Custom> findbyname(String name);
    void deleteAll(String[] ids);
}
