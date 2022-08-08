package com.springboot.pilot.springbootpilot.jpawork;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.pilot.springbootpilot.jpawork.entity.User;
import com.springboot.pilot.springbootpilot.jpawork.service.UseDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
    @Autowired
    private UseDAOService userDaoService;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Viking", "Admin");
        long insert = userDaoService.insert(user);
        log.info("New user is created: " + user);

    }

}
