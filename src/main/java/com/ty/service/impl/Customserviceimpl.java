package com.ty.service.impl;

import com.ty.dao.CustomDao;
import com.ty.domain.Custom;
import com.ty.domain.House;
import com.ty.service.Customservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("Customservice")
public class Customserviceimpl implements Customservice {
    @Autowired
    private CustomDao customDao;
    @Override
    public List<Custom> findall() {
        return customDao.findall();
    }

    @Override
    public Custom findbyid(Custom custom) {
        return customDao.findbyid(custom);
    }

    @Override
    public void add(Custom custom) {
        customDao.add(custom);
    }

    @Override
    public void update(Custom custom) {
        customDao.update(custom);
    }

    @Override
    public void delete(Custom custom) {
        customDao.delete(custom);

    }

    @Override
    public List<Custom> findbyname(String name) {
        return customDao.findbyname(name);
    }

    @Override
    public void deleteAll(String[] ids) {
        if (ids != null && ids.length > 0) {
            String[] var2 = ids;
            int var3 = ids.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                String id = var2[var4];
                this.customDao.deleteAll(Integer.parseInt(id));
            }
        }else{
            System.out.println("wu");
        }
    }
}
