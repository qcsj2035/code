package cn.itcast.dao;

import cn.itcast.domian.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();
}
