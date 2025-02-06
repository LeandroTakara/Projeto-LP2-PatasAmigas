import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;

import Entidades.*;
import Util.Encriptador;
import Util.Tabelar;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean running = true;
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static ArrayList<Animal> animais = new ArrayList<>();
    private static Usuario usuarioLogado;

    //quando colocar sistema de login, mudar isso


    public static void main(String[] args) throws NoSuchAlgorithmException {

        Usuario bito = new Usuario("497.232.338-86", "Rua jaboticabal,41, jardim antonio picosse", "João Vitor", "25/08/2006", "a@a", "bito", "94533-3013");
        usuarios.add(bito);

        Animal julim = new Animal("julisssssssssssssssssssssm", "cachorrssssssssssssssssssso", "leopardo das neveskkkkkkkk", 132, "não fez hoje(ainda)", "12/2039/203sssssssssssss4", "n/sssssssssssssssssssssssssssssssa", bito);
        animais.add(julim);

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

    public static void rodarAplicacao() throws NoSuchAlgorithmException {
        while (running) {
            System.out.println("[0] - Sair");
            System.out.println("[1] - Cadastrar");
            System.out.println("[2] - Listar");
            System.out.println("[3] - Login");

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
                    System.out.println("=== Login ===");
                    String email = inputString("Digite seu email: ");
                    String senha = Encriptador.encriptar(inputString("Digite sua senha: "));

                    Usuario user = logarUsuario(email, senha);

                    if(user != null){
                        usuarioLogado = user;
                        homePage();
                        System.out.println("=== x ===");

                    }
                    else{
                        System.out.println("=== email ou senha incorretos ===");
                    }

                    break;
                default:
                    break;
            }
        }
    }

    public static void cadastrarUsuario() {

        String nome = inputString("Digite seu nome: ");

        String cpf = inputString("Digite seu CPF: ");

        String email = inputString("Digite seu email: ");

        boolean existe = false;

        for (Pessoa usuario : usuarios) {
            if (usuario.getEmail().equals(email)) existe = true;
        }

        while (existe) {
            System.out.println("[AVISO] este email já está sendo utilizado");

            email = inputString("Digite seu email: ");
            existe = false;

            for (Pessoa usuario : usuarios) {
                if (usuario.getEmail().equals(email)) existe = true;
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

        usuarios.add(new Usuario(cpf, endereco, nome, dataDeNascimento, email, senha, telefone));
    }

    public static void listarUsuarios() {
        if (usuarios.size() == 0) {
            System.out.println("Nenhum usuário cadastrado");
        } else {
            Tabelar.tabelarUsuario(usuarios);
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
                    cadastrarAnimal(usuarioLogado);
                    System.out.println("=== x ===");
                    break;
                case 2:

                    System.out.println("[0] - Não");
                    System.out.println("[1] - Sim");
                    int opcao2 = inputOpcaoMenu("Deseja adicionar algum filtro? ", 0, 1);

                    if (opcao2 == 0){
                        System.out.println("=== Lista de animais cadastrados ===");
                        Tabelar.tabelarAnimal(animais, null, null);
                    }
                    else {
                        String filtroNome = "";
                        String filtroDescricao = "";

                        System.out.println("============ filtros ============");
                        System.out.println("[0] - Espécie");
                        System.out.println("[1] - Raça");
                        System.out.println("[2] - Sexo");
                        int opcao3 = inputOpcaoMenu("Qual filtro deseja adicionar? ", 0, 4);

                        switch (opcao3) {
                            case 0:
                                filtroNome = "especie";
                                filtroDescricao = inputString("Digite a espécie de animal que está buscando: ");

                                break;
                            case 1:
                                filtroNome = "raca";
                                filtroDescricao = inputString("Digite a raça de animal que está buscando: ");
                                break;
                            case 2:
                                filtroNome = "sexo";
                                filtroDescricao = inputString("Digite o sexo de animal que está buscando: ");
                                break;
                            default:
                                break;
                        }
                        System.out.println("=== x ===");
                        System.out.println("=== Lista de animais cadastrados ===");
                        Tabelar.tabelarAnimal(animais, filtroNome, filtroDescricao);
                    }
                    System.out.println("=== x ===");

                    break;
                case 3:
                    System.out.println("=== Preferências de animais ===");
                    System.out.println("=== x ===");
                    break;

                case 4:
                    System.out.println("=== Dados da conta ===");
                    Tabelar.tabelarUsuario2(usuarioLogado);
                    System.out.println("=== x ===");
                    break;
                default:
                    break;
            }
        }
    }

    public static void cadastrarAnimal(Usuario user){
        String nomeAnimal = inputString("Digite o nome do Animal: ");
        String especieAnimal = inputString("Digite a espécie do Animal: ");
        String racaAnimal = inputString("Digite a raça do Animal: ");
        int idadeAnimal = inputInt("Digite a idade do Animal: ");
        String sexoAnimal = inputString("Digite o sexo do Animal: ");
        String dataResgateAnimal = inputString("Digite a data de resgate do Animal, se houver: ");
        String historicoMedicoAnimal = inputString("Digite sobre o histórico médico do Animal: ");

        animais.add(new Animal(nomeAnimal, especieAnimal,racaAnimal, idadeAnimal, sexoAnimal, dataResgateAnimal, historicoMedicoAnimal, user));
    }

    public static Usuario logarUsuario(String email, String senha){
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)){
                return usuario;
            }
        }
        return null;
    }
}
