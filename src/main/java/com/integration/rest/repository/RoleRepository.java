package com.integration.rest.repository;

import java.util.Optional;

import com.integration.rest.model.ERole;
import com.integration.rest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
