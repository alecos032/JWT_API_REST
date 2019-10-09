package com.co.core.test.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.co.core.test.modelo.User;

public interface UserRepository extends JpaRepository<User,Long>{
	User findOneByUsername(String username);
}
