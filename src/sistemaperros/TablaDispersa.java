package sistemaperros;

import java.util.Scanner;

// Inicialización de la tabla dispersa
public class TablaDispersa {

    static final double R = 0.618034;
    static final int M = 101;
    private Elemento[] tabla;
    int numElementos;
    Scanner scanner = new Scanner(System.in);
    
    public class Elemento {

        Perro perro;
        Elemento sgte;

        public Elemento(Perro p) {

            perro = p;
            sgte = null;

        }
        
        public Perro getPerro() {

            return perro;

        }
    }
    
    static int dispersion(long x) {
        
        double t;
        int v;
        t = R * x - Math.floor(R * x); // parte decimal 
        v = (int) (M * t);
        return v;
        
    }

    public void TablaDispersaEnlazada() {

        tabla = new Elemento[M];

        for (int k = 0; k < M; k++) {
            tabla[k] = null;
        }
        numElementos = 0;

    }

    public void insertar(Perro p) {
        
        int posicion;
        Elemento nuevo;
        
        posicion = dispersion(p.getSocio());
        nuevo = new Elemento(p);
        nuevo.sgte = tabla[posicion];
        tabla[posicion] = nuevo;
        numElementos++;
    }
    
    boolean conforme(Perro p){
        
        int opc;
        
        System.out.println("Presione 1 si desea eliminar el perro del sistema: ");
        opc = scanner.nextInt();
        
        if(opc == 1){
            p.setConforme(true);
        }
        
        return p.isConforme();
        
    }
    
    public void eliminar(long codigo) {
        
        int posicion;
        posicion = dispersion(codigo);
        
        if (tabla[posicion] != null) // no está vacía 
        {
            Elemento anterior, actual;

            anterior = null;
            actual = tabla[posicion];
            while ((actual.sgte != null)
                    && actual.getPerro().getSocio() != codigo) {
                anterior = actual;
                actual = actual.sgte;
            }
            if (actual.getPerro().getSocio() != codigo)
                System.out.println("No se encuentra en la tabla el socio "
                        + codigo);
            else if (conforme(actual.getPerro())) //se retira el nodo 
            {
                if (anterior == null) // primer nodo 
                    tabla[posicion] = actual.sgte;

            }
        }
    }
    
    public Elemento buscar(long codigo) {
       
        Elemento p = null;
        int posicion;
        posicion = dispersion(codigo);
        if (tabla[posicion] != null) {
            p = tabla[posicion];
            while ((p.sgte != null) && p.perro.getSocio() != codigo) {
                p = p.sgte;
            }
            if (p.perro.getSocio() != codigo) {
                p = null;
            }
        }
        return p;
    }
}
