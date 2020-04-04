package com.ty.dao;



import com.ty.domain.Suser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SuserDao {
    //超级登录功能
    @Select("select * from suser where sname = #{sname} and spassword = #{spassword} ")
    String slogin(Suser suser);


}