package com.example.javadb.exeception;

import java.sql.SQLException;

public class DatatabaseOperationExecption extends RuntimeException{
    public DatatabaseOperationExecption(Exception e) {
    }

    public DatatabaseOperationExecption() {
    }
}
