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
public class Venta {
    private int numVenta;
    ArrayList<Equipo> equipos = new ArrayList<>();
    private double precioTotal;
    public Venta(int numVenta, ArrayList<Equipo> equipos){
        this.numVenta = numVenta;
        this.equipos = equipos;
        double sum = 0;
        for(Equipo e:equipos)
            sum += e.getPrecio();
        this.precioTotal = sum;
    }    
}
