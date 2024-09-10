package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Empleado;

public interface EmpleadoDao {
	Empleado create(Empleado e);
	Empleado update(Empleado e);
	void delete(Long id);
	Optional<Empleado> read(Long id);
	List<Empleado> readAll();
}
