package org.genspark.javaDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class StudConfig {
    @Bean
    public Student getStudent() {
        return new Student();
    }
    @Bean
    public Address getAddress() {
        Address address = new Address();
        return address;
    }
    @Bean
    public Phone getPhoneNum() {
        Phone phone = new Phone();
        return phone;
    }
}
