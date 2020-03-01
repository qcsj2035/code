package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/para")
public class paramController {

	@RequestMapping("/test01")
	public String test01(String id){
		System.out.println(id);
		return "success";
	}
	@RequestMapping("/test02")
	public String test02(Integer id,String username){
		System.out.println(id);
		System.out.println(username);
		return "success";
	}
	@RequestMapping("/test03")
	public String test03(Integer id,String username,String hobbies){
		System.out.println(id);
		System.out.println(username);
		System.out.println(hobbies);
		return "success";
	}
	@RequestMapping("/test04")
	public String test04(Integer id,String username,String[] hobbies){
		System.out.println(id);
		System.out.println(username);
		System.out.println(Arrays.asList(hobbies));
		return "success";
	}
}
