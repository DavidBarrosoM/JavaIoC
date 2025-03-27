package com.app.ioc;

public class Obrero {
	Herramientas herramienta;
	public void setHerramienta(Herramientas herramienta){
		this.herramienta = herramienta;
	}
	public void construir() {
		System.out.println("Construyendo");
		herramienta.usar();
	}
}
