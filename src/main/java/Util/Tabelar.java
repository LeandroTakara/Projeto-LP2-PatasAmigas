package Util;

import Entidades.*;

public class Tabelar {

    private static String colocarEspaco(int qtde){
        String x = "";
        for(int i = 0; i < qtde; i ++){
            x += " ";
        }
        return x;
    }

    public static void tabelarAnimal(Animal animal){

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


        System.out.println("+----------------------+----------------------+----------------------+-------+----------------------+----------------------+----------------------+----------------------+");
        System.out.println("|         Nome         +        Espécie       +         Raça         + Idade +         Sexo         +    Data de Resgate   +   Status de Adoção   +   Histórico médico   |");
        System.out.println("+----------------------+----------------------+----------------------+-------+----------------------+----------------------+----------------------+----------------------+");
        System.out.format("| %s ", animalNome);
        System.out.format("| %s ", animalEspecie);
        System.out.format("| %s ", animalRaca);
        System.out.format("| %s ", animalIdade);
        System.out.format("| %s ", animalSex);
        System.out.format("| %s ", animalData_DeResgate);
        System.out.format("| %s ", animalStatusDeAdocao);
        System.out.format("| %s |\n", animalHistoricoMedico);
        System.out.println("+----------------------+----------------------+----------------------+-------+----------------------+----------------------+----------------------+----------------------+");
    }

    public static void tabelarUsuario(Usuario usuario){

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

        String usuarioQtdeAnimalSobCustodio = Integer.toString(usuario.getQtdeAnimalSobCustodio());
        if(usuarioQtdeAnimalSobCustodio.length() > 20){
            usuarioQtdeAnimalSobCustodio = usuarioQtdeAnimalSobCustodio.substring(0, 17) + "...";
        }
        else{
            usuarioQtdeAnimalSobCustodio += colocarEspaco(20 - usuarioQtdeAnimalSobCustodio.length());
        }


        System.out.println("+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
        System.out.println("|         Nome         +         Email        +         Senha        +          CPF         +       Telefone       +  Data de nascimento  +       Endereço       + Animais sob custódia |");
        System.out.println("+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
        System.out.format("| %s ", usuarioNome);
        System.out.format("| %s ", usuarioEmail);
        System.out.format("| %s ", usuarioSenha);
        System.out.format("| %s ", usuarioCPF);
        System.out.format("| %s ", usuarioTelefone);
        System.out.format("| %s ", usuarioDataDeNascimento);
        System.out.format("| %s ", usuarioEndereco);
        System.out.format("| %s |\n", usuarioQtdeAnimalSobCustodio);
        System.out.println("+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+----------------------+");
    }

}
