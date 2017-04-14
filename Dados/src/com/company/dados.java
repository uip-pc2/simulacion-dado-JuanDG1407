package com.company;

public class dados {
    private Integer lanzar;


    public dados() {

        this.lanzar = 1 + (int)(Math.random() * ((6 - 1) + 1));

    }


    public Integer getLanzar() {
        return lanzar;
    }

    public int lanzamiento() {
        System.out.println("\nSimulacion De Dados");
        System.out.println("Lanzando Dados.........");
        double probabilidad_lanzar = Math.random();
        System.out.println("Te salio el numero: " +lanzar);
        System.out.println("Incluyendo a la lista de resultados ");

        return 0;
    }
}
