package com.xie.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xie.test.service.UserService;
import com.xie.test.vo.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	public UserService userService;
	
	@RequestMapping(value="/getUserJson")
	@ResponseBody
	public String getUserJson(){
		List<User> listUser=userService.getUser();
		String json=JSON.toJSONString(listUser);
		System.out.println(json);
		System.out.println("123");
		return json;
	}
	
	@RequestMapping(value="/getUserList")
	public ModelAndView getUserList(ModelAndView modelAndView,int pageNum){
		int pageSize=2;
		List<User> listUser=userService.getUser();
		//mybatis分页插件，需要在spring配置
		PageHelper.startPage(pageNum, pageSize);//当前页，页面大小
		PageInfo<User> pageInfo=new PageInfo<User>(listUser);
		modelAndView.addObject("listUser", listUser);
		modelAndView.addObject("pageInfo", pageInfo);
		modelAndView.setViewName("showUser");
		return modelAndView;
	}
}
