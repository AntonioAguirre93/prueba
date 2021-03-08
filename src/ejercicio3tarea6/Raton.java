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
public class Raton extends Animal {
    
    public Raton() {
        super(50, 5);
    }
    
    public void escapa() {
        incrementarEnergia(5);
    }
    
    public int drenar() {
        int energia = getEnergia();
        setEnergia(0);
        return energia;
    }
    
    public String toString() {
        return "Ratón: " + super.toString();
    }
    
    public boolean equals(Object o) {
        if (o instanceof Raton) {
            return super.equals(o);
        }
        return false;
    }
    
}
