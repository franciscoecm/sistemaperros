package sistemaperros;

import java.util.Scanner;
/**
 *
 * @author fran_
 */
public class Perro {
    
    private String raza;
    private long socio;
    private int edad;
    private double peso;
    private String color;
    private boolean conforme;
    Scanner entrada = new Scanner(System.in);
    
    
    public Perro(){
        asigna();
        this.conforme = false;
    }
    
    public void asigna(){
        
        System.out.print("Ingrese raza del perro: ");
        raza = entrada.next();
        System.out.print("Ingrese el número de socio: ");
        socio = entrada.nextInt();
        System.out.print("Ingrese la edad: ");
        edad = entrada.nextInt();
        System.out.print("Ingrese el peso: ");
        peso = entrada.nextDouble();
        System.out.print("Ingrese el color: ");
        color = entrada.next();
        
    }
    
    public void muestra(Perro p){
        
        System.out.println(p.toString());
         
    }

    public boolean isConforme() {
        return conforme;
    }

    public void setConforme(boolean conforme) {
        this.conforme = conforme;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public long getSocio() {
        return socio;
    }

    public void setSocio(long socio) {
        this.socio = socio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }  
}
