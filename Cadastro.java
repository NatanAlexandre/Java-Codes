package br.com.fecaf.ads3na.media;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args){

        try {
            // Variaveis

            Scanner scanner = new Scanner(System.in);
            boolean valido = false;
            ArrayList<String> nome_lista = new ArrayList<>();
            String cpf = "";
            String email = "";
            boolean valido_cpf = false;
            boolean valido_senha = false;
            String senha = "";

            //

            System.out.println("Cadastro de Usuários");
            String name = null;
            while (!valido) {
                linha();
                System.out.print("Digite seu nome completo: ");
                String[] nome = scanner.nextLine().toLowerCase().strip().split(" ");
                name = "";
                int n = 0;
                if (contemNumeros(nome)) {
                    linha();
                    System.out.println("Não pode ser digitado números! Digite Novamente.");
                } else {
                    valido = true;
                    for (String i : nome) {
                        if (i.contains("da") || i.contains("de") || i.contains("di") || i.contains("do") || i.contains("du")) {
                            nome_lista.add(i);
                            name += nome_lista.get(n);
                            name += " ";
                            n += 1;
                        } else {
                            String cap = i.substring(0, 1).toUpperCase() + i.substring(1);
                            nome_lista.add(cap);
                            name += nome_lista.get(n);
                            name += " ";
                            n += 1;
                        }
                    }

                }

            }

            while (!valido_cpf) {
                linha();
                System.out.print("Digite seu CPF: ");
                cpf = scanner.nextLine();
                if (contemLetras(cpf)) {
                    System.out.println("CPF inválido! Digite novamente.");
                } else {
                    valido_cpf = true;
                }
            }

            linha();
            System.out.print("Digite seu E-mail: ");
            email = scanner.nextLine().strip().toLowerCase();
            while (!email.contains("@") || !email.contains(".") || email == "") {
                linha();
                System.out.println("E-mail inválido! Digite novamente.");
                linha();
                System.out.print("Digite seu E-mail: ");
                email = scanner.nextLine().strip().toLowerCase();
            }

            while (!valido_senha) {
                linha();
                System.out.print("Digite sua nova senha: ");
                senha = scanner.nextLine();
                if (validarSenha(senha)) {
                    valido_senha = true;
                } else {
                    linha();
                    System.out.println("Senha Inválida! A senha precisa conter:\n* Letra Maiúscula\n* Letra Minúscula\n* Números\n* Caractere Especial: !@#%&");
                }
            }

            linha();
            String message = String.format("Dados Cadastrais:\n* %s\n* %s\n* %s\n* %s", name, cpf, email, senha);
            System.out.println(message);
            linha();

        } catch (Exception exception) {
            linha();
            System.out.println("Ocorreu um erro!");
            linha();
        }
    }

    public static boolean contemNumeros(String[] texto){

        for (String palavra : texto) {
                for (char c : palavra.toCharArray()){
                    if (Character.isDigit(c)){
                        return true;
                    }
            }
        }

        return false;
    }

    public static boolean contemLetras(String cpf){

            for (char c : cpf.toCharArray()){
                if (Character.isLetter(c)){
                    return true;
                }
            }

            if (cpf.length() != 11){
                return true;
            }

        return false;
    }

        public static boolean validarSenha(String senha){

            boolean maiusculo = false;
            boolean minusculo = false;
            boolean numero = false;
            boolean caractere = false;

            for (char c : senha.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    maiusculo = true;
                } else if (Character.isLowerCase(c)) {
                    minusculo = true;
                } else if (Character.isDigit(c)) {
                    numero = true;
                } else if (c == '@' || c == '!' || c == '#' || c == '%' || c == '&') {
                    caractere = true;
                }

                if (maiusculo && minusculo && numero && caractere) {
                    return true;
                }
            }

            return false;
        }

        public static void linha(){
            System.out.println("-".repeat(30));
        }

    }