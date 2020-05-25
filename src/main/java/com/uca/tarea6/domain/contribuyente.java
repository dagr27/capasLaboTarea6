package com.uca.tarea6.domain;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(schema="public", name="contribuyente")
public class contribuyente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="c_contribuyente")
	private Integer c_contribuyente;
	
	@Transient
	private Integer cImportancia;
	
	@Column(name="s_nombre")
	@NotEmpty(message="No puede estar vacio")
	@Size(max=30, message="No debe de tener mas de 30 caracteres")
	private String s_nombre;
	
	@Column(name="s_apellido")
	@NotEmpty(message="No puede estar vacio")
	@Size(max=30, message="No debe de tener mas de 30 caracteres")
	private String s_apellido;
	
	@Column(name="s_nit")
	@NotEmpty(message="No puede estar vacio")
	@Size(max=14, message="No debe de tener mas de 14 caracteres")
	private String s_nit;
	
	@Column(name="f_fecha_ingreso")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date f_fecha_ingreso;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="c_importancia")
	private importancia importancia;
	
	public contribuyente() {
		
	}

	public Integer getC_contribuyente() {
		return c_contribuyente;
	}

	public void setC_contribuyente(Integer c_contribuyente) {
		this.c_contribuyente = c_contribuyente;
	}

	public Integer getcImportancia() {
		return cImportancia;
	}

	public void setcImportancia(Integer cImportancia) {
		this.cImportancia = cImportancia;
	}

	public String getS_nombre() {
		return s_nombre;
	}

	public void setS_nombre(String s_nombre) {
		this.s_nombre = s_nombre;
	}

	public String getS_apellido() {
		return s_apellido;
	}

	public void setS_apellido(String s_apellido) {
		this.s_apellido = s_apellido;
	}

	public String getS_nit() {
		return s_nit;
	}

	public void setS_nit(String s_nit) {
		this.s_nit = s_nit;
	}

	public Date getF_fecha_ingreso() {
		return f_fecha_ingreso;
	}

	public void setF_fecha_ingreso(Date f_fecha_ingreso) {
		this.f_fecha_ingreso = f_fecha_ingreso;
	}

	public importancia getImportancia() {
		return importancia;
	}

	public void setImportancia(importancia importancia) {
		this.importancia = importancia;
	}
	
	
}
