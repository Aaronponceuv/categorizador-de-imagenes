/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author aaronponce
 */
public class Image {

    private String Path;
    private Process python;
    private String Path_Python; 
    private BufferedReader lectura;
    private InputStream input;
    
    public Image(String Path_Python, String Path) {
        this.Path = Path_Python + " " + Path;
        this.lectura = null;
        this.input = null;
    }

    public void ejecutar() {
        try {
            this.python = Runtime.getRuntime().exec(this.Path);
            this.python.waitFor();
            this.input = this.python.getInputStream();
            } catch (Exception e) {
            System.err.println("Error en Image.ejecutar()");
            e.printStackTrace();
        }
    }
    
    public void mostrar(){
        try{
            lectura = new BufferedReader(new InputStreamReader(this.input));
            String linea = lectura.readLine();
            while (linea != null) {
               System.out.println(linea);
               linea = lectura.readLine();
            }
        }catch(Exception e){
            System.err.println("Error en Image.ejecutar()");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Image image = new Image(args[0],args[1]);
        image.ejecutar();
        image.mostrar();
    }

}
