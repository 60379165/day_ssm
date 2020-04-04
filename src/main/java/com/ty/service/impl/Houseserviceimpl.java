package com.ty.service.impl;

import com.ty.dao.HouseDao;
import com.ty.domain.House;
import com.ty.service.Houseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("Houseservice")
public class Houseserviceimpl implements Houseservice {
    @Autowired
    private HouseDao houseDao;
    @Override
    public List<House> findall() {
        return houseDao.findall();
    }

    @Override
    public House findbyid(House house) {
        return houseDao.findbyid(house);
    }
    @Override
    public void add(House house) {
        houseDao.add(house);

    }
    @Override
    public void update(House house) {
        houseDao.update(house);

    }
    @Override
    public void delete(House house) {
        houseDao.delete(house);

    }

    @Override
    public void deleteAll(String[] ids) {
        if (ids != null && ids.length > 0) {
            String[] var2 = ids;
            int var3 = ids.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                String id = var2[var4];
                this.houseDao.deleteAll(Integer.parseInt(id));
            }
        }else{
            System.out.println("wu");
        }
    }

    @Override
    public List<House> findbyname(String address) {
        return houseDao.findbyname(address);
    }


}
