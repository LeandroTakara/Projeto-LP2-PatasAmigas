import java.util.ArrayList;
import java.util.Scanner;

import Entidades.*;
import Util.Tabelar;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean running = true;
    private static ArrayList<Pessoa> usuarios = new ArrayList<>();

    public static void main(String[] args) {

        //Animal julim = new Animal("julisssssssssssssssssssssm", "cachorrssssssssssssssssssso", "leopardo das neveskkkkkkkk", 132, "não fez hoje(ainda)", "12/2039/203sssssssssssss4", "adotado", "n/sssssssssssssssssssssssssssssssa");
        //Usuario bito = new Usuario("497.232.338-86", "Rua jaboticabal,41, jardim antonio picosse", "João Vitor", "25/08/2006", "jvpsoares2006@gmail.com", "macaco132Cenha", "94533-3013", 132);

        mostrarTitulo();

        //Tabelar.tabelarAnimal(julim);
        //Tabelar.tabelarUsuario(bito);

        rodarAplicacao();
    }

    public static void mostrarTitulo() {
        System.out.println(" +---+                                           ");
        System.out.println(" |   |    _   ---+---   _    /--                 ");
        System.out.println(" |---+   / \\     |     / \\   \\_               ");
        System.out.println(" |      |---|    |    |---|     \\               ");
        System.out.println(" |      |   |    |    |   |   --/                ");
        System.out.println("     _                                           ");
        System.out.println("    / \\                  /---      _    /--     ");
        System.out.println("   /___\\    |\\  /|  °   |  __     / \\   \\_   ");
        System.out.println("  /     \\   | \\/ |  |   |    \\   |---|     \\ ");
        System.out.println(" /       \\  |    |  |    \\---/   |   |   --/   ");
        System.out.println("=============================================");
    }

    public static void rodarAplicacao() {
        while (running) {
            System.out.println("[0] - Sair");
            System.out.println("[1] - Cadastrar");
            System.out.println("[2] - Listar");
            System.out.println("[3] - Login temporário");

            int opcao = inputOpcaoMenu("Escolha uma opção: ", 0, 3);

            switch (opcao) {
                case 0:
                    running = false;
                    break;
                case 1:
                    System.out.println("=== Cadastro de usuário ===");
                    cadastrarUsuario();
                    System.out.println("=== x ===");
                    break;
                case 2:
                    System.out.println("=== Lista de usuários cadastrados ===");
                    listarUsuarios();
                    System.out.println("=== x ===");
                    break;
                case 3:
                    homePage();
                    System.out.println("=== x ===");
                    break;
                default:
                    break;
            }
        }
    }

    public static void cadastrarUsuario() {
        System.out.println("[0] - Tutor");
        System.out.println("[1] - Adotante");
        System.out.println("[2] - Funcionário");
        int opcaoTipo = inputOpcaoMenu("Escolha seu tipo de usuário: ", 0, 2);

        String tipo;
        Class classe = null;

        if (opcaoTipo == 0) {
            tipo = "Tutor";
            classe = Tutor.class;
        } else if (opcaoTipo == 1) {
            tipo = "Adotante";
            classe = Adotante.class;
        } else {
            tipo = "Funcionário";
            classe = Funcionario.class;
        }

        String nome = inputString("Digite seu nome: ");

        String cpf = inputString("Digite seu CPF: ");

        String email = inputString("Digite seu email: ");

        boolean existe = false;

        for (Pessoa usuario : usuarios) {
            if (usuario.getClass() == classe && usuario.getEmail().equals(email)) existe = true;
        }

        while (existe) {
            System.out.println("[AVISO] este email já está sendo utilizado");

            email = inputString("Digite seu email: ");
            existe = false;

            for (Pessoa usuario : usuarios) {
                if (usuario.getClass() == classe && usuario.getEmail().equals(email)) existe = true;
            }
        }

        String senha = inputString("Digite sua senha: ");

        while (senha.isEmpty()) {
            System.out.println("[ERROR] Senha não pode estar vazia");
            senha = inputString("Digite sua senha: ");
        }

        String endereco = inputString("Digite seu endereco: ");

        String dataDeNascimento = inputString("Digite sua data de nascimento: ");

        String telefone = inputString("Digite seu telefone: ");

        if (tipo == "Tutor") {
            int qtdeAnimalSobCustodia = inputInt("Digite o número de animais sob custodia: ");

            usuarios.add(new Tutor(cpf, endereco, nome, dataDeNascimento, email, senha, telefone, qtdeAnimalSobCustodia));
        } else if (tipo == "Adotante") {
            usuarios.add(new Adotante(cpf, endereco, nome, dataDeNascimento, email, senha, telefone));
        } else {
            String dataDeContratacao = inputString("Digite sua data de contratação: ");

            String cargo = inputString("Digite seu cargo: ");

            double salario = inputDouble("Digite seu salário: ");

            String departamento = inputString("Digite seu departamento: ");

            usuarios.add(new Funcionario(cpf, endereco, nome, dataDeNascimento, email, senha, telefone, dataDeContratacao, cargo, salario, departamento));
        }
    }

    public static void listarUsuarios() {
        if (usuarios.size() == 0) {
            System.out.println("Nenhum usuário cadastrado");
        } else {
            for (Pessoa usuario : usuarios) {
                System.out.println(usuario);
            }
        }
    }

    public static int inputOpcaoMenu(String prompt, int minimo, int maximo) {
        int opcao;

        while (true) {            
            opcao = inputInt(prompt);

            if (opcao >= minimo && opcao <= maximo) {
                break;
            } else {
                System.out.format("[ERRO] Digite um NÚMERO ENTRE %d e %d!\n", minimo, maximo);
            }
        }

        return opcao;
    }

    public static int inputInt(String prompt) {
        int value;

        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            try {
                value = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("[ERRO] Digite um NÚMERO!");
            }
        }

        return value;
    }

    public static double inputDouble(String prompt) {
        double value;

        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            try {
                value = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("[ERRO] Digite um NÚMERO!");
            }
        }

        return value;
    }

    public static String inputString(String prompt) {
        System.out.print(prompt);
        String value = scanner.nextLine();

        return value;

    }

    public static void homePage(){

        boolean rodando = true;

        while(rodando){
            System.out.println("============ Homepage ============");
            System.out.println("[0] - Sair");
            System.out.println("[1] - Cadastrar animal para adoção");
            System.out.println("[2] - Buscar animal para adoção");
            System.out.println("[3] - Personalizar preferências");
            System.out.println("[4] - Apresentar meus dados");

            int opcao = inputOpcaoMenu("Escolha uma opção: ", 0, 4);

            switch (opcao) {
                case 0:
                    rodando = false;
                    break;
                case 1:
                    System.out.println("=== Cadastro de animal ===");
                    System.out.println("=== x ===");
                    break;
                case 2:
                    System.out.println("=== Lista de animais cadastrados ===");
                    System.out.println("=== x ===");
                    break;
                case 3:
                    System.out.println("=== Preferências de animais ===");
                    System.out.println("=== x ===");
                    break;

                case 4:
                    System.out.println("=== Dados da conta ===");
                    System.out.println("=== x ===");
                    break;
                default:
                    break;
            }
        }
    }
}
