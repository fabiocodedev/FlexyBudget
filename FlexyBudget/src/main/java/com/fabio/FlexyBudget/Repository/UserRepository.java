package com.fabio.FlexyBudget.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabio.FlexyBudget.Bean.User;


public interface UserRepository extends JpaRepository<User, Integer> {
		User findByEmail (String email);
}
