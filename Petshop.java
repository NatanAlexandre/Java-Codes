package br.com.fecaf.ads3na.media;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Petshop {

    public static void main (String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            String namePet = "";
            boolean empty = false;
            ArrayList<String> nomePet_lista = new ArrayList();
            int n = 0;
            ArrayList<String> nome_lista = new ArrayList();
            boolean validar_nome = false;
            String rg = "";
            boolean validar_rg = false;
            boolean validar_raca = false;
            boolean opcao = false;
            float valor = 0;
            String raca = "";
            String raca_cap = "";

            linha();
            System.out.println("PetShop Dog Show");
            linha();
            while (!empty){
                System.out.print("Digite o nome do seu Pet: ");
                String[] nomePet = scanner.nextLine().strip().toLowerCase().split(" ");
                if (ValidarEmpty(nomePet)){
                    linha();
                    System.out.println("O nome não pode estar vazio");
                    linha();
                } else {
                    empty = true;
                    for (String i : nomePet){
                        if (i.contains("da") || i.contains("de") || i.contains("di") || i.contains("do") || i.contains("du") || i.contains("e") && i.length() == 1){
                            nomePet_lista.add(i);
                            namePet += nomePet_lista.get(n);
                            namePet += " ";
                            n ++;
                        } else {
                            String cap = i.substring(0, 1).toUpperCase() + i.substring(1);
                            nomePet_lista.add(cap);
                            namePet += nomePet_lista.get(n);
                            namePet += " ";
                            n ++;
                        }
                    }
                }
            }
            linha();
            while (!validar_raca){
                System.out.print("Digite a Raça do seu Pet: ");
                raca_cap = scanner.nextLine().strip();
                linha();
                if (Vazio(raca_cap)){
                    System.out.println("Raça Inválida!");
                    linha();
                } else {
                    validar_raca = true;
                    raca = raca_cap.substring(0, 1).toUpperCase() + raca_cap.substring(1);
                }
            }

            n = 0;
            String name = "";
            String dog_cat = "";

            while (!validar_nome) {
                System.out.print("Digite o nome do Responsável: ");
                String[] nome = scanner.nextLine().strip().toLowerCase().split(" ");
                if (ValidarNome(nome)) {
                    linha();
                    System.out.println("O nome digitado é inválido!");
                    linha();
                } else {
                    validar_nome = true;
                    for (String i : nome) {
                        if (i.contains("da") || i.contains("de") || i.contains("di") || i.contains("do") || i.contains("du") || i.contains("e") && i.length() == 1) {
                            nome_lista.add(i);
                            name += nome_lista.get(n);
                            name += " ";
                            n ++;
                        } else {
                            String cap = i.substring(0, 1).toUpperCase() + i.substring(1);
                            nome_lista.add(cap);
                            name += nome_lista.get(n);
                            name += " ";
                            n ++;
                        }
                    }
                }
            }

            while (!validar_rg){
                linha();
                System.out.print("Digite o RG do responsável: ");
                rg = scanner.nextLine();
                if (rg.isEmpty()){
                    linha();
                    System.out.println("Campo Obrigatório!");
                } else if (ValidarRg(rg)){
                    linha();
                    System.out.println("RG Inválido!");
                } else {
                    validar_rg = true;
                }
            }

            linha();
            System.out.println("Login Efetuado com Sucesso");
            linha();
            while (!opcao){
                System.out.print("Digite as opções desejadas:\n[1] Doguinho\n[2] Gatinho\nR: ");
                dog_cat = scanner.nextLine().strip();
                linha();
                if (!dog_cat.contains("1") && !dog_cat.contains("2") || Vazio(dog_cat)){
                    System.out.println("Opção Inválida");
                    linha();
                } else {
                    opcao = true;
                }
            }
            if (dog_cat.contains("1")){
                // Cachorro
                System.out.print("Porte:\n[1] Pequeno\n[2] Médio\n[3] Grande\nR: ");
                String porte = scanner.nextLine().strip();
                while (!porte.contains("1") && !porte.contains("2") && !porte.contains("3") || Vazio(porte) || porte.length() > 1){
                    linha();
                    System.out.println("Opção Inválida!");
                    linha();
                    System.out.print("Porte:\n[1] Pequeno\n[2] Médio\n[3] Grande\nR: ");
                    porte = scanner.nextLine().strip();
                } if (porte.contains("1")){
                    // Porte Pequeno
                    linha();
                    System.out.print("Trabalho:\n[1] Banho\n[2] Banho e Tosa\nR: ");
                    String trabalho = scanner.nextLine().strip();
                    while (!trabalho.contains("1") && !trabalho.contains("2")|| Vazio(trabalho) || trabalho.length() > 1){
                        linha();
                        System.out.println("Opção Inválida!");
                        linha();
                        System.out.print("Trabalho:\n[1] Banho\n[2] Banho e Tosa\nR: ");
                        trabalho = scanner.nextLine().strip();
                    }
                    if (trabalho.contains("1")){
                        linha();
                        valor = 35;
                        System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                        String unha = scanner.nextLine().strip();
                        while (!unha.contains("1") && !unha.contains("2") || Vazio(unha) || unha.length() > 1){
                            linha();
                            System.out.println("Opção Inválida!");
                            linha();
                            System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                            unha = scanner.nextLine().strip();
                        }
                        if (unha.contains("1")){
                            valor += 5;
                        }
                        linha();
                        System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                        String pulga = scanner.nextLine().strip();
                        while (!pulga.contains("1") && !pulga.contains("2") || Vazio(pulga) || pulga.length() > 1){
                            linha();
                            System.out.println("Opção Inválida!");
                            linha();
                            System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                            pulga = scanner.nextLine().strip();
                        }
                        if (pulga.contains("1")){
                            valor += 10;
                        }
                    } else {
                        linha();
                        valor = 50;
                        System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                        String unha = scanner.nextLine().strip();
                        while (!unha.contains("1") && !unha.contains("2") || Vazio(unha) || unha.length() > 1) {
                            linha();
                            System.out.println("Opção Inválida!");
                            linha();
                            System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                            unha = scanner.nextLine().strip();
                        }
                        if (unha.contains("1")){
                            valor += 5;
                        }
                        linha();
                        System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                        String pulga = scanner.nextLine().strip();
                        while (!pulga.contains("1") && !pulga.contains("2") || Vazio(pulga) || pulga.length() > 1){
                            linha();
                            System.out.println("Opção Inválida!");
                            linha();
                            System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                            pulga = scanner.nextLine().strip();
                        }
                        if (pulga.contains("1")){
                            valor += 10;
                        }
                    }
                } else if (porte.contains("2")){
                    // Porte Médio
                    linha();
                    System.out.print("Trabalho:\n[1] Banho\n[2] Banho e Tosa\nR: ");
                    String trabalho = scanner.nextLine().strip();
                    while (!trabalho.contains("1") && !trabalho.contains("2") || Vazio(trabalho) || trabalho.length() > 1){
                        linha();
                        System.out.println("Opção Inválida!");
                        linha();
                        System.out.print("Trabalho:\n[1] Banho\n[2] Banho e Tosa\nR: ");
                        trabalho = scanner.nextLine().strip();
                    }
                    if (trabalho.contains("1")){
                        linha();
                        valor = 40;
                        System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                        String unha = scanner.nextLine().strip();
                        while (!unha.contains("1") && !unha.contains("2") || Vazio(unha) || unha.length() > 1) {
                            linha();
                            System.out.println("Opção Inválida!");
                            linha();
                            System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                            unha = scanner.nextLine().strip();
                        }
                        if (unha.contains("1")){
                            valor += 5;
                        }
                        linha();
                        System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                        String pulga = scanner.nextLine().strip();
                        while (!pulga.contains("1") && !pulga.contains("2") || Vazio(pulga) || pulga.length() > 1){
                            linha();
                            System.out.println("Opção Inválida!");
                            linha();
                            System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                            pulga = scanner.nextLine().strip();
                        }
                        if (pulga.contains("1")){
                            valor += 10;
                        }

                    } else {
                        linha();
                        valor = 60;
                        System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                        String unha = scanner.nextLine().strip();
                        while (!unha.contains("1") && !unha.contains("2") || Vazio(unha) || unha.length() > 1) {
                            linha();
                            System.out.println("Opção Inválida!");
                            linha();
                            System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                            unha = scanner.nextLine().strip();
                        }
                        if (unha.contains("1")){
                            valor += 5;
                        }
                        linha();
                        System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                        String pulga = scanner.nextLine().strip();
                        while (!pulga.contains("1") && !pulga.contains("2") || Vazio(pulga) || pulga.length() > 1){
                            linha();
                            System.out.println("Opção Inválida!");
                            linha();
                            System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                            pulga = scanner.nextLine().strip();
                        }
                        if (pulga.contains("1")){
                            valor += 10;
                        }
                    }
                } else {
                    // Porte Grande
                    linha();
                    System.out.print("Trabalho:\n[1] Banho\n[2] Banho e Tosa\nR: ");
                    String trabalho = scanner.nextLine().strip();
                    while (!trabalho.contains("1") && !trabalho.contains("2")|| Vazio(trabalho) || trabalho.length() > 1){
                        linha();
                        System.out.println("Opção Inválida!");
                        linha();
                        System.out.print("Trabalho:\n[1] Banho\n[2] Banho e Tosa\nR: ");
                        trabalho = scanner.nextLine().strip();
                    }
                    if (trabalho.contains("1")){
                        linha();
                        valor = 50;
                        System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                        String unha = scanner.nextLine().strip();
                        while (!unha.contains("1") && !unha.contains("2") || Vazio(unha) || unha.length() > 1) {
                            linha();
                            System.out.println("Opção Inválida!");
                            linha();
                            System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                            unha = scanner.nextLine().strip();
                        }
                        if (unha.contains("1")){
                            valor += 5;
                        }
                        linha();
                        System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                        String pulga = scanner.nextLine().strip();
                        while (!pulga.contains("1") && !pulga.contains("2") || Vazio(pulga) || pulga.length() > 1){
                            linha();
                            System.out.println("Opção Inválida!");
                            linha();
                            System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                            pulga = scanner.nextLine().strip();
                        }
                        if (pulga.contains("1")){
                            valor += 10;
                        }
                    } else {
                        linha();
                        valor = 80;
                        System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                        String unha = scanner.nextLine().strip();
                        while (!unha.contains("1") && !unha.contains("2") || Vazio(unha) || unha.length() > 1) {
                            linha();
                            System.out.println("Opção Inválida!");
                            linha();
                            System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                            unha = scanner.nextLine().strip();
                        }
                        if (unha.contains("1")){
                            valor += 5;
                        }
                        linha();
                        System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                        String pulga = scanner.nextLine().strip();
                        while (!pulga.contains("1") && !pulga.contains("2") || Vazio(pulga) || pulga.length() > 1){
                            linha();
                            System.out.println("Opção Inválida!");
                            linha();
                            System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                            pulga = scanner.nextLine().strip();
                        }
                        if (pulga.contains("1")){
                            valor += 10;
                        }
                    }
                }
                linha();
                DecimalFormat money = new DecimalFormat("#,##0.00");
                String monetario = money.format(valor);
                String message = String.format("O valor dos trabalhos escolhidos para o(a) %s é R$%s", namePet, monetario);
                System.out.println(message);
                linha();
                System.out.print("Agendar horário?\n[1] Sim\n[2] Não\nR: ");
                String horario = scanner.nextLine().strip();
                while (!horario.contains("1") && !horario.contains("2") || Vazio(horario) || horario.length() > 1){
                    linha();
                    System.out.println("Opção Inválida!");
                    linha();
                    System.out.print("Agendar horário?\n[1] Sim\n[2] Não\nR: ");
                    horario = scanner.nextLine().strip();
                }
                if (horario.contains("1")){
                    linha();
                    System.out.println("Entre em contato através desse número: (11)9xxxx-xxxx");
                    linha();
                    System.out.println("Obrigado pela preferência!");
                    linha();
                } else {
                    linha();
                    System.out.println("Espero ver você em breve!!");
                    linha();
                }
            } else if (dog_cat.contains("2")){
                // Gato
                System.out.print("Trabalho:\n[1] Banho\n[2] Banho e Tosa\nR: ");
                String trabalho = scanner.nextLine().strip();
                while (!trabalho.contains("1") && !trabalho.contains("2")|| Vazio(trabalho) || trabalho.length() > 1){
                    linha();
                    System.out.println("Opção Inválida!");
                    linha();
                    System.out.print("Trabalho:\n[1] Banho\n[2] Banho e Tosa\nR: ");
                    trabalho = scanner.nextLine().strip();
                }
                if (trabalho.contains("1")){
                    linha();
                    valor = 70;
                    System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                    String unha = scanner.nextLine().strip();
                    while (!unha.contains("1") && !unha.contains("2") || Vazio(unha) || unha.length() > 1) {
                        linha();
                        System.out.println("Opção Inválida!");
                        linha();
                        System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                        unha = scanner.nextLine().strip();
                    }
                    if (unha.contains("1")){
                        valor += 5;
                    }
                    linha();
                    System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                    String pulga = scanner.nextLine().strip();
                    while (!pulga.contains("1") && !pulga.contains("2") || Vazio(pulga) || pulga.length() > 1){
                        linha();
                        System.out.println("Opção Inválida!");
                        linha();
                        System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                        pulga = scanner.nextLine().strip();
                    }
                    if (pulga.contains("1")){
                        valor += 10;
                    }
                } else {
                    linha();
                    valor = 100;
                    System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                    String unha = scanner.nextLine().strip();
                    while (!unha.contains("1") && !unha.contains("2") || Vazio(unha) || unha.length() > 1) {
                        linha();
                        System.out.println("Opção Inválida!");
                        linha();
                        System.out.print("Corte de Unha:\n[1] Sim\n[2] Não\nR: ");
                        unha = scanner.nextLine().strip();
                    }
                    if (unha.contains("1")){
                        valor += 10;
                    }
                    linha();
                    System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                    String pulga = scanner.nextLine().strip();
                    while (!pulga.contains("1") && !pulga.contains("2") || Vazio(pulga) || pulga.length() > 1){
                        linha();
                        System.out.println("Opção Inválida!");
                        linha();
                        System.out.print("Anti-Pulgas:\n[1] Sim\n[2] Não\nR: ");
                        pulga = scanner.nextLine().strip();
                    }
                    if (pulga.contains("1")){
                        valor += 10;
                    }
                }
                linha();
                DecimalFormat money = new DecimalFormat("#,##0.00");
                String monetario = money.format(valor);
                String message = String.format("O valor dos trabalhos escolhidos para o(a) %s é R$%s", namePet, monetario);
                System.out.println(message);
                linha();
                System.out.print("Agendar horário?\n[1] Sim\n[2] Não\nR: ");
                String horario = scanner.nextLine().strip();
                while (!horario.contains("1") && !horario.contains("2") || Vazio(horario) || horario.length() > 1){
                    linha();
                    System.out.println("Opção Inválida!");
                    linha();
                    System.out.print("Agendar horário?\n[1] Sim\n[2] Não\nR: ");
                    horario = scanner.nextLine().strip();
                }
                if (horario.contains("1")){
                    linha();
                    System.out.println("Entre em contato através desse número: (11)9xxxx-xxxx");
                    linha();
                    System.out.println("Obrigado pela preferência!");
                    linha();
                } else {
                    linha();
                    System.out.println("Espero ver você em breve!!");
                    linha();
                }
            }

        } catch (Exception exception) {
            linha();
            System.out.println("Ocorreu um erro! contate a manutenção...");
            linha();
        }
    }

    public static void linha(){
        System.out.println("-".repeat(30));
    }

    public static boolean Vazio(String texto){
        if (texto.isEmpty()){
            return true;
        }
        return false;
    }

    public static boolean ValidarNome(String[] nome){
        for (String palavra : nome) {
            for (char c : palavra.toCharArray()) {
                if (Character.isDigit(c)) {
                    return true;
                }
            }

            if (palavra.isEmpty()){
                return true;
            }

        }

        return false;
    }

    public static boolean ValidarEmpty(String[] nome){
        for (String palavra : nome){
            if (palavra.isEmpty()){
                return true;
            }
        }

        return false;
    }

    public static boolean ValidarRg(String rg){
        if (rg.length() < 9){
            return true;
        }

        for (char c : rg.toCharArray()){
            if (Character.isLetter(c)){
                return true;
            }
        }

        return false;
    }

}
