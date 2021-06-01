package com.drozdovas.conference.repository;

import com.drozdovas.conference.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User save(User user){
        entityManager.persist(user);
        return null;
    }
}
