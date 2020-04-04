package com.ty.Controller;


import com.ty.domain.Account;
import com.ty.domain.Custom;
import com.ty.service.Customservice;
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
@RequestMapping("custom")
public class CustomContrller {
    @Autowired
    private Customservice customservice;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mb = new ModelAndView();
        System.out.println("表现层");
        List<Custom> list = customservice.findall();
        mb.addObject("list",list);
        mb.setViewName("Customlist");
        return mb;
    }
    @RequestMapping("/findAll2")
    public ModelAndView findAll2(){
        ModelAndView mb = new ModelAndView();
        System.out.println("表现层");
        List<Custom> list = customservice.findall();
        mb.addObject("list",list);
        mb.setViewName("SuperCustomlist");
        return mb;
    }

    @RequestMapping("save")
    public String save(Custom custom) throws IOException {
        customservice.add(custom);
        return "redirect:/custom/findAll";
    }
    @RequestMapping("save2")
    public String save2(Custom custom) throws IOException {
        customservice.add(custom);
        return "redirect:/custom/findAll2";
    }
    @RequestMapping("/update")
    public String update(Custom custom)throws IOException{
        customservice.update(custom);
//        return true == houseservice.update(house)? "OK!":"error!";
        return "redirect:/custom/findAll";
    }
    @RequestMapping("/update2")
    public String update2(Custom custom)throws IOException{
        customservice.update(custom);
//        return true == houseservice.update(house)? "OK!":"error!";
        return "redirect:/custom/findAll2";
    }
    @RequestMapping("findbyid/{id}")
    public String findbyid(@PathVariable("id") Integer id, Model model) throws Exception{
        Custom a = new Custom();
        a.setCid(id);
        Custom custom = customservice.findbyid(a);
        model.addAttribute("custom",custom);
        return "Cupdate";
    }
    @RequestMapping("findbyid2/{id}")
    public String findbyid2(@PathVariable("id") Integer id, Model model) throws Exception{
        Custom a = new Custom();
        a.setCid(id);
        Custom custom = customservice.findbyid(a);
        model.addAttribute("custom",custom);
        return "SuperCupdate";
    }
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id)throws IOException{
        Custom a = new Custom();
        a.setCid(id);
        customservice.delete(a);
        return "redirect:/custom/findAll";
    }
    @RequestMapping("delete2/{id}")
    public String delete2(@PathVariable("id") Integer id)throws IOException{
        Custom a = new Custom();
        a.setCid(id);
        customservice.delete(a);
        return "redirect:/custom/findAll2";
    }
    @RequestMapping("deleteAll")
    public String deleteAll(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String[] ids = request.getParameterValues("hid");

        System.out.println(ids);
        customservice.deleteAll(ids);
        return "redirect:/custom/findAll";
    }
    @RequestMapping("deleteAll2")
    public String deleteAll2(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String[] ids = request.getParameterValues("hid");

        System.out.println(ids);
        customservice.deleteAll(ids);
        return "redirect:/custom/findAll2";
    }
    @RequestMapping("findbyname")
    public ModelAndView findByName(
            HttpServletRequest request, Map<String,Object> map) {
        ModelAndView mb = new ModelAndView();
        String username=request.getParameter("search");
        System.out.println(username);
        List<Custom> list=customservice.findbyname(username);
        System.out.println(list);
        mb.addObject("list",list);
        mb.setViewName("Customlist");
        return mb;
    }
    @RequestMapping("findbyname2")
    public ModelAndView findByName2(
            HttpServletRequest request, Map<String,Object> map) {
        ModelAndView mb = new ModelAndView();
        String username=request.getParameter("search");
        System.out.println(username);
        List<Custom> list=customservice.findbyname(username);
        System.out.println(list);
        mb.addObject("list",list);
        mb.setViewName("SuperCustomlist");
        return mb;
    }
}
