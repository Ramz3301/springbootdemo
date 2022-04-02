package com.ramz.springbootdemo.repository;

import com.ramz.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
