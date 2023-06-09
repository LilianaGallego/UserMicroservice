package com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.repositories;

import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByDniNumber(String dniNumber);
    Optional<UserEntity> findByMail(String mail);

    List<UserEntity> findAllById(Long idUser);
    boolean existsByMail(String mail);

}
