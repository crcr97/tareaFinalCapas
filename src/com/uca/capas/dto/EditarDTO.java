package com.uca.capas.dto;

import java.math.BigInteger;
import java.sql.Time;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
public class EditarDTO {
	
	private Integer idSucursal;
	
	@NotEmpty(message = "No puede dejar vacio el nombre")
	@Size(message = "Nombre demasiado largo", min = 0, max = 100)
	private String nombreSucursal;
	
	@NotEmpty(message = "No puede dejar vacia la ubicacion")
	@Size(message = "Ubicacion demasiado larga", min = 0, max = 100)
	private String ubicacionSucursal;

	@NotEmpty(message = "Debe ingresar un horario de entrada")
	private String horarioEntrada;
	
	@NotEmpty(message = "Debe ingresar un horario de salida")
	private String horarioSalida;
	
	@NotNull(message="No puede dejar vacio el campo de cantidad")
	@PositiveOrZero(message = "El numero no es valido")
	@Digits(message = "No puede ingresar un numero tan grande", integer = 7, fraction = 0)
	private BigInteger numeroMesas;
	
	@NotEmpty(message = "No puede dejar vacio el nombre del gerente")
	@Size(message = "Nombre demasiado largo", min = 0, max = 100)
	private String nombreGerente;

	public EditarDTO() {
		super();
	}



	public EditarDTO(Integer idSucursal,
			@NotEmpty(message = "No puede dejar vacio el nombre") @Size(message = "Nombre demasiado largo", min = 0, max = 100) String nombreSucursal,
			@NotEmpty(message = "No puede dejar vacia la ubicacion") @Size(message = "Ubicacion demasiado larga", min = 0, max = 100) String ubicacionSucursal,
			@NotEmpty(message = "Debe ingresar un horario de entrada") String horarioEntrada,
			@NotEmpty(message = "Debe ingresar un horario de salida") String horarioSalida,
			@NotNull(message = "No puede dejar vacio el campo de cantidad") @PositiveOrZero(message = "El numero no es valido") @Digits(message = "No puede ingresar un numero tan grande", integer = 7, fraction = 0) BigInteger numeroMesas,
			@NotEmpty(message = "No puede dejar vacio el nombre del gerente") @Size(message = "Nombre demasiado largo", min = 0, max = 100) String nombreGerente) {
		this.idSucursal = idSucursal;
		this.nombreSucursal = nombreSucursal;
		this.ubicacionSucursal = ubicacionSucursal;
		this.horarioEntrada = horarioEntrada;
		this.horarioSalida = horarioSalida;
		this.numeroMesas = numeroMesas;
		this.nombreGerente = nombreGerente;
	}

	public Integer getIdSucursal() {
		return idSucursal;
	}

	public void setIdSucursal(Integer idSucursal) {
		this.idSucursal = idSucursal;
	}

	public String getNombreSucursal() {
		return nombreSucursal;
	}

	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}

	public String getUbicacionSucursal() {
		return ubicacionSucursal;
	}

	public void setUbicacionSucursal(String ubicacionSucursal) {
		this.ubicacionSucursal = ubicacionSucursal;
	}

	public String getHorarioEntrada() {
		return horarioEntrada;
	}

	public void setHorarioEntrada(String horarioEntrada) {
		this.horarioEntrada = horarioEntrada;
	}

	public String getHorarioSalida() {
		return horarioSalida;
	}

	public void setHorarioSalida(String horarioSalida) {
		this.horarioSalida = horarioSalida;
	}

	public BigInteger getNumeroMesas() {
		return numeroMesas;
	}

	public void setNumeroMesas(BigInteger numeroMesas) {
		this.numeroMesas = numeroMesas;
	}

	public String getNombreGerente() {
		return nombreGerente;
	}

	public void setNombreGerente(String nombreGerente) {
		this.nombreGerente = nombreGerente;
	}
	
	//Delegate Functions
	public Time getHorarioEntradaDelegate() {
		if(this.horarioEntrada == null) return null;
		else {
			int hora = Integer.parseInt(horarioEntrada.substring(0,2));
			int minutos = Integer.parseInt(horarioEntrada.substring(3,5));
			Time horaEntrada = new Time(hora, minutos, 00);
			return horaEntrada;
		}
	}
	
	public Time getHorarioSalidaDelegate() {
		if(this.horarioSalida == null) return null;
		else {
			int hora = Integer.parseInt(horarioSalida.substring(0,2));
			int minutos = Integer.parseInt(horarioSalida.substring(3,5));
			Time horaSalida = new Time(hora, minutos, 00);
			return horaSalida;
		}
	}
}
