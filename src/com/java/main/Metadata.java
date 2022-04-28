package com.java.main;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;

public class Metadata {
	
	private String ruta;
	private boolean esDirectorio;
	private boolean esFichero;
	private LocalDateTime date;
	private boolean lectura;
	private boolean escritura;
	private boolean ejecucion;
	private String[] contenido;


	public Metadata(String path) {
		File archivo = new File(path);
		if(archivo.exists()) {
			
			this.ruta = path;
			this.esDirectorio = archivo.isDirectory();
			this.esFichero = archivo.isFile();
			
			this.date = LocalDateTime.ofInstant(new Date(archivo.lastModified()).toInstant(), ZoneId.systemDefault());
			//this.date = archivo.lastModified();
			this.lectura = archivo.canRead();
			this.escritura = archivo.canWrite();
			this.ejecucion = archivo.canExecute();
			this.contenido = archivo.list();
		}
	}


	@Override
	public String toString() {
		File archivo = new File(this.ruta);
		String mensaje = "";
		
		if(archivo.isDirectory()) {
			mensaje= "Metadata: Directorio, con última modificación = " + date + ", lectura="
					+ lectura + ", escritura=" + escritura + ", ejecucion=" + ejecucion + ", contenido = "
					+ Arrays.toString(contenido);
		}else if(archivo.isFile()) {
			mensaje= "Metadata: Fichero, con última modificación = " + date + ", lectura = "
					+ lectura + ", escritura = " + escritura + ", ejecucion = " + ejecucion;
		}
				
		return mensaje;
	}

	
	
}
