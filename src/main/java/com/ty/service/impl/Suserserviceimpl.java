package com.ty.service.impl;

import com.ty.dao.SuserDao;
import com.ty.domain.Suser;
import com.ty.service.Suserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("suserservice")
public class Suserserviceimpl implements Suserservice {
    @Autowired
    private SuserDao suserDao;
    @Override
    public String slogin(Suser suser) {
        return suserDao.slogin(suser);
    }
}
