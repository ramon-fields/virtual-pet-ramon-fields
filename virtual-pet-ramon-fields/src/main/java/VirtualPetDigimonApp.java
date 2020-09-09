import java.util.Scanner;

public class VirtualPetDigimonApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetDigimon agumon = new VirtualPetDigimon();
        //Input and Output
        System.out.println("----------------------------");
        System.out.println("Welcome to the Digital World");
        System.out.println("----------------------------");
        System.out.println("----------------------------------");
        System.out.println("Meet Agumon your very own Digimon.");
        System.out.println("----------------------------------");
        System.out.println(agumon.status());
        //System.out.println("-----------------------");
        System.out.println("What do you want to do?");
        System.out.println("-----------------------");
        System.out.println(agumon.menu());
        String userInput = input.nextLine();

        while (!userInput.equals("5")) {

            if (userInput.equals("1")) {
                agumon.feed();
                agumon.tick();
                System.out.println("Agumon: Nom Nom Nom Nom");
                System.out.println("You gave Agumon some food.");
                System.out.println(agumon.status());
            } else if (userInput.equals("2")) {
                agumon.quenchThirst();
                System.out.println("Agumon: Aaah");
                System.out.println("You gave Agumon some water.");
                System.out.println(agumon.status());
            } else if (userInput.equals("3")) {
                agumon.digivolve();
                System.out.println("Agumon digivolve to - Greymon! Greymon! Greymon, I'm Greymon! I'm big and I'm bad...");
                System.out.println("You Digivolved Agumon.");
            } else if (userInput.equals("4")) {
                agumon.rest();
                System.out.println("Agumon: Zzzz");
                System.out.println("You let Agumon rest.");
            } else {
                System.out.println("Not an option...");
            }
            System.out.println("What do you want to do?");
            System.out.println("Press 1 to Feed");
            System.out.println("Press 2 to Quench thirst");
            System.out.println("Press 3 to Digivolve");
            System.out.println("Press 4 to Rest");
            System.out.println("Press 5 to Exit");
            userInput = input.nextLine();
        }
        input.close();
    }
}