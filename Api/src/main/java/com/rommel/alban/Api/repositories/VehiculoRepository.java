package com.rommel.alban.Api.repositories;


import com.rommel.alban.Api.entiti.vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

interface  VehiculoRepository  extends JpaRepository< vehiculo, Integer> {
}