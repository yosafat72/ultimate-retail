package com.yohesu.ultimate_retail.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yohesu.ultimate_retail.model.UserModel;
import com.yohesu.ultimate_retail.repository.UserRepository;
import com.yohesu.ultimate_retail.service.UserService;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserModel findById(Long id) {
        Optional<UserModel> optional = userRepository.findById(id);
        UserModel userModel;
        if (optional.isPresent()) {
            userModel = optional.get();
        } else {
            throw new RuntimeException(" User not found for id :: " + id);
        }
        return userModel;
    }

    @Override
    public void saveData(UserModel data) {
        this.userRepository.save(data);
    }

    @Override
    public void updateData(UserModel data) {
        this.userRepository.save(data);
    }

    @Override
    public void deleteData(Long id) {
        this.userRepository.deleteById(id);
    }

}
