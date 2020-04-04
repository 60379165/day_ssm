package com.ty.service.impl;

import com.ty.dao.AccountDao;
import com.ty.domain.Account;
import com.ty.domain.Suser;
import com.ty.service.accountservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountservice")
public class serviceimpl implements accountservice {
    @Autowired
    private AccountDao accountDao;


    public List<Account> findall() {
        System.out.println("业务层:findall");
       /* PageHelper.startPage(1,3);*/
        return accountDao.findall();
    }

    public void add(Account account) {
        System.out.println("业务层:add");
        accountDao.add(account);
    }

    @Override
    public Account findbyid(Account account) {
        return accountDao.findbyid(account);
    }


    public String login(Account acc) {
        return accountDao.login(acc);
    }

    @Override
    public void update(Account account) {
       accountDao.update(account);

    }

    @Override
    public void delete(Account account) {
       accountDao.delete(account);

    }

    @Override
    public void deleteAll(String[] ids) {
        if (ids != null && ids.length > 0) {
            String[] var2 = ids;
            int var3 = ids.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                String id = var2[var4];
                this.accountDao.deleteAll(Integer.parseInt(id));
            }
        }else{
            System.out.println("wu");
        }
    }

    @Override
    public Account findbyrid(Account account) {
        return accountDao.findbyrid(account);
    }

    @Override
    public List<Account> findbyname(String username) {
        return accountDao.findbyname(username);
    }


}
