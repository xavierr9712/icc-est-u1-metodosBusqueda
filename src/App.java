public class App {

    private MetodosBusqueda metodosBusqueda; 

    public App() {
        this.metodosBusqueda = new MetodosBusqueda();
    }

    public static void main(String[] args) {
        App app = new App();
        int[] datos = {5, 2, 8, 1, 9, 4};
        int valorABuscar = 8;

        int indiceEncontrado = app.metodosBusqueda.busquedaLineal(datos, valorABuscar);

        if (indiceEncontrado != -1) {
            System.out.println("El valor " + valorABuscar + " se encontró en el índice: " + indiceEncontrado);
        } else {
            System.out.println("El valor " + valorABuscar + " no se encontró en el arreglo.");
        }
    }
}
    

