package com.cowerling.concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2017-1-6.
 */
public class PerformanceMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/soundsystem.xml");
        Performance performance = applicationContext.getBean("performance", Performance.class);
        performance.perform();
    }
}
