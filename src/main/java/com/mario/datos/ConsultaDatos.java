package com.mario.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class ConsultaDatos {
	

	public List<String> consultaCoches() throws IOException {
		List<String> datos = new ArrayList<>();
		File file = new File("C:\\Users\\201912\\Desktop\\Coches.txt");
		BufferedReader lector = new BufferedReader(new FileReader(file));
		String lineas;
		while((lineas = lector.readLine()) != null) {
			String []arrayPersona= lineas.split("-");
			datos.add(arrayPersona[0]);
		}
		lector.close();
		return datos;
		
	}

	
	
}
