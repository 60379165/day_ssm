package com.ty.dao;


import com.ty.domain.Custom;
import com.ty.domain.House;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CustomDao {
    //查询所有租户
    @Select("select * from custom")
    List<Custom> findall();
    //查询单个租户
    @Select("select * from custom where cid = #{cid} ")
    Custom findbyid(Custom custom);
    //添加租户
    @Insert("insert ignore into custom(name,phone,sex,hid) values (#{name},#{phone},#{sex},#{hid})")
    void add(Custom custom);
    //修改租户信息
    @Update("update custom set  name = #{name} ,phone = #{phone},sex=#{sex},hid=#{hid}  where cid = #{cid} ")
    void update(Custom custom);
    //删除租户信息
    @Select("delete from custom where cid=#{cid}")
    void delete(Custom custom);
    @Select("delete from custom where cid=#{cid}")
    void deleteAll(int cid);
    //查询租户姓名
    @Select("select * from custom where name  like '%${name}%' ")
    List<Custom> findbyname(@Param("name")String name);


}