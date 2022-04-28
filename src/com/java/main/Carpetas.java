package com.java.main;

import java.io.File;

public class Carpetas {
	

	
	public Carpetas() {
			
	}
	
	public void crearCarpetas(String ruta, String nombre) {
		
		
		File raiz = new File(ruta);
		if (raiz.exists() && raiz.canWrite()) {
			
			File carpeta = new File (ruta+ nombre);
			
			carpeta.mkdir(); //crea la carpeta en la ruta
			
			for (int i = 1; i < 11; i++) {
				File carpeta2 = new File (carpeta.getAbsolutePath()+"/tmp"+i);
				carpeta2.mkdir();
				
				new File(carpeta2.getAbsolutePath()+"/tmp1").mkdir();
				new File(carpeta2.getAbsolutePath()+"/tmp2").mkdir();

			}
		}

		
	}
	
	
	

}
