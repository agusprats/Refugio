package adaitw.java;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	Refugio refugio = new Refugio();

	List<Mamifero> mamiferos = refugio.getMamiferos();
	List<Integer> horariosDeComidas = new ArrayList<>();

	horariosDeComidas.add(1500);
	horariosDeComidas.add(2300);

	Mamifero m = new Mamifero(juan, 1, horarioDeComidas);

	mamiferos.add(new Mamifero());

	refugio.agregarMamifero(new Mamifero());
    }
}

/*  En un refugio cuidan de perros, gatos y otros animales.
	A todos los animales que llegan se les asigna una etiqueta / collar
	con nombre, número y un listado de los horarios en los que se le da comida

	en el caso de perros y gatos, se anota si están o no vacunados.
	en el caso de tortugas se anota la edad estimada.*/