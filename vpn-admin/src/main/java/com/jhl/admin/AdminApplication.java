package com.jhl.admin;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.jhl.admin.constant.ProxyConstant;
import com.jhl.admin.util.SimpleJpaRepositoryImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

import java.util.TimeZone;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = SimpleJpaRepositoryImpl.class)
@EnableTransactionManagement
@Slf4j
@EnableScheduling
@EnableAsync
public class AdminApplication   {



    public static void main(String[] args) {

        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        SpringApplication.run(AdminApplication.class,args);
    }








/* @Override
    public void run(ApplicationArguments args) throws Exception {
      *//*  User newUser = User.builder().email("1@qq.com").nickName("test1").role("admin").password("1234").build();
        userRepository.save(newUser);*//*

         User u = userRepository.findById(4).get();
        System.out.println(u);
        System.out.println("run");
    }*/


}

