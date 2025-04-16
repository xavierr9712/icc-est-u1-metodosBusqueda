package Controllers;

import Models.Persona;
import Views.ShowConsole;

public class MetodosBusqueda {
    private ShowConsole ShowConsole;
    private Persona[] people;

    public MetodosBusqueda(Persona[] persons) {

        ShowConsole = new ShowConsole();
        this.people = persons;
        ShowPersonByName();
        showPerson();

    }

    public int busquedaLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i; // retorna la posicion donde ese necontro el valor
            }
        }
        return -1; // es para devorlver en caso de que no encuentre ninguna consecuencia

    }

    public int findPersonByCode(int code) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i; // retorna la posicion donde ese necontro el valor
            }
        }
        return -1;
    }

    public int findPersonByName(String nombre) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().compareTo(nombre) == 0) {
                return i; // retorna la posicion donde ese necontro el valor
            }
        }
        return -1;
    }

    ////////

    public void ShowPersonByName() {
        String nameToFind = ShowConsole.inputName();
        int indexPerson = findPersonByName(nameToFind);
        if (indexPerson >= 0) {
            ShowConsole.showMessage("Persona con nombre \"" + nameToFind + "\" encontrada:");
            ShowConsole.showMessage(people[indexPerson].toString());
        } else {
            ShowConsole.showMessage("Persona con nombre \"" + nameToFind + "\" no encontrada.");
        }
    }

    public void showPerson() {
        int codeToFind = ShowConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);

        if (indexPerson >= 0) {
            ShowConsole.showMessage("persona con codigo " + codeToFind + " encontrada");
            ShowConsole.showMessage(people[indexPerson].toString());
        } else {
            ShowConsole.showMessage("persona no encontrada");
        }
    }

    public void imprimirArreglo(int[] arreglo) {
        int tam = arreglo.length;

        for (int i = 0; i < tam; i++) {
            System.out.println(arreglo[i] + " / ");
        }
        System.out.println();
    }

}
