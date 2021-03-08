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
public class Ejercicio3tarea6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro("Atila");
        Perro perro2 = new Perro("Piloto");
        
        Gato gato1 = new Gato("Kitty");
        Gato gato2 = new Gato("Tareco");
        Gato gato3 = new Gato("Pantufa");
        
        Pajaro[] pajaros = new Pajaro[20];
        for (int i = 0; i < pajaros.length; i++) {
            pajaros[i] = new Pajaro();
        }
        
        Raton[] ratones = new Raton[50];
        for (int i = 0; i < ratones.length; i++) {
            ratones[i] = new Raton();
        }
        
        System.out.println("INICIALMENTE");
        mostrarEstadoDeTodos(perro1, perro2, gato1, gato2, gato3, pajaros, ratones);
        
        perro1.correr();
        perro2.atacaGato(gato1);
        gato2.comerPajaro(pajaros[2]);
        gato3.comerPajaro(pajaros[9]);
        gato3.comerRaton(ratones[0]);
        perro2.comerRaton(ratones[1]);
        ratones[3].correr();
        
        System.out.println("##################################################");
        System.out.println("DESPUES");
        mostrarEstadoDeTodos(perro1, perro2, gato1, gato2, gato3, pajaros, ratones);
                        
    }

    private static void mostrarEstadoDeTodos(Perro perro1, Perro perro2, Gato gato1, Gato gato2, Gato gato3, Pajaro[] pajaros, Raton[] ratones) {
        System.out.println(perro1);
        System.out.println(perro2);
        System.out.println(gato1);
        System.out.println(gato2);
        System.out.println(gato3);
        
        for (int i = 0; i < pajaros.length; i++) {
            System.out.println(pajaros[i]);
        }
        
        for (int i = 0; i < ratones.length; i++) {
            System.out.println(ratones[i]);
        }
    }
    
}
