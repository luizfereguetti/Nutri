package com.mycompany.nutri;

import java.util.Arrays;

//Crianão do grupo de alimentos 2
public class Grupo2 {

    public static int IogurteIntegral;
    public static int LeiteFermentado;
    public static int LeiteIntegral;
    public static int Requeijao;
    public static int Mussarela;
    public static int Ricota;

    public Grupo2() {

        Grupo2.IogurteIntegral = 75;
        Grupo2.LeiteFermentado = 40;
        Grupo2.LeiteIntegral = 80;
        Grupo2.Requeijao = 90;
        Grupo2.Mussarela = 140;
        Grupo2.Ricota = 30;

    }

    String[] lista2 = {"\nIogurte Natural" + Grupo2.IogurteIntegral, "\nLeite Fermentado" + Grupo2.LeiteFermentado, "\nLeite Integral" + Grupo2.LeiteIntegral, "\nRequeijão" + Grupo2.Requeijao, "\nMussarela" + Grupo2.Mussarela, "\nRicota" + Grupo2.Ricota};

    // Lista o grupo 2 de alimentos
    public String[] listaGrupo2() {
        System.out.println("\n\nGrupo 2 de alimentios: " + Arrays.toString(lista2));
        return lista2;
    }
}
