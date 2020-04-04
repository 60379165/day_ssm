package com.ty.service;

import com.ty.domain.House;


import java.util.List;

public interface Houseservice {
    //查询所有房屋
    List<House> findall();
    //根据id查询房屋
    House findbyid(House house);
    //添加房源
    void add(House house);
    //修改房源信息
    void update(House house);
    //删除房源信息
    void delete(House house);
    void deleteAll(String[] ids);
    //查询房源状态
    List<House> findbyname(String address);
}
