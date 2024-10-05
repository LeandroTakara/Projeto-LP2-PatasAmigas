package Util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encriptador {
    public static String encriptar(String palavra) throws NoSuchAlgorithmException {

        //Lembrar q dá pra colocar MD2, MD5, SHA-1, SHA-224, SHA-256, SHA-384, SHA-512
        //Aparentemente todos os listados acima são algoritmos de criptografia
        //Lembrar de estudar isso mais tarde, código sujeito a alterações

        MessageDigest algoritmoDeCriptografia = MessageDigest.getInstance("MD5");

        byte[] vetorDeBytes = algoritmoDeCriptografia.digest(palavra.getBytes());

        BigInteger representacaoDecimal = new BigInteger(1, vetorDeBytes);

        return representacaoDecimal.toString(16);
    }
}
