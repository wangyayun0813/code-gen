package com.chinac.cpc;

import com.chinac.cpc.dao.UserDao;
import com.chinac.cpc.model.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 文件名：
 * 描述：
 * 创建人： wangyayun
 * 创建时间： 2016/8/22.
 * 修改人：
 */
@SpringBootApplication
@MapperScan("com.chinac.cpc.dao")
@Controller
public class Main
{
    @Autowired
    private UserDao userDao;

    @RequestMapping("/")
    public String home(Map<String,Object> map)
    {
        User user = userDao.selectById(30l);
        System.out.println(user.getName());
        map.put("user",user);
        return "index";
    }

    public static void main(String[] args)
    {
        SpringApplication.run(Main.class,args);
    }
}
