package cn.tedu.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient("PROVIDER-USER") //找到提供者，通过Eureka
public interface HelloFeign {

	//对提供者的调用
	    @RequestMapping("/hello/{name}")
		public String hello(@PathVariable("name") String name);
		
}
