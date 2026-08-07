package com.codeadvance.pdpo.infrastructure.repository;

import com.codeadvance.pdpo.infrastructure.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    

}
