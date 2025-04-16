import Controllers.MetodosBusqueda;
import Models.Persona;
import Views.ShowConsole;

public class App {

    public static void main(String[] args) {
        
        int[] datos = {5, 2, 8, 1, 9, 4};
        int valorABuscar = 8;

        
        Persona[] personas = new Persona[7];
        personas[0] = new Persona (101, "juan");
        personas[1] = new Persona (102, "sebas");
        personas[2] = new Persona (103, "manuel");
        personas[3] = new Persona (104, "esteban");
        personas[4] = new Persona (105, "vero");
        personas[5] = new Persona (106, "caro");
        personas[6] = new Persona (107, "liz");

        MetodosBusqueda mB = new MetodosBusqueda(personas);

        // busquedaLineal bL = new busquedaLineal();
        // int iE =  (datos, valorABuscar);

        // if (iE!= -1) {
        //     System.out.println("El valor " + valorABuscar + " se encontró en el índice: " + iE);
        // } else {
        //     System.out.println("El valor " + valorABuscar + " no se encontró en el arreglo.");
        // }


        
        
    }

   
    
}
    

