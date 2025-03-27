package com.app.ioc;

public class Main {
	public static void main(String[] args) {
		//Creamos las instancias de las herramientas
		Martillo martillo = new Martillo();
		Destornillador destornillador = new Destornillador();
		
		//Creamos la instancia del obrero 
		Obrero obrero = new Obrero();
		
		//Inyectamos una dependencia
		obrero.setHerramienta(destornillador);
		obrero.construir();//Salida: Construyendo Usando Destornillador
		
		//Cambiamos la dependencia
		obrero.setHerramienta(martillo);
		obrero.construir();//Salida: Construyendo Usando Martillo
		
	}
}
