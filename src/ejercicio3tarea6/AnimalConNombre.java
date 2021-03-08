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
public class AnimalConNombre  extends Animal {
    
    private String nombre;
    
    private int ratioDeCapturas;
    
    public AnimalConNombre( String nombre, int ratioDeCapturas, int energiaBase, int energia, int gastoEnergiaAlCorrer) {

            super(energiaBase, energia, gastoEnergiaAlCorrer);
            this.nombre = nombre;
            this.ratioDeCapturas = ratioDeCapturas;
    }
    
     public AnimalConNombre( String nombre, int ratioDeCapturas, int energiaBase, int gastoEnergiaAlCorrer) {

            super(energiaBase, gastoEnergiaAlCorrer);
            this.nombre = nombre;
            this.ratioDeCapturas = ratioDeCapturas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRatioDeCapturas() {
        return ratioDeCapturas;
    }
     
    public boolean capturarRaton(Raton raton) {
        correr();
        raton.correr();
        if(0 == (int) (getRatioDeCapturas() * Math.random())) {
            return true;
        }
        return false;
    }
    
    public void comerRaton(Raton raton) {
        
    }
    
    public String toString() {
        return getNombre() + ", "+ super.toString();
    }
    
    public boolean equals(Object o) {
        if (o instanceof AnimalConNombre) {
            AnimalConNombre animal = (AnimalConNombre) o;
            return super.equals(o) && getNombre().equals(animal.getNombre());
        }
        return false;
    }
}
