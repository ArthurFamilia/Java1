import java.util.Scanner;

public class App {

    private static double getSaldoReais;
    private static double getSaldoDolar;
    private static double getSaldoBtc;

    public static void main(String[] args) throws Exception {

        ContaBancaria contaBancaria = new ContaBancaria();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");

        String titular = scanner.nextLine();

        contaBancaria.setTitular(titular);

        System.out.println("Olá " + titular + "\nDigite 1 para saldo \nDigite 2 para sacar \nDigite 3 para depositar");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Seu saldo em Reais é: R$" + contaBancaria.getSaldoReais());
                System.out.println("Seu saldo em Dólares é: $" + contaBancaria.getSaldoDolar());
                System.out.println("Seu saldo em Bitcoins é: " + contaBancaria.getSaldoBtc() + " BTC");
                break;
            case 2:
                withdraw(contaBancaria);
                break;
            case 3:
                deposit(contaBancaria);
                break;
            default:
                System.out.println("Opção inválida.");
        }

    }

    public static void withdraw(ContaBancaria contaBancaria) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá " + contaBancaria.getTitular() + "\nDigite 1 para Real \nDigite 2 para Dolar \nDigite 3 para BTC");
        int withdraw = scanner.nextInt();
        
        
        System.out.println("Digite o valor do saque:");
        if (withdraw == 1) {
            double num1 = scanner.nextDouble();
            if (num1 <= contaBancaria.getSaldoReais()){contaBancaria.setSaldoReais(contaBancaria.getSaldoReais() - num1);
                System.out.println("seu saldo é " + contaBancaria.getSaldoReais());}
            else{System.out.println("Sem saldo.");}
        } else if (withdraw == 2) {
            double num1 = scanner.nextDouble();
            if (num1<= contaBancaria.getSaldoDolar()){contaBancaria.setSaldoDolar(contaBancaria.getSaldoDolar() - num1);}
            else{System.out.println("Sem saldo.");}
        } else if (withdraw == 3) {
            double num1 = scanner.nextDouble();
            if (num1<= contaBancaria.getSaldoBtc()){contaBancaria.setSaldoBtc(contaBancaria.getSaldoBtc() - num1);}
            else{System.out.println("Sem saldo.");}
        } else {
            System.out.println("Opção inválida.");
        }
    }


        public static void deposit(ContaBancaria contaBancaria){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Olá " + contaBancaria.getTitular() + "\nDigite 1 para Real \nDigite 2 para Dolar \nDigite 3 para BTC");
            int deposit = scanner.nextInt();
            
            
            System.out.println("Digite o valor do depósito:");
            if (deposit == 1) {
                double num1 = scanner.nextDouble();
                contaBancaria.setSaldoReais(contaBancaria.getSaldoReais() + num1);
                System.out.println("seu saldo é " + contaBancaria.getSaldoReais());
                
            } else if (deposit == 2) {
                double num1 = scanner.nextDouble();
                contaBancaria.setSaldoDolar(contaBancaria.getSaldoDolar() + num1);
                System.out.println("seu saldo é " + contaBancaria.getSaldoDolar());
            } else if (deposit == 3) {
                double num1 = scanner.nextDouble();
                contaBancaria.setSaldoBtc(contaBancaria.getSaldoBtc() + num1);
                System.out.println("seu saldo é " + contaBancaria.getSaldoBtc());
            } else {
                System.out.println("Opção inválida.");
            }
    
        }
    
    }