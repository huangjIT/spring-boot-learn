package com.hj.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author HJ
 * @date 2020-06-29
 **/
@SpringBootApplication(scanBasePackages = "com.hj.learn")
public class App {

    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }

}
