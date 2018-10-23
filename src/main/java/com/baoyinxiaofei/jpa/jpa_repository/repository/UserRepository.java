package com.baoyinxiaofei.jpa.jpa_repository.repository;

import com.baoyinxiaofei.jpa.jpa_repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByName(String name);

    @Query(value = "select * from user",nativeQuery = true)
    public List<User> findAllByQuery();

}