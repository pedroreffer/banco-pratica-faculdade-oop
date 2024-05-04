package br.com.bancopan;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc =  new Scanner(System.in);
        Cliente cliente = new Cliente("Lady Gaga", "12234567899");
        Conta conta = new Conta(cliente, 10000);
        System.out.println(" 1 - informações do cliente");
        System.out.println(" 2 - deposito");
        System.out.println(" 3 - retirada");
        System.out.println(" 4 - saldo");
        System.out.println(" 5 - sair");
        int interecao = sc.nextInt();
        do{
            switch (interecao){
                case 1:
                    System.out.println("----------- Informações do cliente ------------");
                    System.out.println(conta.getCliente().toString());
                    break;
                case 2:
                    System.out.println("----------- Depósito ------------");
                    double valor = sc.nextDouble();
                    conta.deposito(valor);
                    System.out.println("Deposito realizado!!!!!!!!!!");
                    break;
                case 3:
                    System.out.println("----------- Retirada ------------");
                    valor = sc.nextDouble();
                    conta.retirada(valor);
                    System.out.println("Retirada Realizado!!!!");
                    break;
                case 4:
                    System.out.println("----------- Saldo ------------");
                    System.out.println(conta.getSaldo());
                    break;
            }
            interecao = sc.nextInt();
        }while (interecao !=0);
        System.out.println("-------------- See you later ---------------");
    }
}

class Conta {
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void deposito(double valor){
      this.saldo = this.saldo + valor;
    }

    public void retirada(double valor){
        this.saldo = this.saldo - valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

class Cliente{
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
