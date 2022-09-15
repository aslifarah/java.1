public class Mars {
    public static void main(String[] args) throws InterruptedException {
        //Create ColonyName string, and set it equal to your desired name
        String ColonyName = "MarsTeam";

        //Create ShipPopulation variable equal to 300
        int ShipPopulation = 300;

        //Create ShipFood variable equal to 4000.00
        double ShipFood = 4000.00;

        //Create Landing boolean variable equal to true
        boolean Landing = true;

        //calculate how much food left after landing
        ShipFood = ShipFood - (ShipPopulation * 0.75);
        ShipFood = ShipFood - (ShipPopulation * 0.75);

        //Print the amount of food that is left
        System.out.println(ShipFood);

        //Increase ShipFood by 50% from extra crate
        ShipFood = ShipFood + (ShipFood * 0.5);

        //5 more babies join the ShipPopulation
        ShipPopulation = ShipPopulation + 5;

        //Create LandingLocation String and set it equal to "The Hill" or "The Plain" or "The Ocean"
        String LandingLocation = "The Ocean";

        //Check if LandingLocation is equal to "The Plain"
        if (LandingLocation.equalsIgnoreCase("The Plain"))
        {
            System.out.println("Bbzzz Landing on the Plain");
        }
        else
        {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        //Call a function LandingCheck() with parameter of 100
        Landing = LandingCheck(100);

        new GuessingGame();
        //After playing the GuessingGame it is finally time for the expedition team to pack and head out
        //Run the MarsExpedition by calling a new MarsExpedition constructor
        new MarsExpedition();
        //After an excited expedition it is time for the boring paperwork
        //Run the FindingsLists by calling a new FindingsLists constructor
        new FindingsList();

    }
    //function called LandingCheck with an int parameter
    private static boolean LandingCheck(int Loops) throws InterruptedException
    {
    //for loop that starts at i = 0, loops until i is equal to Loops, and i increments by 1 each loop
        for (int i = 0; i <= Loops; i++)
        {
            //check if i is divisible by 3, and that i is divisible by 5
            if (((i % 3) == 0) && ((i % 5) == 0))
            {
                System.out.println("Keep Center");
            }
            else if ((i % 5) == 0)
            {
                System.out.println("Right");
            }
            else if ((i % 3) == 0)
            {
                System.out.println("Left");
            }
            else
            {
                System.out.println("Calculating");
            }

            //Thread.sleep(250) slows the console down by 250 milliseconds
            Thread.sleep(250);
        }
        //Print "Landed"
        System.out.println("Landed");

        //The ship has landed on Mars. Return the value false;
        return false;
    }
}
