package com.hy.controller;

import com.hy.entity.User;
import com.hy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //页面跳转
    @RequestMapping("/{page}")
    public String toPage(@PathVariable() String page){
         return page;
    }

    //回显
    @ResponseBody
    @RequestMapping("/byUsername")
    public HashMap<Object,Object> byUsername(String username){
        HashMap<Object, Object> map = new HashMap<>();
        User user = userService.byUsername(username);
        map.put("user",user);
        return map;
    }

    //上传图片
    @ResponseBody
    @RequestMapping("/upload")
    public String upload(MultipartFile file,HttpServletRequest req) throws IOException{
        //获取原文件名称
        String localPath = "F:\\SSM项目\\SSM2021.5.29\\src\\main\\webapp\\images\\"; //保存本地的路径
        String filename = null; //文件名

        String uuid = UUID.randomUUID().toString().replaceAll("-","");

        filename=uuid+".jpg";//得到 文件名

        file.transferTo(new File(localPath+filename));

        return "/images/"+filename;
    }

    //编辑
    @ResponseBody
    @RequestMapping("/updateUser")
    public String updateUser(@RequestBody User user){
        return userService.updateUser(user)>0?"success":"error";
    }


}
