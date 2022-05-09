package com.mycompany.nutri;

import java.util.Arrays;

public class Consulta {

    public static String DataConsulta;
    public static String HorarioConsulta;
    public static String Peso;
    public static String PersentualDeGordura;
    public static String SensacaoFisica;
    public static String RestricaoAlimentar;

    public Consulta(String dataConsulta, String horarioConsulta, String peso, String persentualDeGordura, String sensacaoFisica, String restricaoAlimentar) {

        Consulta.DataConsulta = dataConsulta;
        Consulta.HorarioConsulta = horarioConsulta;
        Consulta.Peso = peso;
        Consulta.PersentualDeGordura = persentualDeGordura;
        Consulta.SensacaoFisica = sensacaoFisica;
        Consulta.RestricaoAlimentar = restricaoAlimentar;

    }
    
    //Método de listar consultas
    public static void listarConsulta() {

        String[] listaConsultas = {"\nNome: " + Consulta.DataConsulta, Consulta.HorarioConsulta, Consulta.Peso, Consulta.PersentualDeGordura, Consulta.SensacaoFisica, Consulta.RestricaoAlimentar};
        System.out.println("Consultas: " + Arrays.toString(listaConsultas));

    }
}
