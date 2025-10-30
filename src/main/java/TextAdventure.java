import java.util.Scanner;

public class TextAdventure {
    public static void main(String[] args) {
        System.out.println("TICK TOCK");
        System.out.println("Scene 1: The Homebody \n --------------\n" + "> A day like today starts like any other. \n> The clouds cover the vast endless blue sky, the rain pours down in " +
                "buckets filling the shoulders of the roads with water and fallen leaves from trees.\n> Your friends recent death plaqued your every thought. \n> He had gone missing without a trace and had been presumed dead many days ago.");
        System.out.println("> You had rotted at home ever since. You had no reason to go out. You had zero clue where he could be and to be honest he couldn't have survived this long if he was hiding anyways.");
        boolean running = true;
        int choice;
        Scanner sc = new Scanner(System.in);
        while(running) {

            System.out.println("\nWhat should you do other than sit around all day?");
            System.out.println(" 1 - Turn on some TV (Any youtuber of your choosing of course)\n 2 - Work on some Homework\n 3 - Visit your friends parents and comfort them\n 4 - Nah. Sit around some more.\n 5 - Grab a bite to eat.");


            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You start watching some TV. But inevitably realize that your multiple days of laziness have left you with nothing to watch. What now?");
                    break;
                case 2:
                    System.out.println("As you start to work on homework you start to feel extreme dread. You decide to save it for a later date and look for something new to do. What now?");
                    break;
                case 3:
                    System.out.println("You put on your shoes and begin to leave your house. This was something you had to do. If not for your sanity then for theirs.");
                    runningA = false;
                    break;
                case 4:
                    System.out.println("You sat around. What now?");
                    break;
                case 5:
                    System.out.println("You made a salami sandwich and orange juice. You sat down to eat and continued lazing after. What now?");
                    break;
            }
        }
        System.out.println("Scene 2: A Walk and A Rainy Day \n --------------\n
    }
}
