package PracticaUD10;

public class Main {

	public static void main(String[] args) {
		Inventario miInventario = new Inventario();

		Perro r = new Perro("Rocky", 1, "OK", "11022017");
		Gato g = new Gato("Negro", 2, "OK", "05012016");
		System.out.println(r.getNombrel());
		System.out.println(g.getEstado());
		Inventario i = new Inventario();
		i.insertarMascota(r);
		i.insertarMascota(g);
		i.imprimirTodos();
		i.imprimirPerros();
		i.vaciar();
		i.imprimirTodos();
		i.imprimirPerros();

	}

}
