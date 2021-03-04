/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_iibimestre;
import java.util.ArrayList;

/**
 *
 * @author Jerson Andino
 */
public class Compra {
    private int numCompra;
    ArrayList<Equipo> equipos = new ArrayList<>();
    private double precioTotal;
    public Compra(int numCompra, ArrayList<Equipo> equipos){
        this.numCompra = numCompra;
        this.equipos = equipos;
        double sum = 0;
        for(Equipo e:equipos)
            sum += e.getPrecio();
        this.precioTotal = sum;
    }  
}
