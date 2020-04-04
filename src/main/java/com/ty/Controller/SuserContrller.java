package com.ty.Controller;

import com.ty.domain.Account;
import com.ty.domain.Suser;
import com.ty.service.Suserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("suser")
public class SuserContrller {
    @Autowired
    private Suserservice suserservice;
    @RequestMapping("slogin")
    public String slogin(Suser a)throws IOException {

        if (suserservice.slogin(a)==null){
            return "slogin";
        }else  {
//            System.out.println(rid);
            return "redirect:/house/findAll2";}
//        }else {
//            System.out.println(account.getRoleid());
//            return "redirect:/house/findAll2";
//        }
    }
}
