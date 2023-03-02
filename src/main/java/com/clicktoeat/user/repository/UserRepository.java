package com.clicktoeat.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clicktoeat.user.model.NewUser;
@Repository
public interface UserRepository extends JpaRepository<NewUser, Integer>{

}
