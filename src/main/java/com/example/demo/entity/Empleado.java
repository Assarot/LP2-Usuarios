package com.example.demo.entity;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Service
@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nombres", columnDefinition = "varchar(50)")
	private String nombres;
	@Column(name = "apellidos", columnDefinition = "varchar(50)")
	private String apellidos;
	@Column(name = "documento", columnDefinition = "varchar(50)")
	private String documento;
	@Column(name = "telefono", columnDefinition = "varchar(9)")
	private String telefono;
	@Column(name = "correo", columnDefinition = "varchar(50)")
	private String correo;
	@Column(name = "estado", columnDefinition = "char(1)")
	private char estado;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "empleado")
    @JsonIgnore
    private Usuario usuario;
}
