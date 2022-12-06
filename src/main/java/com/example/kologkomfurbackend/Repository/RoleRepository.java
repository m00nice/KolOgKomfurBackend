package com.example.kologkomfurbackend.Repository;

import com.example.kologkomfurbackend.Model.ERole;
import com.example.kologkomfurbackend.Model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

