package com.baoyinxiaofei.jpa.jpa_repository.service;

import com.baoyinxiaofei.jpa.jpa_repository.entity.User;

import java.util.List;

public interface UserService {


    public List<User> findAllByJpaRepository();

    public List<User> findAllByQuery();

    public List<User> findAllSort();

    public List<User> findByExample();
}
