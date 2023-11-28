package com.example.javadb.dao;

import com.example.javadb.entities.Cliente;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class ClientiDAOTest {


    private static final Logger log = LogManager.getLogger("ClientiDAO.class");

    //    @Test
    void findById() {
    }

    @Test
    void findAll() {

        ClientiDAO cd = new ClientiDAO();
        List<Cliente> clienteList = cd.findAll();
        assert (clienteList.size() > 0);
        for (Cliente c : clienteList) {
            log.debug(c);

        }


    }

    //    @Test
    void create() {
    }

    //    @Test
    void update() {
    }

    //    @Test
    void delete() {
    }
}