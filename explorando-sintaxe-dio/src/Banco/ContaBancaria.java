package Banco;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saldo Inicial");
        double saldoInicial = scanner.nextDouble();

        double saldoAtual = saldoInicial;

        System.out.println("escolha sua opção: \n 1: Deposito \n 2: Saque \n 3: tela inicial");
        int opcao = scanner.nextInt();

        for (int i = 0; i < 3 ; i++) {
            switch (opcao) {
                case 1:
                    System.out.println("Valor deposito:");
                    double valorDeposito = scanner.nextDouble();

                    saldoAtual+= valorDeposito;

                    System.out.println("deposito feito com sucesso! \n você quer depositar novamente, saque ou tela inicial \n 1: Deposito \n 2: Saque \n 3: Tela Inicial");
                    opcao = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("quanto você quer sacar?");
                    double valorSaque = scanner.nextDouble();

                    saldoAtual -= valorSaque;

                    System.out.println("saque concluido, sacar novamente, depositar ou tela inicial? 1: Sacar novamente \n 2: Depositar \n 3: tela inicial");
                    opcao = scanner.nextInt();
                default:
                    if (i == 0) {
                        System.out.println("Tela Inicial");
                        break;
                    }
            }
        }
        System.out.println("Saldo Inicial: "+saldoInicial);
        System.out.println("Saldo Atual: "+saldoAtual);



        scanner.close();





    }





}
