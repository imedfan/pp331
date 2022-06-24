package com.pp311.pp311.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pp311.pp311.model.User;



@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUser(User user) {
        this.entityManager.persist(user);
    }

    @Override
    public void deleteUser(long id) {
        entityManager.createQuery("delete from User where id = :id").setParameter("id", (int) id).executeUpdate();
    }

    @Override
    public void updateUser(User user) {
        System.out.println(user.toString());
        entityManager
                .createQuery("update User set name = :name, age = :age, car = :car, family = :family where id = :id")
                .setParameter("name", user.getName())
                .setParameter("age", user.getAge())
                .setParameter("car", user.getCar())
                .setParameter("family", user.isFamily())
                .setParameter("id", user.getId())
                .executeUpdate();
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User").getResultList();
    }

    @Override
    public User getUser(long id) {
        User user = entityManager.find(User.class, (int) id);
        return user;
    }

}
