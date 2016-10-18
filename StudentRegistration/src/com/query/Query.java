package com.query;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Query {

    public boolean delete(String colum, String value, Object TableName) {
        boolean delete =false;
        try {
            try {               
                if (String.valueOf(TableName.getClass().getField(colum).get(TableName)).equalsIgnoreCase(value)) {
                     delete = new File(String.valueOf(TableName.getClass().getField("metaName").get(TableName))).delete();
                } else {
                    System.out.println("not equal");
                }
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, ex);
        }

        return delete;
        
    }
}
