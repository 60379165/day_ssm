package com.ty.service;

import com.ty.domain.Suser;
import org.apache.ibatis.annotations.Select;

public interface Suserservice {
    //超级登录功能
    String slogin(Suser suser);
}
