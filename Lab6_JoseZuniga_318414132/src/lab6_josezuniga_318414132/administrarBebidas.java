package lab6_josezuniga_318414132;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class administrarBebidas {
    private ArrayList<Bebida> bebidas = new ArrayList<>();
    private File file;

    public administrarBebidas(String path) {
        this.file = new File(path);
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }
    
    public void setBebida(Bebida bebida) {
        this.bebidas.add(bebida);
    }
    
    public void escribirArchivo(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file,false);
            bw = new BufferedWriter(fw);
            
        } catch (Exception e) {
        }
    }
    
    public void leerArchivo(){
        
    }
}
