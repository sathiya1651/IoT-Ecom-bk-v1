package com.pro.iot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.iot.model.SignUp;

@Repository
public interface SignUpRepo extends JpaRepository<SignUp, Integer> {

}
