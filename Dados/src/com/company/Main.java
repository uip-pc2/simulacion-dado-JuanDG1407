package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<dados> lista_dados = new ArrayList<dados>();

        while(true) {
            int opcion = 0;

            System.out.println("\nSimulacion De Dados");
            System.out.println("1. Lanzar");
            System.out.println("2. Ver resultados");
            System.out.println("3. Salir");

            try {
                System.out.print("OPCION: ");
                opcion = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.err.println("ERROR: Opción inválida.");
            }

            switch (opcion) {
                case 1:
                    dados d = new dados();
                    int estado = d.lanzamiento();

                    if (estado == 0)
                        lista_dados.add(d);
                    break;
                case 2:
                    if (lista_dados.size() == 0)
                        System.out.println("No haz hecho lanzamientos aún");
                    else System.out.println("\nTus resultados: "); {for (dados dd : lista_dados) {

                    System.out.println(Math.round(dd.getLanzar()));
                }
                }
                break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR: Opción inválida");
            }
        }
    }
}