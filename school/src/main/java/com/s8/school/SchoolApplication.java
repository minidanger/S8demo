package com.s8.school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: Brooke Li
 * @E-mail: Halloworld1992@outlook.com
 * @Date: Created in $[TIME] $[DATE]
 * @Description:
 * @Modified by:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SchoolApplication {
    public static void main(String[] args) {
        SpringApplication.run(SchoolApplication.class);
    }
}
