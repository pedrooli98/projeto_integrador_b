package com.example;

import java.sql.*;
import java.util.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */

    public static Connection createConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/cadastro_imunizados";
        String user = "root";
        String pwr = "1304";
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
