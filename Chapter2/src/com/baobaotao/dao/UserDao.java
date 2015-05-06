package com.baobaotao.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.User;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public int getMatchCount(String userName, String password){
		String sqlStr = "select count(*) from t_user where user_name=? and password=?";
		return jdbcTemplate.queryForInt(sqlStr,new Object[]{userName,password});
	}
	
	public User findUserByUserName(String userName){
		String sqlStr = "SELECT user_id, user_name, credits FROM t_user WHERE user_name=?";
		final User user = new User();
		jdbcTemplate.query(sqlStr, new Object[]{userName},new RowCallbackHandler(){

			@Override
			public void processRow(ResultSet paramResultSet)
					throws SQLException {
				user.setUser_id(paramResultSet.getInt("user_id"));
				user.setUser_name(paramResultSet.getString("user_name"));
				user.setCredits(paramResultSet.getInt("credits"));	
			}
			
		});
		
		return user;
	}
	
	
	
	public void updateLoginInfo(User user){
		String sqlStr = "UPDATE t_user SET last_visit=?,last_ip=?,credits=? where user_id=?";
		jdbcTemplate.update(sqlStr,new Object[]{user.getLast_visit(),user.getLast_ip(),user.getCredits(),user.getUser_id()});
	
	}
}
