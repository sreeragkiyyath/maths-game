/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serial;

import com.bean.Common;
import com.gui.RegForm;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Students
 */
public class SerialDeserial {

    public static void save(Common common, String recordNo) {
        try {
            ObjectOutputStream out = null;
            out = new ObjectOutputStream(new FileOutputStream(recordNo + ".ser"));
            out.writeObject(common);
            System.out.println("Serializing...");
            out.close();
            System.out.println("Serialized...");
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(SerialDeserial.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    public static Common deserial(String name) {
       Common common = null;
        try {
            ObjectInputStream in = null;
            
            in = new ObjectInputStream(new FileInputStream(name + ".ser"));
            Object obj = in.readObject();
            if (obj != null && obj instanceof Common) {
                common = (Common) obj;
            }
            in.close();
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(RegForm.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SerialDeserial.class.getName()).log(Level.SEVERE, null, ex);
        }


        return common;
    }
}