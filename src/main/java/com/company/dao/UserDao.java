package com.company.dao;

public interface UserDao {

	boolean isValidUser(String username, String password);

	boolean addUser(String username, String password, String firstname, String lastname, String dob, String email,
			String subject);

	boolean changeTeacher(String subject, String teacher);
}
