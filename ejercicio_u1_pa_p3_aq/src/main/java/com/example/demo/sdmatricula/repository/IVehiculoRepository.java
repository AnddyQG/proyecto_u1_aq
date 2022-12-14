package com.example.demo.sdmatricula.repository;

import com.example.demo.sdmatricula.modelo.Vehiculo;

public interface IVehiculoRepository {
public void Crear(Vehiculo vehiculo);
public void Eliminar(String placa);
public void Actualizar(Vehiculo vehiculo);

}
