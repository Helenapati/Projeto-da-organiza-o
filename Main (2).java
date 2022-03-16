package doador;

import java.util.Scanner;
import java.util.ArrayList;

public class doador{

    private String nome;
    private int idade;
    private char genero;
     private int valor;

    public doador(String nome, int idade, char genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "doador{" + "nome=" + nome + ", idade=" + idade + ", genero=" + genero + " valor" + valor +"}";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public char getGenero() {
        return genero;
    }

    public char setGenero(char genero) {
        this.genero = genero;
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
  
}