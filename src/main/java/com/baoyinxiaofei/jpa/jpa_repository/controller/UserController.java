package com.baoyinxiaofei.jpa.jpa_repository.controller;

import com.baoyinxiaofei.jpa.jpa_repository.entity.User;
import com.baoyinxiaofei.jpa.jpa_repository.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/findAllByJpaRepository")
    public List<User> findAllByJpaRepository() {
        List<User> list = userService.findAllByJpaRepository();
        return list;
    }

    @RequestMapping("/findAllByQuery")
    public List<User> findAllByQuery(){
        List<User> list = userService.findAllByQuery();
        return list;
    }

    @RequestMapping("/findAllSort")
    public List<User> findAllSort(){
        List<User> list = userService.findAllSort();
        return list;
    }

    @RequestMapping("/findByExample")
    public List<User> findByExample(){
        List<User> list = userService.findByExample();
        return list;
    }
}