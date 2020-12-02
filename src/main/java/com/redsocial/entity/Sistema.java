package com.redsocial.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "sistemaevaluacion")
@Getter
@Setter
public class Sistema {

	@Id
	private int idSistemaEvaluacion;
	public int getIdSistemaEvaluacion() {
		return idSistemaEvaluacion;
	}
	public void setIdSistemaEvaluacion(int idSistemaEvaluacion) {
		this.idSistemaEvaluacion = idSistemaEvaluacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	private String nombre;
	private String formula;
	private String estado;

}




