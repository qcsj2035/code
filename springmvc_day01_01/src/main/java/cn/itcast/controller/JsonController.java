package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/json")
public class JsonController {

	@RequestMapping("/test01")
	public void test01(HttpServletResponse response) throws IOException {
		System.out.println("1122121");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().write("黑马");
	}
	@RequestMapping(value = "/test02",produces = "text/html;charset=utf-8")
	@ResponseBody//响应体向页面写回数据
	public String test02(HttpServletResponse response) throws IOException {
		System.out.println("112121231231231");

		return "合肥";
	}
	@RequestMapping( "/test03")
	@ResponseBody//响应体向页面写回数据
	public User test03()  {
		System.out.println("33333");
		User user =new User();
		user.setId(1);
		user.setUsername("admin");

		return user;
	}
	@RequestMapping( "/test04")
	@ResponseBody//响应体向页面写回数据
	public List test04()  {
		System.out.println("33333");
		List<User> list =new ArrayList<User>();
		User user =new User();
		user.setId(1);
		user.setUsername("admin");
		User user1 =new User();
		user1.setId(1);
		user1.setUsername("admin");
		User user2 =new User();
		user2.setId(1);
		user2.setUsername("admin");
		list.add(user);
		list.add(user1);
		list.add(user2);
		return list;
	}
}
