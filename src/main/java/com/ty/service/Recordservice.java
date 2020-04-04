package com.ty.service;

import com.ty.domain.House;
import com.ty.domain.Record;

import java.util.List;

public interface Recordservice {
    //查询所有房屋
    List<Record> findall();
    //查询单个房源
    Record findbyid(Record record);
    //添加房源
    void add(Record record);
    //修改房源信息
    void update(Record record);
    //删除房源信息
    void delete(Record record);
    //查询房源状态
    List<Record> findbyname(String name);
    void deleteAll(String[] ids);
}
