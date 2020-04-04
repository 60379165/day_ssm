package com.ty.service.impl;

import com.ty.dao.RecordDao;
import com.ty.domain.Record;
import com.ty.service.Recordservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("Orderservice")
public class Recordserviceimpl implements Recordservice {
    @Autowired
    private RecordDao recordDao;
    @Override
    public List<Record> findall() {
        return recordDao.findall();
    }

    @Override
    public Record findbyid(Record record) {
        return recordDao.findbyid(record);
    }

    @Override
    public void add(Record record) {
        recordDao.add(record);

    }

    @Override
    public void update(Record record) {

        recordDao.update(record);

    }

    @Override
    public void delete(Record record) {
        recordDao.delete(record);

    }
    @Override
    public void deleteAll(String[] ids) {
        if (ids != null && ids.length > 0) {
            String[] var2 = ids;
            int var3 = ids.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                String id = var2[var4];
                this.recordDao.deleteAll(Integer.parseInt(id));
            }
        }else{
            System.out.println("wu");
        }
    }
    @Override
    public List<Record> findbyname(String name) {
        return recordDao.findbyname(name);
    }
}
