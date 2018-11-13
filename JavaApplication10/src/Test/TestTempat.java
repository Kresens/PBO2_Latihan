/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.IOException;
import javax.swing.JFileChooser;
import model.Tempat;

/**
 *
 * @author Priska
 */
public class TestTempat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        JFileChooser jf = new JFileChooser();
        int returnVal = jf.showOpenDialog(null);
        Tempat tempat = new Tempat();
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            tempat.bacaKonfigurasi(jf.getSelectedFile());
            System.out.println("Isi peta = ");
            System.out.println(tempat.getIsi());
            if(tempat.getDaftarSel()!=null){
                for (int i = 0; i < tempat.getDaftarSel().size(); i++) {
                    System.out.println(
                            tempat.getDaftarSel().get(i).getPosisiX()+","
                            +tempat.getDaftarSel().get(i).getPosisiY()+","
                            +tempat.getDaftarSel().get(i).getNilai());
                    
                }
            }
        }
    }
    
}
