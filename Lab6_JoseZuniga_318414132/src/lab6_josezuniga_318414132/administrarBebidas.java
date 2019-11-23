package lab6_josezuniga_318414132;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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
    
    public void escribirArchivo() throws IOException{
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file,false);
            bw = new BufferedWriter(fw);
            for (Bebida bebida : bebidas) {
                bw.write(bebida.getCodigo() + ";");
                bw.write(bebida.getMarca() + ";");
                bw.write(bebida.getBebida() + ";");
                bw.write(bebida.getAzucar() + ";");
                bw.write(bebida.getAlcohol() + ";");
                bw.write(bebida.getLote() + ";");
                bw.write(bebida.getCantidad() + ";");
                bw.write(bebida.getPrecio() + ";");
                bw.write(bebida.isNacional() + ";");
                for (String colorante : bebida.getColorantes()) {
                    bw.write(colorante + ",");
                }
                bw.write(";");
                SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                bw.write(sd.format(bebida.getFechaVencimineto()) + ";");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void leerArchivo(){
        bebidas = new ArrayList<>();
        if (file.exists()) {
            try {
                String linea;
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((linea = br.readLine()) != null) {
                    String[] tokens = linea.split(";");
                    String codigo = tokens[0], marca = tokens[1], bebida = tokens[2];
                    double azucar = Double.parseDouble(tokens[3]);
                    int alcohol = Integer.parseInt(tokens[4]), lote = Integer.parseInt(tokens[5]),
                            cantidad = Integer.parseInt(tokens[6]), precio = Integer.parseInt(tokens[7]);
                    boolean nacional = Boolean.parseBoolean(tokens[8]);
                    String[] Colores = tokens[9].split(",");
                    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha = sd.parse(tokens[10]);
                    bebidas.add(new Bebida(codigo, marca, bebida, azucar, alcohol, lote, cantidad, precio, nacional, fecha));
                    for (String color : Colores) {
                        bebidas.get(bebidas.size() - 1).setColorante(color);
                    }
                }
            } catch (Exception e) {
            }
        }
    }
    
    public void escribirFact(String x){
        try {
            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(x);
            bw.flush();
        } catch (Exception e) {
        }
    }
}
