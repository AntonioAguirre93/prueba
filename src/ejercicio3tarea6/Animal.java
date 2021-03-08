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
public class Animal {
    /*Energía base de l animal*/
    private final int energiaBase;
    /*energía que tiene*/
    private int energia;
    /*energía que gasta corriendo*/
    private final int gastoEnergiaAlCorrer;
    
    public Animal(int energiaBase, int energia, int gastoEnergiaAlCorrer) {
        
        this.energiaBase = energiaBase;
        /* Al crearlo no puede tener una energía superior a la energía Base pero si inferior*/
        this.energia = Math.min(energia, energiaBase);
        /* NO se puede crear con un gasto de energía superior a la energía base*/
        this.gastoEnergiaAlCorrer = Math.min(gastoEnergiaAlCorrer, energiaBase);
     
    }
    
    public Animal(int energiaBase, int gastoEnergiaAlCorrer) {
        
        this(energiaBase, energiaBase, gastoEnergiaAlCorrer);
    }
    
    public int getEnergiaBase() {
        
        return energiaBase;
    }
    
    public int getEnergia() {
        
        return energia;
    }

    public int getGastoEnergiaAlCorrer() {
       
        return gastoEnergiaAlCorrer;
    }

    public void setEnergia(int energia) {
        
        this.energia = energia;
    }
    
    public void incrementarEnergia(int delta) {
        
        setEnergia(getEnergia() + delta);
    }
    
    public boolean correr() {
        if (getEnergia() >= getGastoEnergiaAlCorrer()) {
            return false;
        }
        setEnergia(getEnergia() - getGastoEnergiaAlCorrer());
        return true;
    }
    
    public void dormir() {
        
        setEnergia(getEnergiaBase());
    }
    
    @Override
    public String toString() {
        return "energía base: "+ getEnergiaBase() +
               "energía restante: "+ getEnergia() +
               "energía al correr: " + getGastoEnergiaAlCorrer();
    }
    
    @Override
    public boolean equals (Object o) {
        boolean resultado = false;
        if (o instanceof Animal) {
            Animal animal = (Animal) o;
            resultado = getEnergiaBase() == animal.getEnergiaBase() &&
                    getEnergia() == animal.getEnergia() &&
                    getGastoEnergiaAlCorrer() == animal.getGastoEnergiaAlCorrer();
        }
        return resultado;
    }
    
    
    
}
