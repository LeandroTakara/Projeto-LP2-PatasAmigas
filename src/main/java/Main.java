import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Adotante;
import Entidades.Funcionario;
import Entidades.Pessoa;
import Entidades.Tutor;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean running = true;
    private static ArrayList<Pessoa> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        mostrarTitulo();

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

            int opcao = inputOpcaoMenu("Escolha uma opção: ", 0, 2);

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
        if (opcaoTipo == 0) {
            tipo = "Tutor";
        } else if (opcaoTipo == 1) {
            tipo = "Adotante";
        } else {
            tipo = "Funcionário";
        }

        String nome = inputString("Digite seu nome: ");

        String cpf = inputString("Digite seu CPF: ");

        String email = inputString("Digite seu email: ");

        String senha = inputString("Digite sua senha: ");

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
}
