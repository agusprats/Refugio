package adaitw.java;

import java.util.List;

public class Animal {
    protected String  nombreCollar;
    protected Integer numeroCollar;
    protected List <Integer> horarioDeComidas;

    public String getNombreCollar() {
        return nombreCollar;
    }

    public void setNombreCollar(String nombreCollar) {
        this.nombreCollar = nombreCollar;
    }

    public Integer getNumeroCollar() {
        return numeroCollar;
    }

    public void setNumeroCollar(Integer numeroColllar) {
        this.numeroCollar = numeroColllar;
    }

    public List<Integer> getHorarioDeComidas() {
        return horarioDeComidas;
    }

    public void setHorarioDeComidas(List<Integer> horarioDeComidas) {
        this.horarioDeComidas = horarioDeComidas;
    }
}
