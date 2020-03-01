package cn.itcast.dao.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    //注入JDBCTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<User> findAll() {
        return jdbcTemplate.query("select * from user" ,new BeanPropertyRowMapper<User>(User.class));
    }
}
