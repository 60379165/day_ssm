package com.ty.service;

import com.ty.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface accountservice {
    //查询所有
    List<Account> findall();
    //添加用户
    void add(Account account);
    //查询单个用户
    Account findbyid(Account account);
    //登录功能
    String login(Account account);
    //修改用户信息
    boolean update(Account account);
    //删除用户信息
    void delete(Account account);

    Account findbyname(Account account);
}
