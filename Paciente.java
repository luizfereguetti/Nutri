package com.mycompany.nutri;

import java.util.Arrays;
import java.util.Date;

public class Paciente {

    public static String Nome;

    public static String Endereco;

    public static String Telefone;

    public static String Email;

    public static String Nascimento;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public Paciente(String nome, String endereço, String telefone, String email, String nascimento) {

        this.Nome = nome;
        this.Endereco = endereço;
        this.Telefone = telefone;
        this.Email = email;
        this.Nascimento = nascimento;
    }

    public static void listarPaciente() {
        int quer = 0;
        do{
        String[] listaPacientes = {"\nNome: " + Paciente.Nome, Paciente.Telefone, Paciente.Email, Paciente.Endereco, Paciente.Nascimento};
        System.out.println("Pacientes: " + Arrays.toString(listaPacientes));
        
        }while(quer != 2);
    }
}
