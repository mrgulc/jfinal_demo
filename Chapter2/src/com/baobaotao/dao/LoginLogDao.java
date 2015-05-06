package com.baobaotao.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.LoginLog;


@Repository
public class LoginLogDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insertLoginLog(LoginLog loginLog){
		String sqlStr = " INSERT INTO loginlog(user_id,ip,login_datetime) VALUES(?,?,?) ";
		jdbcTemplate.update(sqlStr, new Object[]{loginLog.getUserId(),loginLog.getIp(),loginLog.getLoginDate()});
	
	}
}
