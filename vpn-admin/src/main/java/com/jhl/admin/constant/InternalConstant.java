package com.jhl.admin.constant;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Component
@PropertySource("internal.properties")
@Getter
@Setter
@Slf4j
public class InternalConstant {
    @Value("${app.version}")
    private String version;
    @Autowired
    RestTemplate restTemplate;
    @Value("${app.githubURL}")
    String githubURL;
    @PostConstruct
    public void init()   {

        new Thread(()->{
            JSONObject forObject = restTemplate.getForObject(githubURL, JSONObject.class);
            String tagName = forObject.getString("tag_name");
            String body = forObject.getString("body").replaceAll("#","");
            log.info("===========================================");
            log.info("Welcome to v2ray-web-manager  : " + version );
            log.info("The latest version :{}",tagName);
            log.info("The latest update :{}",body);
            log.info("===========================================");
        }).start();

    }
}
