package com.caixiaobao.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "caixiaobao")
@Component
@Data
public class KeyProperty {
    private String privateKey;
    private String privateKey1;

    private String publicKey;

    private String secret;

    private Integer expiryTime;

}
