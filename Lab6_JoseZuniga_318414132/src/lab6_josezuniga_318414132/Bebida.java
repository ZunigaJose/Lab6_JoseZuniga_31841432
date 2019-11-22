package lab6_josezuniga_318414132;

import java.util.ArrayList;
import java.util.Date;

public class Bebida {
    private String codigo, marca, bebida;
    private double azucar;
    private int alcohol, lote, cantidad, precio; 
    private boolean nacional;
    private ArrayList<String> colorantes = new ArrayList<>();
    private Date fechaVencimineto;

    public Bebida() {
    }

    public Bebida(String codigo, String marca, String bebida, double azucar, int alcohol, int lote, int cantidad, int precio, boolean nacional, Date fechaVencimineto) {
        this.codigo = codigo;
        this.marca = marca;
        this.bebida = bebida;
        this.azucar = azucar;
        this.alcohol = alcohol;
        this.lote = lote;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nacional = nacional;
        this.fechaVencimineto = fechaVencimineto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public double getAzucar() {
        return azucar;
    }

    public void setAzucar(double azucar) {
        this.azucar = azucar;
    }

    public int getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(int alcohol) {
        this.alcohol = alcohol;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }

    public ArrayList<String> getColorantes() {
        return colorantes;
    }

    public void setColorantes(ArrayList<String> colorantes) {
        this.colorantes = colorantes;
    }
    
    public String getColorante(int pos) {
        return colorantes.get(pos);
    }

    public void setColorante(String colorante) {
        this.colorantes.add(colorante);
    }

    public Date getFechaVencimineto() {
        return fechaVencimineto;
    }

    public void setFechaVencimineto(Date fechaVencimineto) {
        this.fechaVencimineto = fechaVencimineto;
    }

    @Override
    public String toString() {
        return bebida;
    }
}
