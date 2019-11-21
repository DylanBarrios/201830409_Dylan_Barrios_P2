package analizadorLexico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import UII.Principal;
import analizadorSintactico.AnalizadorSintactico;

/**
 *
 * @author dylan
 */
public class CargarArchivo {
    AnalizadorLexico anal;
    AnalizadorSintactico anal2;
    JFileChooser select = new JFileChooser();
    File files;
    FileInputStream in;
    FileOutputStream out;
    public String docCargado;
    
    
    public String cargar(File files) {
        String doc = "";
        try {
            in = new FileInputStream(files);
            int ascci;
            while ((ascci = in.read()) != -1) {
                char caracter = (char) ascci;
                doc += caracter;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return doc;
    }

    public void verArchivo() {
        if (select.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION) {
            files = select.getSelectedFile();
            if (files.canRead()) {
                if (files.getName().endsWith("txt")) {
                    docCargado = cargar(files);
                    anal = new AnalizadorLexico();
                    anal.separadorLineas(docCargado);
                    
                    anal2 = new AnalizadorSintactico();
                    anal2.analizis(docCargado);
                } else {
                    JOptionPane.showMessageDialog(null, "Archivo No Compatible");
                }
            }
        }
    }
}
