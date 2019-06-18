package com.roytuts.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.roytuts.hibernate.model.UserDetails;
import com.roytuts.spring.dao.UserDetailsDao;
import com.roytuts.spring.service.UserDetailsService;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDetailsDao userDetailsDao;
    @Override
   
    @Transactional
    public UserDetails save(UserDetails userDetails) {
    	return userDetailsDao.create(userDetails);
    }
    
    @Override
    @Transactional
    public UserDetails update(UserDetails userDetails) {
    	return userDetailsDao.update(userDetails);
    }
    @Override
    public UserDetails getuserDetails(int id) {
        return userDetailsDao.getuserDetails(id);
    }

    @Override
    public List<UserDetails> getAllUserDetails() {
        return userDetailsDao.getAllUserDetails();
    }

    public UserDetailsDao getUserDetailsDao() {
        return userDetailsDao;
    }

}