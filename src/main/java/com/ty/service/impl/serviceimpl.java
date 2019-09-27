package com.ty.service.impl;

import com.ty.dao.AccountDao;
import com.ty.domain.Account;
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
    public boolean update(Account account) {
       boolean a = accountDao.update(account);
        System.out.println(a);
        return a;
    }

    @Override
    public void delete(Account account) {
       accountDao.delete(account);

    }

    @Override
    public Account findbyname(Account account) {
        return accountDao.findbyname(account);
    }
}
