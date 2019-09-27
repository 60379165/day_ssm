package com.ty.Controller;

import com.ty.domain.Account;
import com.ty.service.accountservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/account")
public class accountContrller {
    @Autowired
    private accountservice accountservice;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView ma = new ModelAndView();
        System.out.println("表现层");
        List<Account> list = accountservice.findall();
       ma.addObject("list",list);
       ma.setViewName("list");
        return ma;
    }

    @RequestMapping("save")
    public String save(Account account) throws IOException {
        accountservice.add(account);
        return "redirect:/account/findAll";
    }
    @RequestMapping("login")
    public String login(Account account) throws IOException {
        if (accountservice.login(account)==null){
            return "account";
        }else{

            return "redirect:/account/findAll";
        }
    }
 /*   @RequestMapping("update/{username}")
    public String update(@PathVariable("username") String username)throws IOException{
        Account a = new Account();
        a.setUsername(username);
        accountservice.update(a);
        return "redirect:/account/findAll";
    }*/
    @RequestMapping("/update")
    @ResponseBody
    public String update(Account account)throws IOException{
        System.out.println(account);
        return true == accountservice.update(account)? "OK!":"error!";
    }
    @RequestMapping("findbyid/{id}")
    public String findbyid(@PathVariable("id") Integer id,Model model) throws Exception{
        Account a = new Account();
        a.setId(id);
        Account account = accountservice.findbyid(a);
        System.out.println(account);
        model.addAttribute("account",account);
        return "update";
    }



    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id)throws IOException{
        Account a = new Account();
        a.setId(id);
        accountservice.delete(a);
        return "redirect:/account/findAll";
    }
    @RequestMapping("findbyname")
    public String findbyname(String username,Model model) throws Exception{
        Account a = new Account();
        a.setUsername(username);
        Account account = accountservice.findbyname(a);
        List<Account> list = new ArrayList<>();
        list.add(account);
        model.addAttribute("list",list);
        return "list";
    }

}
