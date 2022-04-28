package com.java.main;

import java.io.File;

public class Archivos {
	
	
	public static void main(String[] args) {

		
		
		
//		File fichero = new File ("/home/estudiante/fichero");
//		
//		
//		System.out.println(fichero.exists());
//		fichero.mkdir();
//		
//		System.out.println(fichero.isFile());
//		System.out.println(fichero.length());
//		System.out.println(fichero.getAbsolutePath());
//		System.out.println(fichero.getName());
		
		//Carpetas ejercicio = new Carpetas();
		//ejercicio.crearCarpetas("/home/estudiante/", "carpeta");
		
		Metadata meta = new Metadata("/home/estudiante/");
		System.out.println(meta);
	}

}
