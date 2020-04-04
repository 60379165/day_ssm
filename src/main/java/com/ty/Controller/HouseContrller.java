package com.ty.Controller;

import com.ty.domain.Account;
import com.ty.domain.House;
import com.ty.service.Houseservice;
import com.ty.service.accountservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("house")
public class HouseContrller {
    @Autowired
    private Houseservice houseservice;
    @Autowired
    private accountservice accountservice;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mb = new ModelAndView();
        System.out.println("表现层");
        List<House> list = houseservice.findall();
        mb.addObject("list",list);
        mb.setViewName("list");
        return mb;
    }
    @RequestMapping("/findAll2")
    public ModelAndView findAll2(){
        ModelAndView mb = new ModelAndView();
        System.out.println("表现层");
        List<House> list = houseservice.findall();
        mb.addObject("list",list);
        mb.setViewName("Slist");
        return mb;
    }

    @RequestMapping("login")
    public String login(Account a)throws IOException{
        if (accountservice.login(a)==null){
            return "account";
        }else  {
            return "redirect:/house/findAll";}
    }

    @RequestMapping("save")
    public String save(House house) throws IOException {
        houseservice.add(house);
        return "redirect:/house/findAll";
    }
    @RequestMapping("save2")
    public String save2(House house) throws IOException {
        houseservice.add(house);
        return "redirect:/house/findAll2";
    }
    @RequestMapping("/update")
    public String update(House house)throws IOException{
        System.out.println(house);
        houseservice.update(house);
        return "redirect:/house/findAll";
    }
    @RequestMapping("/update2")
    public String update2(House house)throws IOException{
        System.out.println(house);
        houseservice.update(house);
        return "redirect:/house/findAll2";
    }
    @RequestMapping("findbyid/{id}")
    public String findbyid(@PathVariable("id") Integer id, Model model) throws Exception{
        House a = new House();
        a.setHid(id);
        House house = houseservice.findbyid(a);
        System.out.println(house);
        model.addAttribute("house",house);
        return "Hupdate";
    }
    @RequestMapping("findbyid2/{id}")
    public String findbyid2(@PathVariable("id") Integer id, Model model) throws Exception{
        House a = new House();
        a.setHid(id);
        House house = houseservice.findbyid(a);
        System.out.println(house);
        model.addAttribute("house",house);
        return "SuperHupdate";
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id)throws IOException{
        House a = new House();
        a.setHid(id);
        houseservice.delete(a);
        return "redirect:/house/findAll";
    }
    @RequestMapping("delete2/{id}")
    public String delete2(@PathVariable("id") Integer id)throws IOException{
        House a = new House();
        a.setHid(id);
        houseservice.delete(a);
        return "redirect:/house/findAll2";
    }
    @RequestMapping("deleteAll")
    public String deleteAll(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String[] ids = request.getParameterValues("hid");

        System.out.println(ids);
        houseservice.deleteAll(ids);
        return "redirect:/house/findAll";
    }
    @RequestMapping("deleteAll2")
    public String deleteAll2(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String[] ids = request.getParameterValues("hid");

        System.out.println(ids);
        houseservice.deleteAll(ids);
        return "redirect:/house/findAll2";
    }

    @RequestMapping("findbyname")
    public ModelAndView findByName(
            HttpServletRequest request,Map<String,Object> map) {
        ModelAndView mb = new ModelAndView();
        String username=request.getParameter("search");
        System.out.println(username);
        List<House> list=houseservice.findbyname(username);
        System.out.println(list);
        mb.addObject("list",list);
        mb.setViewName("list");
        return mb;
    }
    @RequestMapping("findbyname2")
    public ModelAndView findByName2(
            HttpServletRequest request,Map<String,Object> map) {
        ModelAndView mb = new ModelAndView();
        String username=request.getParameter("search");
        System.out.println(username);
        List<House> list=houseservice.findbyname(username);
        System.out.println(list);
        mb.addObject("list",list);
        mb.setViewName("Slist");
        return mb;
    }

}
