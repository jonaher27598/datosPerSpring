package com.roytuts.spring.service;

import java.util.List;

import com.roytuts.hibernate.model.UserDetails;

public interface UserDetailsService {

	public UserDetails getuserDetails(int id);

	public List<UserDetails> getAllUserDetails();

	public UserDetails save(UserDetails userDetails);

	public UserDetails update(UserDetails userDetails);

}
