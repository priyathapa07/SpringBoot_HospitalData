package com.mh.trektrekker.daphehmis.user.service;

import com.mh.trektrekker.daphehmis.user.entity.User;

import java.util.List;



// service user related,multiple thau ma reference vayeko ley 1 service can have multiple  implementation
public interface UserService {

    //to get all users, make an abstract method and write logic or body in serviceimpl
    List<User> findUsers();

    //form bata aako lai save garney
    //esma save garney abstract method cha! just method cha but method ley k garcha vaneko chaina
    // so, userimpl class is responsible for writing logic inside in the body part.

    User save(User user);

    //update

    List<User> getPatients();

    List<User> getUserByMobileNumber();
}
