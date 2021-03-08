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
public class Gato extends AnimalConNombre {
    
    public Gato (String nombre) {
        super(nombre, 5, 500, 25);
    }
    
    public boolean cazarPajaro(Pajaro pajaro) {
        correr();
        pajaro.volar();
        if (0 == (int) (10 * Math.random())) {
            return true;
        }
        pajaro.escapa();
        return false;
    }
    
    public void comerPajaro(Pajaro pajaro) {
        if (cazarPajaro(pajaro)) {
            incrementarEnergia(pajaro.drenar());
        }
    }
    
    public void atacado (int energiaQuePierde) {
        incrementarEnergia(energiaQuePierde);
    }
    
    @Override
    public String toString() {
        return "Gato: " + super.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Gato) {
            return super.equals(o);
        }
        return false;
    }   
 }
    

