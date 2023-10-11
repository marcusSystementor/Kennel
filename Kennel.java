import java.util.Scanner;

public class Kennel {

    private Scanner scanner = new Scanner(System.in);
    private Register registerOfDogs = new Register();


    public void mainMenu() {

        boolean runMenu = true;

        do {
        

        System.out.println("Welcome to the kennel, please make a choice");
        
        System.out.println("1. Register a new dog");
        System.out.println("2. List, taillengt"); // Todo
        System.out.println("3. Delete dog");
        System.out.println("4. Exit the program");
        int choice = scanner.nextInt();
        
       
        switch(choice) {
            case 1:
            registerOfDogs.addDog();
            break;

            case 3:
            registerOfDogs.deleteDog();
            break;

            case 4:
            runMenu = false;
            break;
        } 

     
     } while(runMenu);
    }

}
