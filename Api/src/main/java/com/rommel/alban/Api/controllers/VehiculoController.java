package com.rommel.alban.Api.controllers;
import com.rommel.alban.Api.VehiculoRepository;
import com.rommel.alban.Api.entiti.vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.Optional;
@Controller

public class VehiculoController {

    private VehiculoRepository vehiculoRepository;

    @Autowired

    public VehiculoController(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    public List<vehiculo> findAllvehiculo() {
        return this.VehiculoReposirory.findAll();
    }

    public Optional<vehiculo> findvehiculotById(int id){
        return this.VehiculoReposirory.findById(id);
    }



    public boolean editvehiculoById(int id, vehiculo vehiculo){
        Optional<vehiculo>vehiculoOptional = this. findvehiculotById();
        if( !vehiculoOptional.isPresent()) return false;
       vehiculo vehiculodb = vehiculoOptional.get();
        vehiculodb.setMarca(vehiculodb.getMarca());
        vehiculodb.setModelo(vehiculo.getModelo());
        vehiculodb.setPrecio(vehiculo.isPrecio());
        VehiculoRepository.save( vehiculodb);
        return true;
    }

    public boolean deletevehiculoById(int id) {
        Optional<vehiculo> vehiculoOptional = this.findvehiculotById(id);
        if (!vehiculoOptional.isPresent()) return false;
        VehiculoRepository.deleteById(id);
        return true;
    }

}
