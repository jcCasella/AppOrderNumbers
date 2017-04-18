package com.example.aluno.ordernumbers;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Send {

    public static String send(String information) {

        Socket con = Conect.conect("10.180.42.234", 1235);

        String input2="Error";

        if (con != null) {

            try {

                DataOutputStream output = new DataOutputStream(con.getOutputStream());
                BufferedReader input = new BufferedReader(new InputStreamReader(con.getInputStream()));

                output.writeBytes( information+"\n" );
                input2 = input.readLine();

                System.out.println(input2);

                output.close();

                con.close();

            } catch (IOException ignored) {}
        }

        return input2;

    }
}
