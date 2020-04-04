package com.ty;


import com.ty.dao.AccountDao;
import com.ty.dao.HouseDao;
import com.ty.domain.Account;
import com.ty.domain.House;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMyBatis {

    /**
     * 测试查询
     * @throws Exception
     */
    @Test
    public void run1() throws Exception {
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        // 查询所有数据
        List<Account> list = dao.findall();
        for(Account account : list){
            System.out.println(account);
        }
        // 关闭资源
        session.close();
        in.close();
    }

    /**
     * 测试保存
     * @throws Exception
     */
    @Test
    public void run2() throws Exception {
//        Account account = new Account();
//        account.setUsername("熊大");
//        account.setPassword("323");

        InputStream in = Resources.getResourceAsStream("applicationContext.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
//        AccountDao dao = session.getMapper(AccountDao.class);
        HouseDao hd = session.getMapper(HouseDao.class);
        List<House> list = hd.findall();
        // 查询所有数据
//        List<Account> list = dao.findall();
        for(House a : list){
            System.out.println(a);
        }
//        dao.login()


        // 关闭资源
        session.close();
        in.close();
    }

}
