package Util;

import Entidades.*;

import java.util.ArrayList;

public class Tabelar {

    private static String colocarEspaco(int qtde){
        String x = "";
        for(int i = 0; i < qtde; i ++){
            x += " ";
        }
        return x;
    }

    public static void tabelarAnimal(ArrayList<Animal>  animais, String filtroNome, String filtroDescricao){

        System.out.println("+---------+----------------------+----------------------+----------------------+-------+----------------------+----------------------+----------------------+----------------------+");
        System.out.println("|   ID    |         Nome         +        Espécie       +         Raça         + Idade +         Sexo         +    Data de Resgate   +   Status de Adoção   +   Histórico médico   |");

        for (Animal animal: animais) {

            if(filtroNome != null){
                if((filtroNome.equals("especie") && !(animal.getEspecie().equals(filtroDescricao))) || (filtroNome.equals("raca") && !(animal.getRaca().equals(filtroDescricao))) || (filtroNome.equals("sexo") && !(animal.getSex().equals(filtroDescricao))))
                    continue;
            }

            String animalNome = animal.getNome();
            if(animalNome.length() > 20){
                animalNome = animalNome.substring(0, 17) + "...";
            }
            else{
                animalNome += colocarEspaco(20 - animalNome.length());
            }

            String animalEspecie = animal.getEspecie();
            if(animalEspecie.length() > 20){
                animalEspecie = animalEspecie.substring(0, 17) + "...";
            }
            else{
                animalEspecie += colocarEspaco(20 - animalEspecie.length());
            }

            String animalRaca = animal.getRaca();
            if(animalRaca.length() > 20){
                animalRaca = animalRaca.substring(0, 17) + "...";
            }
            else{
                animalRaca += colocarEspaco(20 - animalRaca.length());
            }

            String animalIdade = Integer.toString(animal.getIdade());
            animalIdade += colocarEspaco(5 - animalIdade.length());

            String animalSex = animal.getSex();
            if(animalSex.length() > 20){
                animalSex = animalSex.substring(0, 17) + "...";
            }
            else{
                animalSex += colocarEspaco(20 - animalSex.length());
            }

            String animalData_DeResgate = animal.getData_DeResgate();
            if(animalData_DeResgate.length() > 20){
                animalData_DeResgate = animalData_DeResgate.substring(0, 17) + "...";
            }
            else{
                animalData_DeResgate += colocarEspaco(20 - animalData_DeResgate.length());
            }

            String animalStatusDeAdocao = animal.getStatusDeAdocao();
            if(animalStatusDeAdocao.length() > 20){
                animalStatusDeAdocao = animalStatusDeAdocao.substring(0, 17) + "...";
            }
            else{
                animalStatusDeAdocao += colocarEspaco(20 - animalStatusDeAdocao.length());
            }

            String animalHistoricoMedico = animal.getHistoricoMedico();
            if(animalHistoricoMedico.length() > 20){
                animalHistoricoMedico = animalHistoricoMedico.substring(0, 17) + "...";
            }
            else{
                animalHistoricoMedico += colocarEspaco(20 - animalHistoricoMedico.length());
            }

            String animalID = Integer.toString(animal.getID());
            animalID += colocarEspaco(7 - animalID.length());

            System.out.println("+---------+----------------------+----------------------+----------------------+-------+----------------------+----------------------+----------------------+----------------------+");
            System.out.format("| %s ", animalID);
            System.out.format("| %s ", animalNome);
            System.out.format("| %s ", animalEspecie);
            System.out.format("| %s ", animalRaca);
            System.out.format("| %s ", animalIdade);
            System.out.format("| %s ", animalSex);
            System.out.format("| %s ", animalData_DeResgate);
            System.out.format("| %s ", animalStatusDeAdocao);
            System.out.format("| %s |\n", animalHistoricoMedico);

        }

        System.out.println("+---------+----------------------+----------------------+----------------------+-------+----------------------+----------------------+----------------------+----------------------+");
    }

    public static void tabelarUsuario(ArrayList<Usuario> usuarios){

        System.out.println("+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
        System.out.println("|         Nome         |         Email        |         Senha        |          CPF         |       Telefone       |  Data de nascimento  |       Endereço       |");

        for (Pessoa usuario: usuarios) {
            String usuarioNome = usuario.getNome();
            if(usuarioNome.length() > 20){
                usuarioNome = usuarioNome.substring(0, 17) + "...";
            }
            else{
                usuarioNome += colocarEspaco(20 - usuarioNome.length());
            }

            String usuarioCPF = usuario.getCPF();
            if(usuarioCPF.length() > 20){
                usuarioCPF = usuarioCPF.substring(0, 17) + "...";
            }
            else{
                usuarioCPF += colocarEspaco(20 - usuarioCPF.length());
            }

            String usuarioDataDeNascimento = usuario.getDataDeNascimento();
            if(usuarioDataDeNascimento.length() > 20){
                usuarioDataDeNascimento = usuarioDataDeNascimento.substring(0, 17) + "...";
            }
            else{
                usuarioDataDeNascimento += colocarEspaco(20 - usuarioDataDeNascimento.length());
            }

            String usuarioEmail = usuario.getEmail();
            if(usuarioEmail.length() > 20){
                usuarioEmail = usuarioEmail.substring(0, 17) + "...";
            }
            else{
                usuarioEmail += colocarEspaco(20 - usuarioEmail.length());
            }

            String usuarioEndereco = usuario.getEndereco();
            if(usuarioEndereco.length() > 20){
                usuarioEndereco = usuarioEndereco.substring(0, 17) + "...";
            }
            else{
                usuarioEndereco += colocarEspaco(20 - usuarioEndereco.length());
            }

            String usuarioSenha = usuario.getSenha();
            if(usuarioSenha.length() > 20){
                usuarioSenha = usuarioSenha.substring(0, 17) + "...";
            }
            else{
                usuarioSenha += colocarEspaco(20 - usuarioSenha.length());
            }

            String usuarioTelefone = usuario.getTelefone();
            if(usuarioTelefone.length() > 20){
                usuarioTelefone = usuarioTelefone.substring(0, 17) + "...";
            }
            else{
                usuarioTelefone += colocarEspaco(20 - usuarioTelefone.length());
            }

            System.out.println("+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
            System.out.format("| %s ", usuarioNome);
            System.out.format("| %s ", usuarioEmail);
            System.out.format("| %s ", usuarioSenha);
            System.out.format("| %s ", usuarioCPF);
            System.out.format("| %s ", usuarioTelefone);
            System.out.format("| %s ", usuarioDataDeNascimento);
            System.out.format("| %s |\n", usuarioEndereco);
        }
        System.out.println("+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
    }

    public static void tabelarUsuario2(Usuario usuario) {
        // Definindo os rótulos (nomes dos campos) na coluna da esquerda
        String[] campos = {
                "Nome",
                "Email",
                "Senha",
                "CPF",
                "Telefone",
                "Data de Nascimento",
                "Endereço"
        };

        // Obtendo os valores correspondentes na coluna da direita
        String[] valores = {
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getSenha(),
                usuario.getCPF(),
                usuario.getTelefone(),
                usuario.getDataDeNascimento(),
                usuario.getEndereco()
        };

        // Encontrar a largura máxima da coluna da esquerda (campos)
        int larguraCampos = 0;
        for (String campo : campos) {
            if (campo.length() > larguraCampos) {
                larguraCampos = campo.length();
            }
        }

        // Encontrar a largura máxima da coluna da direita (valores)
        int larguraValores = 0;
        for (String valor : valores) {
            if (valor.length() > larguraValores) {
                larguraValores = valor.length();
            }
        }

        // Criar a linha de separação da tabela
        String linhaSeparadora = "+" + "-".repeat(larguraCampos + 2) + "+" + "-".repeat(larguraValores + 2) + "+";

        // Imprimir a tabela
        System.out.println(linhaSeparadora);

        // Imprimir os campos e valores com separadores entre cada linha
        for (int i = 0; i < campos.length; i++) {
            System.out.format("| %-" + larguraCampos + "s | %-" + larguraValores + "s |\n", campos[i], valores[i]);
            System.out.println(linhaSeparadora); // Separador após cada linha
        }
    }

    public static void tabelarPreferencias(Preferencias preferencias) {
        // Definindo os rótulos (nomes dos campos) na coluna da esquerda
        String[] campos = {
                "Espécie",
                "Idade Mínima",
                "Idade Máxima",
                "Raça",
                "Sexo"
        };

        // Obtendo os valores correspondentes na coluna da direita
        String[] valores = {
                preferencias.getEspecie(),
                Integer.toString(preferencias.getIdadeMinima()),
                Integer.toString(preferencias.getIdadeMaxima()),
                preferencias.getRaca(),
                preferencias.getSex()
        };

        // Encontrar a largura máxima da coluna da esquerda (campos)
        int larguraCampos = 0;
        for (String campo : campos) {
            if (campo.length() > larguraCampos) {
                larguraCampos = campo.length();
            }
        }

        // Encontrar a largura máxima da coluna da direita (valores)
        int larguraValores = 0;
        for (String valor : valores) {
            if (valor.length() > larguraValores) {
                larguraValores = valor.length();
            }
        }

        // Criar a linha de separação da tabela
        String linhaSeparadora = "+" + "-".repeat(larguraCampos + 2) + "+" + "-".repeat(larguraValores + 2) + "+";

        // Imprimir a tabela
        System.out.println(linhaSeparadora);

        // Imprimir os campos e valores com separadores entre cada linha
        for (int i = 0; i < campos.length; i++) {
            System.out.format("| %-" + larguraCampos + "s | %-" + larguraValores + "s |\n", campos[i], valores[i]);
            System.out.println(linhaSeparadora); // Separador após cada linha
        }
    }

}
