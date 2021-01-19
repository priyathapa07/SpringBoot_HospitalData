package com.mh.trektrekker.daphehmis.user.repository;

import com.mh.trektrekker.daphehmis.enums.UserType;
import com.mh.trektrekker.daphehmis.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository //crud  operation..advanced version of DAO(data access object)

//UserRepository ko bean
//interface that extends any repository extednded by Jpa, IOC knows its @Repository

public interface UserRepository extends JpaRepository<User, Integer> { //entity type and id


    List<User> findAllByUserType(UserType userType);

    List<User> findAllByMobileNumber(String mobile);



}
