package com.java.activiti.service;

import java.util.List;
import java.util.Map;

import com.java.activiti.model.User;

public interface UserService {

    User findById(String userId);

    /**
     * 登入
     *
     * @return
     */
    User userLogin(User user);

    /**
     * '
     * 分页查询用户
     *
     * @param map
     * @return
     */
    List<User> userPage(Map<String, Object> map);

    int userCount(Map<String, Object> map);

    /**
     * 批量删除用户
     *
     * @param id
     * @return
     */
    int deleteUser(List<String> id);

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    int addUser(User user);
}
