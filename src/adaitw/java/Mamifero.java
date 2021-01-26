package adaitw.java;

import java.util.List;

public class Mamifero extends Animal{

    public Mamifero(String nombre, Integer numeroId, String horarioDeComidas){
        super(nombre, numeroId, horarioDeComidas);
    }
    public Mamifero(String nombre, Integer numeroId, String horarioDeComidas, Boolean vacunado){
        super(nombre, numeroId, horarioDeComidas, vacunado);

    }
    public Mamifero(String nombre, Integer numeroId, List<Integer> horariosDeComidas) {
        super(nombre, numeroId, horariosDeComidas);
    }
    private boolean vacunado;

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "nombre='" + nombre + '\'' +
                ", numeroCollar=" + numeroCollar +
                ", horariosDeComidas=" + horariosDeComidas +
                ", vacunado=" + vacunado +
                '}';
    }
}
