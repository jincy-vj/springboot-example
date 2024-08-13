package com.example.spring.repository;

import com.example.spring.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository  {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> findAll(){

        TypedQuery<User> query = entityManager.createQuery
                ("SELECT u FROM User u", User.class);
        return query.getResultList();
    }
    public User findByName(String name){
        TypedQuery<User> query =entityManager.createQuery("select u from User u where u.name=:name",
                User.class);
       return  query.setParameter("name",name).getSingleResult();
    }
    @Transactional
    public User  save(User user){
        entityManager.merge(user);
        return user;
    }
}
