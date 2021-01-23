package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Refugio {
    private List <Mamifero> mamiferos;
    private List <Reptil> reptiles;


//Constructor
    public Refugio(){
        mamiferos = new ArrayList<>();
        reptiles = new ArrayList<>();
    }

    public void agregarMamifero(Mamifero mamifero) {
        mamiferos.add(mamifero);
    }

    public List<Reptil> getReptiles() {
        return reptiles;
    }

    public void setReptiles(List<Reptil> reptiles) {
        this.reptiles = reptiles;
    }

    public List<Mamifero> getMamiferos() {
        return mamiferos;
    }

    public void setMamiferos(List<Mamifero> mamiferos) {
        this.mamiferos = mamiferos;
    }
}
