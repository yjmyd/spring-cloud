package cn.huimin.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServerApplication {

  public static void main(String[] args) {
//    SpringApplication.run(SpringCloudEurekaServerApplication.class,args);
    new SpringApplicationBuilder(SpringCloudEurekaServerApplication.class).web(true).run(args);
  }
}

