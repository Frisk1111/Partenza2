package com.example.javadb.javadb.prova;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.example.javadb.javadb.exeception.DatatabaseOperationExecption;

import java.sql.*;


import static com.example.javadb.javadb.parameter.Parameters.MYSQL_DRIVER_URL;

public class Prova02 {


    public static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws Exception {


        String sqlQuery = "select id_cliente, nome, cognome  from clienti order by cognome, nome";


        Connection conn = null;

        PreparedStatement pst = null;

        ResultSet rs = null;

        try {
            //connessione al DB
            conn = DriverManager.getConnection(MYSQL_DRIVER_URL);

            //statement da inviare al DB

            pst = conn.prepareStatement(sqlQuery);


            rs = pst.executeQuery();

            while (rs.next()) {
                String str = String.format("id=%s, cognome =%s, nome =%s", rs.getInt("id_cliente"), rs.getString("cognome"), rs.getString("nome"));

                System.out.println(str);

            }


        } catch (Exception e) {


            logger.error("Errore intervenuto");
            System.err.println(e);

            throw new DatatabaseOperationExecption();
        } finally {


            logger.trace("\n blocco finally ! ");
            //operazione di shut down del result set

            try {
                rs.close();

            } catch (SQLException e) {
                logger.error("Uh oh!");
            }

            //shutdown del prepared statement


            try {
                pst.close();

            } catch (SQLException e) {
                logger.error("Uh oh!");

            }
            //close della connection


            try {
                conn.close();

            } catch (SQLException e) {
                logger.error("Uh oh!");

            }

        }

    }
}


