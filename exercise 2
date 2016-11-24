/**
 * Created by jaime.escribano on 24/11/2016.
 */
package exercise2;

import java.util.Arrays;
import java.util.Scanner;


public class avitivy2{
    public enum Metodo {MEDIA,MAX,MIN};
    public static void main(String args[]){

        double[] alumnos;
        alumnos = new double[10];
        char[] input = new char[20];
        Metodo metodo;
        double sum = 0;

        for(int i=0; i <10;i++){
            alumnos[i] = Math.random() * 10;
        }

        metodo = Metodo.MEDIA;




        for(int i=0; i <10; i++){
            Arrays.sort(alumnos);
        }

        for(int i=0; i <10; i++) {
            System.out.println(alumnos[i]);
        }
        switch (metodo){
            case MAX:
                System.out.println("Nota máxima" + alumnos[9]);
                break;
            case MIN:
                System.out.println("Nota Mínima:" + alumnos[0]);
                break;
            case MEDIA:
            {
                for(int i=0; i< 10; i++){
                sum += alumnos[i];
            }
                sum = sum/alumnos.length;
                System.out.println("la media es" + sum);
            }

        }
    }
}

//Este código no prevee que el usuario introduzca su preferencia de funcionamiento por lo que no es exactamente perfecto. Aprenderé a hacer eso más adelante
