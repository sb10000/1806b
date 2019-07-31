package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//标识
@SpringCloudApplication
@EnableFeignClients
public class RunAppConsumerHystrix {

	public static void main(String[] args) {
		SpringApplication.run(RunAppConsumerHystrix.class, args);

	}

}
