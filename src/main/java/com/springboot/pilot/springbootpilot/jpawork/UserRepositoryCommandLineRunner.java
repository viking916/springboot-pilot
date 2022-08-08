package com.springboot.pilot.springbootpilot.jpawork;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.pilot.springbootpilot.jpawork.entity.User;
import com.springboot.pilot.springbootpilot.jpawork.service.UseDAOService;
import com.springboot.pilot.springbootpilot.jpawork.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User("Viking", "Admin");
        userRepository.save(user);
        Optional<User> userWithIdOne = userRepository.findById(1L);
        log.info("User is retrieved: " + userWithIdOne);

        List<User> users = userRepository.findAll();
        log.info("All Users: " + users);

    }

}
