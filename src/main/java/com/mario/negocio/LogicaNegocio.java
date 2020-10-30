package com.mario.negocio;
import java.io.IOException;
import java.util.List;

import com.mario.datos.ConsultaDatos;

public class LogicaNegocio {
	

public Integer calculaCoches( String nombre) throws IOException {
	
		Integer cochesTotales=0;
		
		ConsultaDatos consultaDatos = new ConsultaDatos();
		List<String> datos = consultaDatos.consultaCoches();
		for (String consultaDatos2 : datos) {
			if(consultaDatos2.contentEquals(nombre)) {
				cochesTotales++;
			}
		}
		return cochesTotales;
	}
	
}
