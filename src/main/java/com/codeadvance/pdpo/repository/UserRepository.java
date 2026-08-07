package com.codeadvance.pdpo.repository;

import com.codeadvance.pdpo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    

}
