package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.tedu.feign.HelloFeign;

@RestController
public class HelloController {
	@Autowired
	private HelloFeign helloFeign;
	//注入Feign接口
	
	//对提供者的调用
    @RequestMapping("/hello/{name}")
    @HystrixCommand(fallbackMethod="helloFallback")
	public String hello(@PathVariable String name) {
    	//调用提供者
    	return helloFeign.hello(name);
    }
	//hystrix不够完美，第一次可能会进到这里：如果业务顺畅执行，就会正常
	public String helloFallback(String name) {
		
		return "tony";
		
	}

}
