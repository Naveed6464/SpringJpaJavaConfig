package com.naveed.spring.demo;

import com.naveed.spring.demo.config.EclipseLinkConfig;
import com.naveed.spring.demo.domain.entities.User;
import com.naveed.spring.demo.domain.repositories.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Naveedur Rahman
 * @email naveed6464@gmail.com
 * @version 1.0
 * @since Jan 16, 2020
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(EclipseLinkConfig.class);
        UserRepository userRepo = ctx.getBean(UserRepository.class);
        System.out.println(">>>>>>>>>>>>>> " + userRepo.findAll());
        userRepo.save(User.builder().firstName("Naveed").lastName("Rahman").build());
        userRepo.save(User.builder().firstName("Jawad").lastName("Ahmed").build());
        System.out.println(">>>>>>>>>>>>>> " + userRepo.findAll());
    }
}
