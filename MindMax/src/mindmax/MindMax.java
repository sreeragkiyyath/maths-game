/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindmax;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sastha
 */
public class MindMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WindowFrame windowFrame = new WindowFrame();
        while (true) {
            try {
                Thread t1 = new Thread(windowFrame);
                windowFrame.setVisible(true);
                windowFrame.setResizable(false);
                t1.start();
                t1.sleep(1688);//1878
            } catch (InterruptedException ex) {
                Logger.getLogger(MindMax.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
