import java.util.Scanner;

public class MarsExpedition {
    //public constructor function
    public MarsExpedition(){
        //Scanner variable named input
        Scanner input = new Scanner(System.in);

        //Print "Expedition prep program starting..."
        System.out.println("Expedition prep program starting...");
        //Print "Booting up..."
        System.out.println("Booting up...");
        //Print "..."
        System.out.println("...");
        //Print "..."
        System.out.println("...");
        //Print "..."
        System.out.println("...");
        //Print "Ready"
        System.out.println("Ready");

        //Print "Hello user. What is your name?"
        System.out.println("Hello user, What is your name?");

        //String variable named name equal to input.nextLine()
        String name = input.nextLine();

        //Print "Hi, name --- Welcome to the Expedition prep program.\n
        //Are you ready to head out into the new world?\n
        // Type Y or N"
        System.out.println("Hi, " + name + " --- Welcome to the Expedition prep program.\n" +
                "Are you ready to head out into the new world?\n" +
                "Type Y or N");

        //String variable called excited equal to input.nextLine()
        String excited = input.nextLine();

        //check if excited is equal to Y ignoring case
        if (excited.equalsIgnoreCase("Y"))
        {
        //Print "I knew you would say that. You are team leader for a reason."
            System.out.println("I knew you would say that. You are team leader for a reason.");
        }
        else
        {
        //Print “To bad you are team leader. You have to go.”
            System.out.println("To bad you are team leader. You have to go.");
        }

        //Print "How many people do you want on your expedition team? (Input an int number)"
        System.out.println("How many people do you want on your expedition team? (Input an int number)");

        //int variable named teamSize equal to input.nextInt()
        int teamSize = input.nextInt();
        input.nextLine();

        //check if teamSize is greater than 2
        if (teamSize > 2)
        {
        //Print "That's way to many people. We can only send 2 more members."
            System.out.println("That's way to many people. We can only send 2 more members");
        //Set teamSize equal to 2
            teamSize = 2;
        }
        //Use an else-if statement to check if teamSize is less than 2
        else if (teamSize < 2)
        {
        //Print "That's not enough people. We need you and 2 more members."
            System.out.println("That's not enough people. We need you and 2 more members.");
        //Set teamSize equal to 2
            teamSize = 2;
        }
        //Use an else if statement to check if teamSize equals 2
        else if (teamSize == 2)
        {
        //Print "That's a perfect sized team. Good job."
            System.out.println("That's a perfect sized team. Good job.");
        }

        //Print "You are allowed to bring one weapon with you. You know, just incase. What do you want to bring?"
        System.out.println("You are allowed to bring one weapon with you. You know, just incase. What do you bring?");
        //Create a String variable called weapon and set it equal to input.nextInt()
        String weapon = input.nextLine();
        //Print "Nice choice, you will be bringing a weapon with you."
        System.out.println("Nice choice, you will be bringing a " + weapon + " with you");

        //Print "You have the choice of 3 vehicles"
        //"\nA: A Mars Roover"
        //"\nB: A Chevy Silverado"
        //"\nC: A Honda Civic"
        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");
        //Create a String variable named vehicleChoice and set it equal to input.nextLine()
        String vehicleChoice = input.nextLine();

        //Use an if statement to check if vehicleChoice is equal to A ignoring case
        if (vehicleChoice.equalsIgnoreCase("A"))
        {
        //Create a new String variable called vehicle and set it equal to "Mars Roover"
            vehicleChoice = "a Mars Roover";
        }
        //Use an else if statement to check if vehicleChoice is equal to B ignoring case
        else if (vehicleChoice.equalsIgnoreCase("B"))
        {
        //Create a new String variable called vehicle and set it equal to "Chevy Silverado"
            vehicleChoice = "a Chevy Silverado";
        }
        //Use an else if statement to check if vehicleChoice is equal to C ignoring case
        else if (vehicleChoice.equalsIgnoreCase("C"))
        {
        //Create a new String variable called vehicle and set it equal to "Honda Civic"
            vehicleChoice = "a Honda Civic";
        }
        //Use an else statement for if vehicleChoice does not equal any of the above
        else
        {
        //Create a new String variable called vehicle and set it equal to "your feet"
            vehicleChoice = "your feet";
        }

        //Print "Your expedition team is now ready"
        //"\nLed by name with teamSize teammates."
        //"\nTo explore the surface of Mars using vehicle."
        //"\nExploration team heads out in"
        //"\n5...."
        //"\n4...."
        //"\n3...."
        //"\n2...."
        //"\n1...."
        //"\nGO GO GO!"
        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");
    }

}
