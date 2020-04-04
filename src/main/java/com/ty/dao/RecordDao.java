package com.ty.dao;


import com.ty.domain.Custom;
import com.ty.domain.Record;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface RecordDao {
    //查询所有房屋
    @Select("select * from record")
    List<Record> findall();
    //查询单个房源
    @Select("select * from record where oid = #{oid} ")
    Record findbyid(Record record);
    //添加房源
    @Insert("insert ignore into record(name,hid,starttime,endtime) values (#{name},#{hid},#{starttime},#{endtime})")
    void add(Record record);
    //修改房源信息
    @Update("update record set  name = #{name},hid = #{hid},starttime = #{starttime},endtime = #{endtime}  where oid = #{oid} ")
    void update(Record record);
    //删除房源信息
    @Select("delete from record where oid=#{oid}")
    void delete(Record record);
    @Select("delete from record where oid=#{oid}")
    void deleteAll(int oid);
    //查询房源状态
    @Select("select * from record where name  like '%${name}%' ")
    List<Record> findbyname(@Param("name")String name);
}