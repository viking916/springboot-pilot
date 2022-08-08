package com.springboot.pilot.springbootpilot.jpawork.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.pilot.springbootpilot.jpawork.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
