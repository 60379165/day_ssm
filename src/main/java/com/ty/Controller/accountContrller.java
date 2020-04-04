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

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.List;
import java.util.Map;


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
       ma.setViewName("Alist");
        return ma;
    }

    @RequestMapping("save")
    public String save(Account account) throws IOException {
        accountservice.add(account);
        return "redirect:/house/findAll";
    }

    @RequestMapping("save2")
    public String save2(Account account) throws IOException {
        accountservice.add(account);
        return "redirect:/account/findAll";
    }
//    @RequestMapping("login")
//    public String login(Account account) throws IOException {
//        if (accountservice.login(account)==null){
//            return "account";
//        }else{
//            return "redirect:/house/findAll";
//        }
//    }
 /*   @RequestMapping("update/{username}")
    public String update(@PathVariable("username") String username)throws IOException{
        Account a = new Account();
        a.setUsername(username);
        accountservice.update(a);
        return "redirect:/account/findAll";
    }*/
    @RequestMapping("/update")
    public String update(Account account)throws IOException{
        System.out.println(account);
        accountservice.update(account);
        return "redirect:/account/findAll";
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
    @RequestMapping("deleteAll")
    public String deleteAll(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String[] ids = request.getParameterValues("hid");

        System.out.println(ids);
        accountservice.deleteAll(ids);
        return "redirect:/account/findAll";
    }
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id)throws IOException{
        Account a = new Account();
        a.setId(id);
        accountservice.delete(a);
        return "redirect:/account/findAll";
    }
    @RequestMapping("findbyname")
    public ModelAndView findByName(
            HttpServletRequest request, Map<String,Object> map) {
        ModelAndView mb = new ModelAndView();
        String username=request.getParameter("search");
        System.out.println(username);
        List<Account> list=accountservice.findbyname(username);
        System.out.println(list);
        mb.addObject("list",list);
        mb.setViewName("Alist");
        return mb;
    }
    @RequestMapping("findbyname2")
    public ModelAndView findByName2(
            HttpServletRequest request, Map<String,Object> map) {
        ModelAndView mb = new ModelAndView();
        String username=request.getParameter("search");
        System.out.println(username);
        List<Account> list=accountservice.findbyname(username);
        System.out.println(list);
        mb.addObject("list",list);
        mb.setViewName("Alist");
        return mb;
    }

}
