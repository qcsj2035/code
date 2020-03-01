package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.domian.User;
import cn.itcast.service.UserService;

import java.util.List;

public class UserServiceImpl  implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return userDao.findAll();
    }
}
