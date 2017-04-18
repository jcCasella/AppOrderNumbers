package com.example.aluno.ordernumbers;

import java.io.IOException;
import java.net.Socket;

public class Conect {

    static Socket conect(String endereco, int porta) {

        Socket conexao = null;
        try {
            conexao = new Socket(endereco, porta);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return conexao;
    }
}
