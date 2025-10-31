import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


/* try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/
//  ^ Learned this one for funzies. Partly just a pause so you can read and not get lost in the process. I also adjust varying on how long the reading gets.
//    no excessive wait times.
// Also researched how to do some lists. No double picking cause sometimes it could affect flavor text.

public class TextAdventure {
    public static void main(String[] args) {
        System.out.println("TICK TOCK\n");




        // Scene 1

        System.out.println("Scene 1: The Homebody");
        try { Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("--------------\n" + "> A day like today starts like any other. \n> The clouds cover the vast endless blue sky " +
                "the shoulders of the roads filling with fallen leaves from trees.\n> Your friends recent death plaqued your every thought. \n> He had gone missing without a trace and had been presumed dead many days ago.");
        System.out.println("> You had rotted at home ever since.");
        boolean running = true;
        int choice;
        Scanner sc = new Scanner(System.in);
        while(running) {

            System.out.println("\nWhat should you do other than sit around all day?");
            System.out.println(" 1 - Turn on some TV (Any youtuber of your choosing of course)\n 2 - Work on some Homework\n 3 - Visit your friends house to help soothe your mind. \n 4 - Nah. Sit around some more.\n 5 - Grab a bite to eat.");

            System.out.print("Whats your choice? ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You start watching some TV. But inevitably realize that your multiple days of laziness have left you with nothing to watch. What now?");
                    break;
                case 2:
                    System.out.println("As you start to work on homework you start to feel extreme dread. You decide to save it for a later date and look for something new to do. What now?");
                    break;
                case 3:
                    System.out.println("You get up and prepare to leave your house. This was something you needed to recover your own sanity even if it was at the cost of your bed-rotting.");
                    running = false;
                    break;
                case 4:
                    System.out.println("You sat around. What now?");
                    break;
                case 5:
                    System.out.println("You made a salami sandwich and orange juice. You sat down to eat and continued lazing after. What now?");
                    break;
            }
            if(choice != 3) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("\nLoading next scene......\n");
        try { Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}





        // Scene 2

        System.out.println("Scene 2: A Walk and A Rainy Day \n--------------\n");
        try { Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
        System.out.println("> Before you go out you look out the window. The clouds have turned to a darker gray.\n> You stop and think about whether or not you should put on some rain clothes. ");
        running = true;
        List<Integer> prevChoices = new ArrayList<>();
        int rainPrep = 0;
        while(running) {
            System.out.println("\nWhat should you put on before you go out?");
            System.out.println(" 1 - Put on rain boots\n 2 - Grab an umbrella\n 3 - Put on a rain coat\n 4 - Leave the house");

            System.out.print("Whats your choice? ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You put on the rain boots.");
                    if(!(prevChoices.contains(choice))) {
                        rainPrep++;
                    }
                    else {
                        System.out.println("But you already had rain boots on.");
                    }
                    break;
                case 2:
                    System.out.println("You grabbed an umbrella.");
                    if(!(prevChoices.contains(choice))) {
                        rainPrep++;
                    }
                    else {
                        System.out.println("But you already had an umbrella.");
                    }
                    break;
                case 3:
                    System.out.println("You put on the rain jacket.");
                    if(!(prevChoices.contains(choice))) {
                        rainPrep++;
                    }
                    else {
                        System.out.println("But you already had a rain jacket on.");
                    }
                    break;
                case 4:
                    System.out.println("You leave the house");
                    running = false;
                    break;
            }
            prevChoices.add(choice);

        }
        System.out.println("> Once you leave the house and start down the sidewalk it begins to heavily rain. Better hope your prepared!");
        if(rainPrep == 0) {
            System.out.println("> You didn't prepare for the rain and are drenched by the time you get there. It is incredibly uncomfortable.");
        }
        else if(rainPrep == 1) {
            System.out.println("> You barely prepared for the rain and are really wet by the time you get there. It is uncomfortable.");
        }
        else if(rainPrep == 2) {
            System.out.println("> You kinda prepared for the rain and are hardly wet by the time you get there. It is slightly uncomfortable.");
        }
        else {
            System.out.println("> You prepared for the rain and are dry by the time you get there. You feel very comfortable.");
        }

        System.out.println("\nLoading next scene......\n");
        try { Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}





        // Scene 3

        int noChoiceButYouCanTryLOL = 0;
        System.out.print("Scene 3: The Room and Its Only Light \n--------------\n");
        try { Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
                System.out.println("> Your friends house feels barren without him in it. You clean up some of the trash from your last night gaming together.\n> As you throw away the trash you notice a door halfway open. \n");

        do {
            System.out.print("Do you enter? (1 for yes and 0 for no): ");
            noChoiceButYouCanTryLOL = sc.nextInt();
            if((noChoiceButYouCanTryLOL != 0) && (noChoiceButYouCanTryLOL != 1)) {
                System.out.println("Not an option... try again...");
            }
        } while ((noChoiceButYouCanTryLOL != 0) && (noChoiceButYouCanTryLOL != 1));
        System.out.println();
        if(noChoiceButYouCanTryLOL == 0) {
            System.out.println("[<WANDERING IS A TERRIBLE SIN>]");
            try { Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
            for(int i = 1; i < 10; i++) {
                System.out.println("[<WANDERING IS A TERRIBLE SIN>]");
                try { Thread.sleep((1900 / i));} catch (InterruptedException e) {e.printStackTrace();}
            }
            System.out.println();
        }

        System.out.println("> You enter the room. Inside there is nothing except for a singular computer on a desk. The only light inside the room came from its screen. \n" +
        "> On the screen was a game at its end. The game over screen. Its defining feature being a spotlight shining onto a checkered pattern floor. \n");

        do {
            System.out.print("Do you play the game? (1 for yes and 0 for no): ");
            noChoiceButYouCanTryLOL = sc.nextInt();
            if((noChoiceButYouCanTryLOL != 0) && (noChoiceButYouCanTryLOL != 1)) {
                System.out.println("Not an option... try again...");
            }
        } while ((noChoiceButYouCanTryLOL != 0) && (noChoiceButYouCanTryLOL != 1));
        System.out.println();
        if(noChoiceButYouCanTryLOL == 0) {
            System.out.println("[<YOUR LIFE IS A DISEASE. THIS IS THE SOLUTION.>]");
            try { Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
        }

        System.out.println("> You walk up to the computer and press play. Your body begins to feel weird and you pass out on the floor.");
    }

}
