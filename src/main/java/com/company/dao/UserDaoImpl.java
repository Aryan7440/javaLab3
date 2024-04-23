package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.company.util.DBUtil;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean isValidUser(String username, String password) {
		String query = "SELECT * FROM students WHERE username = ? AND password = ?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			// System.out.println("query run ho rahi");
			return resultSet.next();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addUser(String username, String password, String firstname, String lastname, String dob,
			String email, String subject) {
		String query = "insert into students (username,password,firstname,lastname,dob,email,subject) values (?,?,?,?,?,?,?);";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, firstname);
			preparedStatement.setString(4, lastname);
			preparedStatement.setString(5, dob);
			preparedStatement.setString(6, email);
			preparedStatement.setString(7, subject);

			int resultSet = preparedStatement.executeUpdate();
			System.out.println("Rows affected: " + resultSet);
			return true;
			// System.out.println("query run ho rahi");
			// return resultSet.next();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean changeTeacher(String subject, String teacher) {
		String query = "update faculty set teacher=? where subject=?";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {

			preparedStatement.setString(1, teacher);
			preparedStatement.setString(2, subject);
			System.out.println(preparedStatement);
			int resultSet = preparedStatement.executeUpdate();
			System.out.println("Rows affected: " + resultSet);
			return true;
			// System.out.println("query run ho rahi");
			// return resultSet.next();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
