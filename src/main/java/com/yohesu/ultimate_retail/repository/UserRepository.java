package com.yohesu.ultimate_retail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yohesu.ultimate_retail.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
