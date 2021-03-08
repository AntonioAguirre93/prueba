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
public class Perro extends AnimalConNombre {
    
    public Perro (String nombre) {
        super(nombre, 25, 1000, 50);
    }
    
    public void atacaGato(Gato gato) {
        incrementarEnergia(-100);
        gato.atacado(25);
    }
    
    @Override
    public String toString() {
        return "Perro: " + super.toString();
    }
    
    public boolean equals(Object o) {
        if (o instanceof Perro) {
            return super.equals(o);
        }
        return false;
    }   
}
