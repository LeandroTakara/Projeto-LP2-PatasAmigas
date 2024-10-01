import java.util.ArrayList;
import java.util.Scanner;

import Entidades.Adotante;
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
        int opcaoTipo = inputOpcaoMenu("Escolhar seu tipo de usuário: ", 0, 1);
        String tipo;
        if (opcaoTipo == 0) {
            tipo = "Tutor";
        } else {
            tipo = "Adotante";
        }

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        System.out.print("Digite seu endereco: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite sua data de nascimento: ");
        String dataDeNascimento = scanner.nextLine();

        System.out.print("Digite seu telefone: ");
        String telefone = scanner.nextLine();


        if (tipo == "Tutor") {
            int qtdeAnimalSobCustodia = Integer.parseInt(scanner.nextLine());

            usuarios.add(new Tutor(cpf, endereco, nome, dataDeNascimento, email, senha, telefone, qtdeAnimalSobCustodia));
        } else {
            usuarios.add(new Adotante(cpf, endereco, nome, dataDeNascimento, email, senha, telefone));
        }
    }

    public static void listarUsuarios() {
        if (usuarios.size() == 0) {
            System.out.println("Nenhum usuário cadastrado");
        } else {
            for (Pessoa usuario : usuarios) {
                String tipo;

                if (usuario instanceof Adotante) {
                    tipo = "Adotante";
                } else {
                    tipo = "Tutor";
                }

                System.out.format("%s - %s", tipo, usuario.getNome());
            }
            System.out.println();
        }
    }

    public static int inputOpcaoMenu(String prompt, int minimo, int maximo) {
        int opcao;

        while (true) {            
            while (true) {
                System.out.print(prompt);
                String input = scanner.nextLine();

                try {
                    opcao = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("[ERRO] Digite um NÚMERO!");
                }
            }

            if (opcao >= minimo && opcao <= maximo) {
                break;
            } else {
                System.out.format("[ERRO] Digite um NÚMERO ENTRE %d e %d!\n", minimo, maximo);
            }
        }

        return opcao;
    }
}
