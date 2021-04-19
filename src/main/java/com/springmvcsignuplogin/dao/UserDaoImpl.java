package com.springmvcsignuplogin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springmvcsignuplogin.models.Login;
import com.springmvcsignuplogin.models.User;

public class UserDaoImpl implements UserDao {

	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void registration(User u) {

		String query = "insert into user (username,password,firstname,lastname,email,address,mobile) values('"
				+ u.getUsername() + "','" + u.getPassword() + "','" + u.getFirstname() + "', '" + u.getLastname()
				+ "', '" + u.getEmail() + "', '" + u.getAddress() + "', '" + u.getMobile() + "')";
		jdbcTemplate.update(query);

//		String sql = "insert into user (username,password,firstname,lastname,email,address,mobile) values(?,?,?,?,?,?,?)";
//		jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),user.getLastname(), user.getEmail(), user.getAddress(), user.getMobile() });

	}

	public User validateUser(Login login) {
		String sql = "SELECT * FROM user WHERE username='" + login.getUsername() + "' and password = '"
				+ login.getPassword() + "'";
		List<User> users = jdbcTemplate.query(sql, new UserMapper());
		return users.size() > 0 ? users.get(0) : null;
	}
}

class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setFirstname(rs.getString("firstname"));
		user.setLastname(rs.getString("lastname"));
		user.setEmail(rs.getString("email"));
		user.setAddress(rs.getString("address"));
		user.setMobile(rs.getString("mobile"));
		return user;
	}

}
