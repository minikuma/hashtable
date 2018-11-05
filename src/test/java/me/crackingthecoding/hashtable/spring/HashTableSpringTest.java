package me.crackingthecoding.hashtable.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wminikuma@gmail.com
 * Blog : http://minikuma.github.io
 * Github : http://github.com/minikuma
 *
 * @ Author  : minikuma
 * @ Date    : 2018-10-30
 * @ Version : 1.0.0
 * @ Comment :
 */
public class HashTableSpringTest {
    public static void main(String[] args) {
        // client
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        Service h = ctx.getBean("service", Service.class);
        h.setService(3);
        h.put("mini", "he is cute");
        h.put("kuma", "he is rude");
        h.put("happy", "he is strong");
        h.put("day", "he is good");

        System.out.println(h.get("mini"));
        System.out.println(h.get("kuma"));
        System.out.println(h.get("happy"));
        System.out.println(h.get("day"));

        ctx.close();
    }
}
