package com.example.javadb.javadb.prova;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.example.javadb.javadb.parameter.Parameters.*;


public class Prova01 {


    public static void main(String[] args) throws Exception {


        String sqlQuery = "select id_cliente, nome, cognome  from clienti order by cognome, nome";

        //connessione al DB
        Connection conn = DriverManager.getConnection(MYSQL_DRIVER_URL);

        //statement da inviare al DB

        PreparedStatement pst = conn.prepareStatement(sqlQuery);


        ResultSet rs = pst.executeQuery();

        while(rs.next()){
            String str = String.format("id=%s, cognome =%s, nome =%s", rs.getInt("id_cliente"), rs.getString("cognome"), rs.getString("nome"));

            System.out.println(str);

        }


        //operazione di shut down del result set

        rs.close();

        //shutdown del prepared statement

        pst.close();

        //close della connection

        conn.close();
    }
}
