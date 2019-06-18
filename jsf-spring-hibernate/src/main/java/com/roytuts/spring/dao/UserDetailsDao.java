package com.roytuts.spring.dao;

import java.util.List;
import com.roytuts.hibernate.model.UserDetails;

public interface UserDetailsDao {

	public UserDetails create(UserDetails userDetails);
	
	public UserDetails getuserDetails(int id);

	public List<UserDetails> getAllUserDetails();

	public UserDetails update(UserDetails userDetails);

	public void destroy(UserDetails userDetails);

	
}
