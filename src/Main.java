public class Main
{

    public static void main(String[] args)
    {
        String affiliation;
        affiliation = "o";

            if (affiliation.equalsIgnoreCase("R"))
                {
                    System.out.println("You get a Republican Elephant.");
                }
            else if (affiliation.equalsIgnoreCase("D"))
                {
                    System.out.println("You get a Democratic Donkey.");
                }
            else if (affiliation.equalsIgnoreCase("I"))
                {
                    System.out.println("You're an Independent Man.");
                }
            else
                {
                    System.out.println("I don't know what you are!");
                }



    }
}
