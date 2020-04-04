package com.ty.dao;


import com.ty.domain.House;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

public interface HouseDao {
    //查询所有房屋
    @Select("select * from house")
    List<House> findall();
    //查询单个房源
    @Select("select * from house where hid = #{hid} ")
    House findbyid(House house);
    //添加房源
    @Insert("insert ignore into house(type,address,size,price,state) values (#{type},#{address},#{size},#{price},#{state})")
    void add(House house);
    //修改房源信息
    @Update("update house set  type = #{type} ,address = #{address} ,size = #{size} ,price = #{price} ,state = #{state}  where hid = #{hid} ")
    void update(House house);
    //删除房源信息
    @Select("delete from house where hid=#{hid}")
    void delete(House house);

    @Select("delete from house where hid=#{hid}")
    void deleteAll(int hid);
    //查询房源状态
    @Select("select * from house where  address like '%${address}%' ")
    List<House> findbyname(@Param("address")String address);
}