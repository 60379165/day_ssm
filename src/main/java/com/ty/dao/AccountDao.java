package com.ty.dao;

        import com.ty.domain.Account;
        import org.apache.ibatis.annotations.Insert;
        import org.apache.ibatis.annotations.Select;
        import org.apache.ibatis.annotations.Update;

        import java.util.List;

public interface AccountDao {
    //查询所有
    @Select("select * from account")
    List<Account> findall();
    //查询单个用户
    @Select("select * from account where id = #{id} ")
    Account findbyid(Account account);
    //添加用户
    @Insert("insert ignore into account(username,password) values (#{username} ,#{password} )")
    void add(Account account);
    //登录功能
    @Select("select * from account where username = #{username} and password = #{password} ")
    String login(Account account);
    //修改用户信息
    @Update("update account set  username = #{username},password = #{password} where id = #{id} ")
    boolean update(Account account);
    //删除用户信息

    @Select("delete from account where id=#{id}")
    void delete(Account account);
    @Select("select * from account where username = #{username} ")
    Account findbyname(Account account);



}
