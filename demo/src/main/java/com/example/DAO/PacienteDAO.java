package com.example.DAO ;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.example.conexao.Conexao;

public class PacienteDAO {
    public ArrayList<String> getData() {

        
        String sql = "SELECT * FROM pacientes";
        
        try {
            ArrayList<String> res = new ArrayList<String>();

            Statement smt = Conexao.getConexao().createStatement();

            ResultSet rs = smt.executeQuery(sql);

            if (rs.next()) {
                do {
                    String resString = 
                        rs.getString(1) + "--" + 
                        rs.getString(2) + "--";

                        res.add(resString);
                } while (rs.next());

                return res;
            } else {
                System.err.println("Not found...");
            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}