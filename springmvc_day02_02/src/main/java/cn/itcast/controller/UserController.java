package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/findStr")
	public String findAll(){
		System.out.println("ok");
		return "ajaxStr";
	}
	@RequestMapping("/findById")
	public User findById(){
		User user =new User();
		user.setId(1);
		user.setUsername("admin");
		return user;
	}
	@RequestMapping("/findAll")
	public List<User> findAll1(){
		User user =new User();
		user.setId(1);
		user.setUsername("admin1111");
		User user1 =new User();
		user1.setId(1);
		user1.setUsername("admin");
		User user2 =new User();
		user2.setId(1);
		user2.setUsername("admin");
		List<User> list =new ArrayList<User>();
		list.add(user);
		list.add(user1);
		list.add(user2);
		return list;
	}
	@RequestMapping("/param1")
	public String test04(User user){
		System.out.println(user.getId());
		System.out.println(user.getUsername());
		return "hello";
	}
	@RequestMapping("/param2")
	public String test05(@RequestBody String body){
		System.out.println(body);
//		System.out.println(user.getId());
//		System.out.println(user.getUsername());
		return "hello2";
	}
	@RequestMapping("/param3")
	public String test06(@RequestBody User user){
//		System.out.println(body);
		System.out.println(user);
		return "hello3";
	}
}
