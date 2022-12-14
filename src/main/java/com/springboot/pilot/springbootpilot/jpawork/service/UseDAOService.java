package com.springboot.pilot.springbootpilot.jpawork.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springboot.pilot.springbootpilot.jpawork.entity.User;

@Repository
@Transactional
public class UseDAOService {
    @PersistenceContext
    private EntityManager entityManager;

    public long insert(User user) {
        entityManager.persist(user);
        return user.getId();
    }
}
