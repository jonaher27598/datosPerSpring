package com.roytuts.spring.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.roytuts.hibernate.model.UserDetails;
import com.roytuts.spring.dao.UserDetailsDao;

public class UserDetailsDaoImpl implements UserDetailsDao {

    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    @Override
    public UserDetails create(UserDetails userDetails) {
        if(userDetails.getId()==0)
        	sessionFactory.getCurrentSession().save(userDetails);
        else
        	return null;
        return userDetails;
    }
    
    @Transactional
    @Override
    public UserDetails update(UserDetails userDetails) {
    	if(userDetails!=null) {
    		sessionFactory.getCurrentSession().update(userDetails);
    	}
    	else {
    		return null;
    	}
    	return userDetails;
    }
    
    @Override
    @Transactional
    public void destroy(UserDetails userDetails) {
    	sessionFactory.getCurrentSession().delete(userDetails);
    }

    @Transactional
    @Override
    public UserDetails getuserDetails(int id) {
        UserDetails userDetails = (UserDetails) sessionFactory.getCurrentSession().get(UserDetails.class, id);
        return userDetails;
    }

    @Transactional
    @Override
    public List<UserDetails> getAllUserDetails() {

        @SuppressWarnings("unchecked")
        List<UserDetails> userDetails = (List<UserDetails>) sessionFactory.getCurrentSession()
                .createCriteria(UserDetails.class).list();
        
        //or below query
        
        /*
         * @SuppressWarnings("unchecked") List<UserDetails> userDetails =
         * (List<UserDetails>)sessionFactory.getCurrentSession().createQuery(
         * "from UserDetails").list();
         */
        
        return userDetails;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}