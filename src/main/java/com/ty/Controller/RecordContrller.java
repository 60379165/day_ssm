package com.ty.Controller;

import com.ty.domain.Custom;
import com.ty.domain.Record;
import com.ty.service.Recordservice;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("order")
public class RecordContrller {
    @Autowired
    private Recordservice recordservice;
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mb = new ModelAndView();
        System.out.println("表现层");
        List<Record> list = recordservice.findall();
        mb.addObject("list",list);
        mb.setViewName("Orderlist");
        return mb;
    }
    @RequestMapping("/findAll2")
    public ModelAndView findAll2(){
        ModelAndView mb = new ModelAndView();
        System.out.println("表现层");
        List<Record> list = recordservice.findall();
        mb.addObject("list",list);
        mb.setViewName("SuperOrderlist");
        return mb;
    }

    @RequestMapping("save")
    public String save(Record record) throws IOException {
        recordservice.add(record);
        return "redirect:/order/findAll";
    }
    @RequestMapping("save2")
    public String save2(Record record) throws IOException {
        recordservice.add(record);
        return "redirect:/order/findAll2";
    }
    @RequestMapping("/update")
    public String update(Record record)throws IOException{
        System.out.println(record);
        recordservice.update(record);
//        return true == houseservice.update(house)? "OK!":"error!";
        return "redirect:/order/findAll";
    }
    @RequestMapping("/update2")
    public String update2(Record record)throws IOException{
        System.out.println(record);
        recordservice.update(record);
//        return true == houseservice.update(house)? "OK!":"error!";
        return "redirect:/order/findAll2";
    }
    @RequestMapping("findbyid/{id}")
    public String findbyid(@PathVariable("id") Integer id, Model model) throws Exception{
        Record a = new Record();
        a.setOid(id);
        Record record = recordservice.findbyid(a);
        model.addAttribute("order", record);
        return "Oupdate";
    }
    @RequestMapping("findbyid2/{id}")
    public String findbyid2(@PathVariable("id") Integer id, Model model) throws Exception{
        Record a = new Record();
        a.setOid(id);
        Record record = recordservice.findbyid(a);
        model.addAttribute("order", record);
        return "SuperOupdate";
    }

    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") Integer id)throws IOException{
        Record a = new Record();
        a.setOid(id);
        recordservice.delete(a);
        return "redirect:/order/findAll";
    }
    @RequestMapping("delete2/{id}")
    public String delete2(@PathVariable("id") Integer id)throws IOException{
        Record a = new Record();
        a.setOid(id);
        recordservice.delete(a);
        return "redirect:/order/findAll2";
    }
    @RequestMapping("findbyname")
    public ModelAndView findByName(
            HttpServletRequest request, Map<String,Object> map) {
        ModelAndView mb = new ModelAndView();
        String username=request.getParameter("search");
        System.out.println(username);
        List<Record> list=recordservice.findbyname(username);
        System.out.println(list);
        mb.addObject("list",list);
        mb.setViewName("Orderlist");
        return mb;
    }
    @RequestMapping("findbyname2")
    public ModelAndView findByName2(
            HttpServletRequest request, Map<String,Object> map) {
        ModelAndView mb = new ModelAndView();
        String username=request.getParameter("search");
        System.out.println(username);
        List<Record> list=recordservice.findbyname(username);
        System.out.println(list);
        mb.addObject("list",list);
        mb.setViewName("SuperOrderlist");
        return mb;
    }
    @RequestMapping("deleteAll")
    public String deleteAll(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String[] ids = request.getParameterValues("hid");

        System.out.println(ids);
        recordservice.deleteAll(ids);
        return "redirect:/order/findAll";
    }
    @RequestMapping("deleteAll2")
    public String deleteAll2(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String[] ids = request.getParameterValues("hid");

        System.out.println(ids);
        recordservice.deleteAll(ids);
        return "redirect:/order/findAll2";
    }

}
