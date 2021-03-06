package com.hj.learn.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author HJ
 * @date 2020-07-09
 **/
@Slf4j
@Order(value = Ordered.HIGHEST_PRECEDENCE)
public class MyApplicationListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
      log.info("MyApplicationListener onApplicationEvent event:"+event.getClass().getName());
    }
}
