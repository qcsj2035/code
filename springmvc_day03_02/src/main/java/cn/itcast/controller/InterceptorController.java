package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ic")
public class InterceptorController {

	@RequestMapping("/test01")
	public String test01(){

		System.out.println("test01");
		return "success";
	}
	@RequestMapping("/test02")
	public String test02(){

		System.out.println("test02");
		return "success";
	}
}
