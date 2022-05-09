package com.mycompany.nutri;

import java.util.Arrays;

//Crianão do grupo de alimentos 1
public class Grupo1 {

    public static int Arroz;
    public static int ArrozIntegral;
    public static int BatataInglesa;
    public static int Macarrao;
    public static int Mandioca;
    public static int PureDeBatata;

    public Grupo1() {

        Grupo1.Arroz = 50;
        Grupo1.ArrozIntegral = 30;
        Grupo1.BatataInglesa = 85;
        Grupo1.Macarrao = 160;
        Grupo1.Mandioca = 100;
        Grupo1.PureDeBatata = 120;

    }

    String[] lista1 = {"\nArroz" + Grupo1.Arroz, "\nArroz Integral" + Grupo1.ArrozIntegral, "\nBatata Inglesa" + Grupo1.BatataInglesa, "\nMararrao" + Grupo1.Macarrao, "\nMandioca" + Grupo1.Mandioca, "\nPure De Batata" + Grupo1.PureDeBatata};
    
    // Lista o grupo 1 de alimentos
    public String[] listaGrupo1() {

        System.out.println("\n\nGrupo 1 de alimentios: " + Arrays.toString(lista1));
        return null;
    }

    public static void combinaArrays() {

    }
}
