package com.fran.AppOneOne.Service;

import com.fran.AppOneOne.Model.User;

import java.util.List;

public interface UserService {

    List<User> selectAllUser();
    User selectAllUserById(int id);
    void insertUser(User nuevoUser);
    void updateUserById (User updateUser);
    void deleteUserById(int id);
}
