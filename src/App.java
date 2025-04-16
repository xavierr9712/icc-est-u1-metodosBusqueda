import Controllers.MetodosBusqueda;
import Controllers.MetodosBusquedaBinaria;
import Models.Persona;
import Views.ShowConsole;

public class App {

    public static void main(String[] args) {
        
        int[] datos = {5, 2, 8, 1, 9, 4};
        int valorABuscar = 8;

        
        Persona[] personas = new Persona[7];
        personas[0] = new Persona (101, "juan");
        personas[1] = new Persona (102, "fer");
        personas[2] = new Persona (103, "david");
        personas[3] = new Persona (104, "ismael");
        personas[4] = new Persona (105, "mafer");
        personas[5] = new Persona (106, "cristian");
        personas[6] = new Persona (107, "camila");

        //MetodosBusqueda mB = new MetodosBusqueda(personas);
        MetodosBusquedaBinaria mBB = new MetodosBusquedaBinaria(personas);
        mBB.ShowPersonByName();



        //mB.ShowPersonByName();

        // busquedaLineal bL = new busquedaLineal();
        // int iE =  (datos, valorABuscar);

        // if (iE!= -1) {
        //     System.out.println("El valor " + valorABuscar + " se encontró en el índice: " + iE);
        // } else {
        //     System.out.println("El valor " + valorABuscar + " no se encontró en el arreglo.");
        // }


        
        
    }

   
    
}
    

