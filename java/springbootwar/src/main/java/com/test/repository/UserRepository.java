package com.test.repository;


import com.test.modle.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "userRepository")
public interface UserRepository extends CrudRepository<User, Long> {
    public User findByName(String name);
    public User findByNameAndId(String name, Long id);
}