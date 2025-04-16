package Controllers;

import Models.Persona;
import Views.ShowConsole;

public class MetodosBusquedaBinaria {

    private Persona [] people;
    private ShowConsole pantalla;


    public MetodosBusquedaBinaria (Persona [] people) {

        this.people = people;
        pantalla = new ShowConsole();
        pantalla.showMessage("metodo de busqueda binaria");
    }

    private int findPersonByCode (int code){
        int bajo = 0;
        int alto = people.length - 1;

        while (alto >= bajo) {
            int central =(central = alto + bajo)/2;

            if (people [central].getCode() == code) {
                return central;
                
            }

            if (people [central].getCode() > code) {

                alto = central -1; // izq

            }else{

                bajo = central + 1; //der
                
            }
            
        }
        return -1;
       
    }
    public void ShowPersonByCode(){
        int codeToFind = pantalla.inputCode();
        int indexPerson = findPersonByCode(codeToFind);

        if (indexPerson == -1) {
            pantalla.showMessage("pesona de codigo "+ codeToFind + "encontrada");
            pantalla.showMessage(people [indexPerson].toString());
        }else{
            pantalla.showMessage("Persona con codigo \"" + codeToFind + "\" no encontrada.");           
        }
    }
    
    public void ShowPersonByName(){
        //String nametofind = pantalla.inputName();
        String nameToFind = pantalla.inputName();
        int indexPerson = findPersonByName(nameToFind);
        if (indexPerson >= 0) {
            pantalla.showMessage("Persona con nombre \"" + nameToFind + "\" encontrada:");
            pantalla.showMessage(people[indexPerson].toString());
        } else {
            pantalla.showMessage("Persona con nombre \"" + nameToFind + "\" no encontrada.");
        }

    }
    

    // 1 antes de llamar a este metodo findPersonByName
    public int findPersonByName (String name){
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equalsIgnoreCase(name)) {
                return i; // retorna la posicion donde se encontro el valor
            }
        }
        return -1;
    }
    
}   
