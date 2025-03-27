package com.app.ioc;

public class Obrero {
	Herramientas herramienta;
	public void setHerramienta(Herramientas herramienta){
		this.herramienta = herramienta;
	}
	//Creamos el método que llame a la dependencia
	public void construir() {
		System.out.println("Construyendo");
		herramienta.usar();
	}
}
