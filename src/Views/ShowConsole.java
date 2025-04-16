package Views;
import java.util.Scanner;
public class ShowConsole {
    
    private Scanner scanner;

    public ShowConsole (){
        this.scanner = new Scanner(System.in);
        showBanner();
    }
    public void showBanner(){
        System.out.println("***Metodos de busqueda***");
    }
    public int inputCode(){
        System.out.println("ingrese el codigo");
        int code = scanner.nextInt();
        return code;

    }
    public String inputName(){
        System.out.println("Ingrese el nombre a buscar:");
        String name = scanner.next();
        return name;
    }
    public void showMessage ( String message){
        System.out.println(message);
    }
    


}
