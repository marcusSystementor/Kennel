import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    
    private Scanner scanner = new Scanner(System.in);
    ArrayList<Dog> listOfDogs = new ArrayList<>();

    public void addDog() {

        System.out.println("Register a new dog");
        System.out.println("What is the name of the dog?");
        
        String name = scanner.nextLine();
         System.out.println("What is the race of the dog?");
        String race = scanner.nextLine();
         System.out.println("What is the age of the dog?");
        double age = scanner.nextDouble();
         System.out.println("What is the weight of the dog?");
        double weight = scanner.nextDouble();
        
       

        listOfDogs.add(new Dog(name, race, age, weight));

        System.out.println("Funkar det?");
        for (int i = 0; i< listOfDogs.size(); i++) {
            System.out.println(listOfDogs.get(i).getName());
        }

    }

    public void deleteDog() {
   

        System.out.println("Enter the name of the dog you want to delete from the register");

        String enterName = scanner.nextLine();
        
        

              for (int i = 0; i < listOfDogs.size(); i++) {
           



            if (enterName.equalsIgnoreCase(listOfDogs.get(i).getName())) {
       
                listOfDogs.remove(i);
                System.out.println("Dog deleted");

            }
            else {
                System.out.println("Dog doesnt exist");
            }
            
            }
       
        

   

           

        }

    }


