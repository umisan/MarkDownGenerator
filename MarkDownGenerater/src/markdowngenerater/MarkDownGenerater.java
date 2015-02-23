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
import java.sql.DriverManager;
import java.util.Scanner;

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
        String element[] = new String[7];
        try {
            resulString = (String)clipboard.getData(DataFlavor.stringFlavor);
        } catch (UnsupportedFlavorException e) {
            resulString = null;
        } catch (IOException e) {
            resulString = null;
        }
        String changedString = resulString.replaceAll("：", ":");
        Scanner scanner = new Scanner(changedString).useDelimiter("\n{2}");
        int i = 0;
        while(scanner.hasNext())
        {
            element[i] = scanner.next();
            System.out.println(element[i]);
            i++;
        }
        String[] temp = element[0].split("【");
        String[] title = temp[1].split("】");
        String[] time = element[1].split(":");
        String[] place = element[2].split(":");
        String[] stuff = element[3].split(":");
        String[] menber = element[4].split(":");
        String[] talk = element[5].split(":");
        String[] message = element[6].split(":");
        //System.out.println(resulString);
    }
}
