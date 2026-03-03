package PracticaUD10;

import java.util.ArrayList;

public class Inventario {
	private ArrayList<Mascotas> listaMascotas = new ArrayList();

	

	public void vaciar() {
		listaMascotas.clear();
		

	}

	public void insertarMascota(Mascotas a) {
		listaMascotas.add(a);
	}

	public void eliminarMascota(String nombrel) {
		listaMascotas.remove(nombrel); 
	}

	public void imprimirTodos() {
		
		for (Mascotas m : listaMascotas) {
			System.out.println(m.getNombrel());
		}
	}

	public void imprimirPerros() {
	
		for (Mascotas m : listaMascotas) {
			if (m instanceof Perro) {
				System.out.println(m.getNombrel());
			}
		}
	}

}
