package com.restProjectJpa.restproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableSwagger2
@SpringBootApplication
public class RestProjApplication {

    public static void main(String[] args) {

        SpringApplication.run(RestProjApplication.class, args);
    }
//    @Bean
//    public webClient.Builder.getwebClient(){
//        return webClient.builder();
//    }

}
