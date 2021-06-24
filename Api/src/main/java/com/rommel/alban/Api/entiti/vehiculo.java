package com.rommel.alban.Api.entiti;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

  @Entity(name = "vehiculo")
public class vehiculo {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String marca, modelo;
    private boolean precio;



    public vehiculo (String id, String marca, String modelo, boolean precio) {
      this.id = id;
      this.marca = marca;
      this.modelo = modelo;
      this.precio = precio;
    }
    public vehiculo() {

    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      vehiculo vehiculo = (vehiculo) o;
      return precio == vehiculo.precio && Objects.equals(id, vehiculo.id) && Objects.equals(marca, vehiculo.marca) && Objects.equals(modelo, vehiculo.modelo);
    }

    @Override
    public int hashCode() {
      return Objects.hash(id, marca, modelo, precio);
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getMarca() {
      return marca;
    }

    public void setMarca(String marca) {
      this.marca = marca;
    }

    public String getModelo() {
      return modelo;
    }

    public void setModelo(String modelo) {
      this.modelo = modelo;
    }

    public boolean isPrecio() {
      return precio;
    }

    public void setPrecio(boolean precio) {
      this.precio = precio;
    }
  }

