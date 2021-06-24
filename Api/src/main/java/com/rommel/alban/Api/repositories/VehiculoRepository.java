package com.rommel.alban.Api.repositories;

import com.rommel.alban.Api.entiti.vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface  VehiculoRepository extends JpaRepository <vehiculo, String> {
    @Override
    Optional<vehiculo> findById(String id);
}

