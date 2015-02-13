/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package markdowngenerater;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.rmi.activation.ActivationSystem;

/**
 *
 * @author umino
 */
public class MarkDownGenerater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String resulString;
        try {
            resulString = (String)clipboard.getData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException e) {
            resulString = null;
        } catch (IOException e) {
            resulString = null;
        }
        
        System.out.println(resulString);
    }
    
}
