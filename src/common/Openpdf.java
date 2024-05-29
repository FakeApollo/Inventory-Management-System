/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import Dao.InventoryUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author hin26
 */
public class Openpdf {
    public static void openById(String Id){
        try {
            if((new File(InventoryUtils.billPath + Id+".pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler "+InventoryUtils.billPath+""+Id+".pdf");
            }
            else{
                JOptionPane.showMessageDialog(null, "File does not exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
