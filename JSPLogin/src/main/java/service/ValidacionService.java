package service;

import java.util.ArrayList;
import java.util.List;

import models.Perfil;

public class ValidacionService {
	private static List<Perfil> perfiles = new ArrayList<Perfil>(
			List.of(new Perfil("Nacho", "nacho123", "nacho@viewnext.com", 25), 
					new Perfil("Chesa", "chesa123", "chesa@viewnext.com", 26), 
					new Perfil("Juan", "juan123", "juan@viewnext.com", 58),
					new Perfil("Pepito", "pepito123", "pepito@viewnext.com", 34)));

	// Devuelve un perfil si existe y el par nombre contresaña coinciden, en otro caso devuelve null
	public static Perfil validar(String nombre, String password) {
		Perfil validado = null;
		
		for(Perfil p : perfiles)
		{
			if(p.getNombre().equals(nombre) && p.getPassword().equals(password))
				validado = p;
		}
		
		return validado;
	}
}
