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


    public static void main(String[] args) {
        List<String> pacientsList = new ArrayList<String>();
        try {
            try (Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro_imunizados", "root", "1304")) {
                Statement smt = (Statement) cn.createStatement();
                
                String sql = "SELECT * FROM pacientes";
                
                ResultSet rs = smt.executeQuery(sql);

            if (rs.next()) {
                do {
                    String resString = 
                        rs.getString(1) + "--" + 
                        rs.getString(2) + "--";

                        pacientsList.add(resString);

                        System.out.println(resString);
                } while (rs.next());
            } else {
                System.out.println("Not found...");
            }
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        
    }
}
