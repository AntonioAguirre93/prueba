/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3tarea6;

/**
 *
 * @author antonio
 */
public class Pajaro extends Animal {
    
    public Pajaro() {
        
        super(20,2);
    }
    
    public boolean volar() {
        return correr();
    }
    
    public void escapa() {
        incrementarEnergia(5);
    }
    
    public int drenar() {
        int energia = getEnergia();
        setEnergia(0);
        return energia;
    }
    
    @Override
    public String toString() {
        return "Pájaro: " + super.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Pajaro) {
            return super.equals(o);
        }
        return false;
    }   
    
}
