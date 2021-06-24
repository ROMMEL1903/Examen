package com.rommel.alban.Api.controllers;

import java.util.List;
import com.rommel.alban.Api.entiti.vehiculo;
import com.rommel.alban.Api.repositories.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller

public class VehiculoController {

    private VehiculoRepository vehiculoRepository;

    @Autowired

    public VehiculoController(VehiculoRepository VehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    public List<vehiculo> findAllvehiculos() {
        return this.vehiculoRepository.findAll();
    }

}
