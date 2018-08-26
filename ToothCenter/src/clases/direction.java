
package clases;

import java.io.*;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author SEGsoft
 */
public class direction {
    String dir="";
    
    public void readTxt(String d){
        String txt="";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(d));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine())!=null){
                temp += bfRead;
            }
            txt = temp;
        } catch (Exception e) {
            showMessageDialog(null, "No se encontro el arhivo");
        }
        dir = txt;
    }
    
    public String getDir(){
        return dir;
    }
}
