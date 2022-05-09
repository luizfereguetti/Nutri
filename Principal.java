package com.mycompany.nutri;

import java.util.Scanner;

public class Principal {

    //Menu principal
    public static void menu() {
        int opcao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("               <<NUTRI>>");

        System.out.println("Escolha o menu");
        System.out.println("""
                           
                            1- Cadastro de Paciente 
                            2- Listar pacientes 
                            3- Cadastrar Consulta 
                            4- Listar Consulta 
                            5- Gerar Combinações Alimetares
                            6- Listar Grupos Alimentares""");

        do {
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    cadastroPaciente();
                    break;
                case 2:
                    listarPaciente();
                    break;
                case 3:
                    cadastroConsulta();
                    break;
                case 4:
                    listarConsulta();
                    break;
                case 5:
                    gerarCombinacoesAlimentares();
                    break;
                case 6:
                    listarGrupos();
                default:
                    System.out.println("Inválido");
            }
        } while (opcao != 0);
    }

    //Menu de cadastro de pacientes
    public static void cadastroPaciente() {
        Scanner ler = new Scanner(System.in);
        int quer = 1;
        int i = 0;
        do{
        System.out.println("Insira o nome do paciente: ");
        String nome = ler.nextLine();
        System.out.println("Insira o endereço: ");
        String endereco = ler.nextLine();
        System.out.println("Digite o telefone do paciente: ");
        String telefone = ler.nextLine();
        System.out.println("Digite o E-mail do paciente: ");
        String email = ler.nextLine();
        System.out.println("Digite a data de nascimento do paciente: ");
        String nascimento = ler.nextLine();
        
        Paciente paciente = new Paciente(nome, endereco, telefone, email, nascimento);
        i++;
        }while(quer != 2);
        menu();

    }

    //Chama método de listar pacientes
    public static void listarPaciente() {
        Paciente.listarPaciente();
    }
    //Menu de cadastro de consulta
    public static void cadastroConsulta() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a data da consulta: ");
        String dataConsulta = ler.nextLine();
        System.out.println("Digite o horário da consulta: ");
        String horarioConsulta = ler.nextLine();
        System.out.println("Digite o peso: ");
        String peso = ler.nextLine();
        System.out.println("Digite o percentual de gordura: ");
        String persentualDeGordura = ler.nextLine();
        System.out.println("Digete a sensação física");
        String sensacaoFisica = ler.nextLine();
        System.out.println("Restrições: ");
        String restricaoAlimentar = ler.nextLine();
        System.out.println("Restrições: ");
        //String status = ler.nextLine();

        Consulta consulta = new Consulta(dataConsulta, horarioConsulta, peso, persentualDeGordura, sensacaoFisica, restricaoAlimentar);

        menu();
    }
    //Chama método de listar consultas
    public static void listarConsulta() {
        Consulta.listarConsulta();
    }
    //Método para listar grupos de alimentos
    public static void listarGrupos() {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        Grupo1 grupo1 = new Grupo1();
        Grupo2 grupo2 = new Grupo2();
        Grupo3 grupo3 = new Grupo3();
        System.out.println("\n\nEscolha uma opção: ");
        System.out.println(" 1- Listar grupo 1");
        System.out.println(" 2- Listar grupo 2");
        System.out.println(" 3- Listar grupo 3");
        System.out.println(" 4- Listar todos os grupos");
        System.out.println(" 5- Voltar ao Menu Principal");
        opcao = entrada.nextInt();
        switch (opcao) {
            case 1 -> {
                grupo1.listaGrupo1();
                listarGrupos();
            }
            case 2 -> {
                grupo2.listaGrupo2();
                listarGrupos();
            }
            case 3 -> {
                grupo3.listaGrupo3();
                listarGrupos();
            }
            case 4 -> {
                grupo1.listaGrupo1();
                grupo2.listaGrupo2();
                grupo3.listaGrupo3();
                listarGrupos();
            }
            case 5 -> {
                menu();
            }
        }
    }
    //Método para combinar alimentros dentro do limite de calirias determinado pelo usuário
    public static void gerarCombinacoesAlimentares() {

        System.out.println("\n\nDigite a quantidade de calorias: ");
        Scanner entrada = new Scanner(System.in);

        int valor = 0;
        valor = entrada.nextInt();

        String[] lista1 = {"\nArroz", "\nArroz Integral", "\nBatata Inglesa", "\nMararrao", "\nMandioca", "\nPure De Batata"};
        String[] lista2 = {"\nIogurte Natural", "\nLeite Fermentado", "\nLeite Integral", "\nRequeijão", "\nMussarela", "\nRicota"};
        String[] lista3 = {"\nAbobrinha", "\nAlface", "\nBrocolis", "\nCouve Flor", "\nPepino", "\nTomate"};
        int[] valores1 = {80, 95, 60, 180, 100, 110};
        int[] valores2 = {40, 60, 120, 30, 105, 110};
        int[] valores3 = {120, 150, 60, 200, 160, 110};

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    int soma = valores1[i] + valores2[j] + valores3[k];
                    if (soma <= valor) {
                        System.out.println(lista1[i] + lista2[j] + lista3[k] + "\n" + soma + " Calorias");
                    }
                }
            }
        }

        menu();

    }

    public static void retornaDados() {
        System.out.println("Nome do Paciente: " + Paciente.Nome + "Endereço do Paciente: " + Paciente.Endereco);
    }

    public static void main(String[] args) {

        menu();

    }

}
