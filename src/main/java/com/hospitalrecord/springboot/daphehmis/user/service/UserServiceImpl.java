package com.mh.trektrekker.daphehmis.user.service;

import com.mh.trektrekker.daphehmis.enums.UserType;
import com.mh.trektrekker.daphehmis.user.entity.User;
import com.mh.trektrekker.daphehmis.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
//service layer ko laagi vayuo
//controller ma aako request haru lai intercept garera
public class UserServiceImpl implements UserService {

    //dependecies is a process where object define dependencies and container injects dependencies when dependencies create beans
    //feild based dependency hunna use the annotation autowired

    @Autowired //inject the object dependency implicitly
    private UserRepository userRepository;

    //userRepository.findAll ley db ma vaye ko user ko record lai lerauu
    @Override
    public List<User> findUsers() {

        return userRepository.findAll();
    }

    @Override
    public User save(User user) {

        return userRepository.save(user);
    } //save object

    @Override
    public List<User> getPatients() {
        return userRepository.findAllByUserType(UserType.PATIENT);
    }

    @Override
    public List<User> getUserByMobileNumber() {
        return userRepository.findAllByMobileNumber("4126575964");
    }


}
