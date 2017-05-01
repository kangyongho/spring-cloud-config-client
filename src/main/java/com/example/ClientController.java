package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by NPOST on 2017-04-23.
 */
@RestController
@EnableConfigurationProperties(PropertyConfig.class)
@RefreshScope
public class ClientController {

    @Autowired
    private PropertyConfig propertyConfig;

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public PropertyConfig check() {
        return propertyConfig;
    }
}
