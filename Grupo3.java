package com.mycompany.nutri;

import java.util.Arrays;

//Crianão do grupo de alimentos 3
public class Grupo3 {

    public static int Abobrinha;
    public static int Alface;
    public static int Brocolis;
    public static int CouveFlor;
    public static int Pepino;
    public static int Tomate;

    public Grupo3() {

        Grupo3.Abobrinha = 40;
        Grupo3.Alface = 20;
        Grupo3.Brocolis = 40;
        Grupo3.CouveFlor = 60;
        Grupo3.Pepino = 40;
        Grupo3.Tomate = 35;

    }

    String[] lista3 = {"\nAbobrinha" + Grupo3.Abobrinha, "\nAlface" + Grupo3.Alface, "\nBrocolis" + Grupo3.Brocolis, "\nCouve Flor" + Grupo3.CouveFlor, "\nPepino" + Grupo3.Pepino, "\nTomate" + Grupo3.Tomate};

    // Lista o grupo 3 de alimentos
    public String[] listaGrupo3() {
        System.out.println("\n\nGrupo 3 de alimentios: " + Arrays.toString(lista3));
        return lista3;
    }
}
