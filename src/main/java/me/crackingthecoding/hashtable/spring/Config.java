package me.crackingthecoding.hashtable.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wminikuma@gmail.com
 * Blog : http://minikuma.github.io
 * Github : http://github.com/minikuma
 *
 * @ Author  : minikuma
 * @ Date    : 2018-11-05
 * @ Version : 1.0.0
 * @ Comment : bean 등록 (Service, SimpleMaker)
 */
@Configuration
public class Config {
    @Bean
    public SimpleMaker hasHCodeMaker() {
        return new HashCodeMaker();
    }

    @Bean
    public Service service() {
        return new Service();
    }
}
