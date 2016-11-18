package com.cowerling.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2016-11-17.
 */
public class KnightMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
