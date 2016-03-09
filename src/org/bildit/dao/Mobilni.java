package org.bildit.dao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Mobilni {
	private int id;
	@NotNull
	@Size(min=5, max=45,message="Name must be between 5 and 45 characters")
	private String model;
	@Size(min=2, max=10, message="Procesor must be between 2 and 10 characters")
	private String procesor;
	@Size(min=3, max=4, message="Ram must be between 3 and 4 characters")
	private String ram;
	@Size(min=1, max=4, message="Price must be between 1 and 4 characters")
	private String cijena;

	public Mobilni() {
		// TODO Auto-generated constructor stub
	}

	public Mobilni(String model, String procesor, String ram, String cijena) {
		super();
		this.model = model;
		this.procesor = procesor;
		this.ram = ram;
		this.cijena = cijena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProcesor() {
		return procesor;
	}

	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCijena() {
		return cijena;
	}

	public void setCijena(String cijena) {
		this.cijena = cijena;
	}

	@Override
	public String toString() {
		return "Mobilni [model=" + model + ", procesor=" + procesor + ", ram=" + ram + ", cijena="
				+ cijena + "]";
	}

}
