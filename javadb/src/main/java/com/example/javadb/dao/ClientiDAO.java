package com.example.javadb.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



import com.example.javadb.exeception.DatatabaseOperationExecption;

import com.example.javadb.entities.Cliente;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.example.javadb.parameter.Parameters.MYSQL_DRIVER_URL;

public class ClientiDAO implements DAO<Cliente, Integer> {


    private static final Logger log = LogManager.getLogger("ClientiDAO.class");

    private static final String findAllQuery = "select id_cliente, nome, cognome, email, indirizzo, citta, provincia, cap from clienti";
    private static final String findByIdQuery = "select id_cliente, nome, cognome, email, indirizzo, citta, provincia, cap from where id_cliente = ?";

    @Override
    public Cliente findById(Integer key) {
        unsupportedOperation("find");
        return null;
    }

    // prende i dati da result set e li incapsula nel cliente
    private Cliente generateCliente(ResultSet rs) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(rs.getInt("id_cliente"));
        cliente.setNome(rs.getString("nome"));
        cliente.setCognome(rs.getString("cognome"));
        cliente.setEmail(rs.getString("email"));
        cliente.setIndirizzo(rs.getString("indirizzo"));
        cliente.setCitta(rs.getString("citta"));
        cliente.setProvincia(rs.getString("provincia"));
        cliente.setCap(rs.getString("cap"));
        log.debug("Cliente {}", cliente);
        return cliente;
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> clienti = new ArrayList<>();

        try ( // risorse autocloseable
              Connection conn = DriverManager.getConnection(MYSQL_DRIVER_URL);
              PreparedStatement pst = conn.prepareStatement(findAllQuery);
              ResultSet rs = pst.executeQuery();) {
            while (rs.next()) {
                clienti.add(generateCliente(rs));
            }
        } catch (SQLException e) {
            log.error("Errore intervenuto durante le operazioni di utilizzo RDBMS", e);
            throw new DatatabaseOperationExecption(e);
        }
        return clienti;
    }

    @Override
    public Cliente create(Cliente entity) {
        unsupportedOperation("create");
        return null;
    }

    @Override
    public Integer update(Cliente entity) {
        unsupportedOperation("update");
        return null;
    }

    @Override
    public Integer delete(Integer key) {
        unsupportedOperation("delete");
        return null;
    }









}
