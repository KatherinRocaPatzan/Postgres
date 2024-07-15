package com.adaschool.datapostgres.data.dto.repopsitory;


import org.springframework.data.jpa.repository.JpaRepository;
import com.adaschool.datapostgres.data.dto.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
