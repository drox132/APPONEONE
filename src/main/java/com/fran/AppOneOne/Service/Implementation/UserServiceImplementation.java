package com.fran.AppOneOne.Service.Implementation;

import com.fran.AppOneOne.Model.User;
import com.fran.AppOneOne.Repository.UserRepository;
import com.fran.AppOneOne.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> selectAllUser() {
        return userRepository.selectAllUser();
    }

    @Override
    public User selectAllUserById(int id) {
        return userRepository.selectAllUserById(id);
    }

    @Override
    public void insertUser(User nuevoUser) {
        userRepository.inserUser(nuevoUser.getUserName(),nuevoUser.getPassword());
    }

    @Override
    public void updateUserById(User updateUser) {
        userRepository.updateuser(updateUser.getUserName(),updateUser.getPassword(),updateUser.getId());
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteUser(id);
    }
}
