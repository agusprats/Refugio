package adaitw.java;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    protected String  nombre;
    protected Integer numeroCollar;
    protected List <Integer> horariosDeComidas;
    protected Boolean vacunado;
    protected Integer edadEstimada;

    // Primera forma
    public Animal(String nombre, Integer numeroId, List<Integer> horariosDeComidas) {
        this.nombre = nombre;
        this.numeroCollar= numeroId;
        this.horariosDeComidas = horariosDeComidas;
    }

    // Segunda forma
    public Animal(String nombre, Integer numeroId, String horariosDeComidas) {
        this.nombre = nombre;
        this.numeroCollar= numeroId;
        this.horarioDeComidas = horarioDeComidas;
        this.horariosDeComidas = new ArrayList<>();
    }



    public Integer getNumeroCollar() {
        return numeroCollar;
    }

    public void setNumeroCollar(Integer numeroColllar) {
        this.numeroCollar = numeroColllar;
    }

    public List<Integer> getHorariosDeComidas() {
        return horariosDeComidas;
    }

    public void setHorariosDeComidas(List<Integer> horariosDeComidas) {
        this.horariosDeComidas = horariosDeComidas;
    }
}
