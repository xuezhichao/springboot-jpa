package com.baoyinxiaofei.jpa.jpa_repository.service.impl;

import com.baoyinxiaofei.jpa.jpa_repository.entity.User;
import com.baoyinxiaofei.jpa.jpa_repository.repository.UserRepository;
import com.baoyinxiaofei.jpa.jpa_repository.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAllByJpaRepository() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findAllByQuery() {
        return userRepository.findAllByQuery();
    }

    public List<User> findAllSort() {
        List<String> list = new ArrayList<>();
        list.add("id");
        Sort sort = new Sort(Sort.Direction.DESC,list);
        return userRepository.findAll(sort);
    }

    @Override
    public List<User> findByExample() {
        User u = new User();
        u.setId(1L);
        Example<User> exmpale = Example.of(u);
        return userRepository.findAll(exmpale);
    }

}
