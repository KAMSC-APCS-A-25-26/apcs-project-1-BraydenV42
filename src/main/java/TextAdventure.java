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
        Boolean gameRunning = true;
        String waitForNext;
        while (gameRunning) {
            Scanner sc = new Scanner(System.in);
            System.out.println("CROWS ARE KIND OF EVIL\n");


            // Scene 1

            System.out.println("Scene 1: The Homebody");
            System.out.println("--------------\n" + "> A day like today starts like any other. \n> The clouds cover the vast endless blue sky " +
                    "the shoulders of the roads filling with fallen leaves from trees.\n> Your friends recent death plaqued your every thought. \n> He had gone missing without a trace and had been presumed dead many days ago.");
            System.out.println("> You had rotted at home ever since.");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("Done reading? (input anything)");
            sc.next();

            boolean running = true;
            int choice;
            while (running) {

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
            }

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\nDone reading? (input anything)");
            sc.next();
            System.out.println();



            // Scene 2

            System.out.println("Scene 2: A Walk and A Rainy Day \n--------------");
            System.out.println("> Before you go out you look out the window. The clouds have turned to a darker gray.\n> You stop and think about whether or not you should put on some rain clothes. ");
            System.out.print("Done reading? (input anything)");
            sc.next();
            running = true;
            List<Integer> prevChoices = new ArrayList<>();
            int rainPrep = 0;
            while (running) {
                System.out.println("\nWhat should you put on before you go out?");
                System.out.println(" 1 - Put on rain boots\n 2 - Grab an umbrella\n 3 - Put on a rain coat\n 4 - Leave the house");

                System.out.print("Whats your choice? ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("You put on the rain boots.");
                        if (!(prevChoices.contains(choice))) {
                            rainPrep++;
                        } else {
                            System.out.println("But you already had rain boots on.");
                        }
                        break;
                    case 2:
                        System.out.println("You grabbed an umbrella.");
                        if (!(prevChoices.contains(choice))) {
                            rainPrep++;
                        } else {
                            System.out.println("But you already had an umbrella.");
                        }
                        break;
                    case 3:
                        System.out.println("You put on the rain jacket.");
                        if (!(prevChoices.contains(choice))) {
                            rainPrep++;
                        } else {
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
            if (rainPrep == 0) {
                System.out.println("> You didn't prepare for the rain and are drenched by the time you get there. It is incredibly uncomfortable.");
            } else if (rainPrep == 1) {
                System.out.println("> You barely prepared for the rain and are really wet by the time you get there. It is uncomfortable.");
            } else if (rainPrep == 2) {
                System.out.println("> You kinda prepared for the rain and are hardly wet by the time you get there. It is slightly uncomfortable.");
            } else {
                System.out.println("> You prepared for the rain and are dry by the time you get there. You feel very comfortable.");
            }


            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\nDone reading? (input anything)");
            sc.next();
            System.out.println();



            // Scene 3

            int noChoiceButYouCanTryLOL = 0;
            System.out.print("Scene 3: The Room and Its Only Light \n--------------\n");
            System.out.println("> Your friends house feels barren without him in it. You clean up some of the trash from your last night gaming together.\n> As you throw away the trash you notice a door halfway open. \n");
            System.out.print("Done reading? (input anything)");
            sc.next();
            do {
                System.out.print("Do you enter? (1 for yes and 0 for no): ");
                noChoiceButYouCanTryLOL = sc.nextInt();
                if ((noChoiceButYouCanTryLOL != 0) && (noChoiceButYouCanTryLOL != 1)) {
                    System.out.println("Not an option... try again...");
                }
            } while ((noChoiceButYouCanTryLOL != 0) && (noChoiceButYouCanTryLOL != 1));
            System.out.println();
            if (noChoiceButYouCanTryLOL == 0) {
                System.out.println("[<WANDERING IS A TERRIBLE SIN>]");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 1; i < 10; i++) {
                    System.out.println("[<WANDERING IS A TERRIBLE SIN>]");
                    try {
                        Thread.sleep((1900 / i));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println();
            }

            System.out.println("> You enter the room. Inside there is nothing except for a singular computer on a desk. The only light inside the room came from its screen. \n" +
                    "> On the screen was a game at its end. The game over screen. Its defining feature being a spotlight shining onto a checkered pattern floor. \n");

            do {
                System.out.print("Do you play the game? (1 for yes and 0 for no): ");
                noChoiceButYouCanTryLOL = sc.nextInt();
                if ((noChoiceButYouCanTryLOL != 0) && (noChoiceButYouCanTryLOL != 1)) {
                    System.out.println("Not an option... try again...");
                }
            } while ((noChoiceButYouCanTryLOL != 0) && (noChoiceButYouCanTryLOL != 1));
            System.out.println();
            if (noChoiceButYouCanTryLOL == 0) {
                System.out.println("[<MORESINISTERMINDS'LLSWONDERIFTHEYEVENHADACHOICEATALL>]");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("> You walk up to the computer and press play. Your body begins to feel weird and you pass out on the floor.");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\nDone reading? (input anything)");
            sc.next();
            System.out.println();

            // Scene 4 (POSSIBLE DEVELOPMENT) Quote on quote "big decision part". Don't be garbage and you're fine.

            System.out.print("Scene 4: The Beauty of Pure Unadulterated Dread \n--------------\n");
            System.out.println("> You wake up on the floor of the room. The desk and computer were both gone and the room was now completely empty.\n> You get up and run to the door but when you tug on the handle its locked. There were no windows or other ways out. You were trapped.\n> After a bit of waiting you decide that you may be able to break the door down.");
            System.out.print("Done reading? (input anything)");
            sc.next();
            System.out.println("\n[This is a game. You can bare your shoulders and try to smash through the wooden door.\nBut watch out, if you run out of energy you will forever be stuck in the room and die.]\nBegin {");
            running = true;
            int energy = 10, doorHealth = 12;
            while (running) {
                System.out.println("You have: " + energy + " energy.");
                System.out.println("The door can take: " + doorHealth / 4 + " more smashes.");
                do {
                    System.out.print("Smash through the door? (1 for yes and 0 for no): ");
                    choice = sc.nextInt();
                    if ((choice != 0) && (choice != 1)) {
                        System.out.println("Not an option... try again...");
                    }
                } while ((choice != 0) && (choice != 1));

                if (choice == 0) {
                    System.out.println("You decided to wait a bit and recover your energy. \n\nEnergy increased by 5.\n");
                    energy += 5;
                }
                if (choice == 1) {
                    System.out.println("You bare your shoulders and smash into the door. The door looked weaker but you lost some energy.\n\nEnergy decrease by 7.\n");
                    energy -= 7;
                    doorHealth -= 4;
                }
                if (doorHealth == 0) {
                    running = false;
                    System.out.println("> The door broke open and you fell on the floor of a new place. \n> You look outside your room and a forest of dead trees surrounded you. You hear the caw of a crow above you.\n> You look up at the blood-red sky and a crow was circling above you. In a flash you suddenly feel your legs get ripped off your body.\n> As you bleed out you see a terrible giant bird-like creature feasting on your bottom half. You blank out and that was the end. You died.");
                }
                if (energy <= 0) {
                    running = false;
                    break;
                }
            }

            // Alternate Ending: "You suck badly don't ya" ending
            int gameContinue;
            if (energy <= 0) {
                System.out.println("> You feel a terrible fatigue and fall to the ground. Without the energy to move you die.\n> You got the worst possible ending. Death by skill issue.\n> Seriously? That was so incredibly easy. You suck!");
                System.out.print("Continue? (1 for yes and 0 for no): ");
                gameContinue = sc.nextInt();
                if (gameContinue == 1) {
                    System.out.println("\n");
                    System.out.flush();
                    continue;
                }
                if (gameContinue == 0) {
                    System.out.println("GAME OVER");
                    break;
                }
            }


            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\nDone reading? (input anything)");
            sc.next();
            System.out.println();




            // Scene 5

            System.out.print("Scene 5: This Is Why Crows Are Kinda Evil \n--------------\n");
            System.out.println("> You wake up back in the room. You get up and check your legs to make sure they are still there.\n> You were somehow still alive. You were sure that you had died. Heck you felt yourself be torn apart.\n> Though confused you walk through the door that was still open and look up again.\n> The crow was circling above you once again. You yell at it to buzz off and this time your body stayed intact.\n" +
                    "> You wondered if this is where your friend had gone.\n> In an attempt to find him you looked ahead at the sprawling dead forest surrounding of you. It had branching paths and twists.\n> You hastily enter the forest out of fear of staying out in the open.");
            System.out.print("Done reading? (input anything)");
            sc.next();
            running = true;
            while(running) {
                System.out.println("\n> There were 2 paths. A crow sat in the path to the left and the one on the right was clear.");
                do {
                    System.out.print("To the left or to the right? (1 for left and 0 for right): ");
                    choice = sc.nextInt();
                    if ((choice != 0) && (choice != 1)) {
                        System.out.println("Not an option... try again...");
                    }
                } while ((choice != 0) && (choice != 1));
                if(choice == 1) {
                    System.out.println("> You were swiftly torn apart and woke up back in the house.");
                    continue;
                }
                else{
                    System.out.println("> Nothing happened and you continued walking.");
                }
                System.out.println("\n> There were 3 paths. A crow sat in the path to the right and middle and the one on the left was clear.");
                do {
                    System.out.print("To the left, the middle, or the right? (2 for middle and 1 for left and 0 for right): ");
                    choice = sc.nextInt();
                    if ((choice != 0) && (choice != 1) &&  choice != 2) {
                        System.out.println("Not an option... try again...");
                    }
                } while ((choice != 0) && (choice != 1) && (choice != 2));
                if(choice == 0 || choice == 2) {
                    System.out.println("> You were swiftly torn apart and woke up back in the house.");
                    continue;
                }
                else{
                    System.out.println("> Nothing happened and you continued walking.");
                }
                System.out.println("\n> There were 3 paths. A crow sat on every single path.");
                System.out.print("To the left, the middle, or the right? (2 for middle and 1 for left and 0 for right): ");
                choice = sc.nextInt();
                System.out.println("> You walk down the path you chose and hear rustling. You promptly start sprinting for your life to survive.");
                running = false;
            }

            System.out.print("\nDone reading? (input anything)");
            sc.next();
            System.out.println();




            // Scene 6 (BIG DECISION HERE)

            System.out.print("Scene 6: Feel A Decisions Breath Down Your Neck. Its Teeth Ripping Open Your Face. \n--------------\n");
            System.out.println("> The crows began to swarm covering your vision of the path ahead. Fear and adrenaline consume you and you sprint forward.\n> The deafening caws of the crows pierce your ears and drill into your mind.\n> After running for a while you break through into a small clearing. The loud rustling and wingbeats behind you fade away and you experience a moment of peace.\n> You wander and collect yourself. You quickly find a see through, glass crow with a picture of your friend inside.");
            do {
                System.out.print("> Out of anger you could smash the crow against the ground... or you could keep it for his memories sake.\nWhat do you do? (1 to smash it and 0 keep it): ");
                choice = sc.nextInt();
                if ((choice != 0) && (choice != 1)) {
                    System.out.println("Not an option... try again...");
                }
            } while ((choice != 0) && (choice != 1));
            if(choice == 1){
                System.out.println("> You smash it against the floor angrily. Outraged at the thought your friend could be here somewhere. You then look forward to the next task.");
                String ending = "bad";
            }
            if(choice == 0){
                System.out.println("> You pick it up gently and look forward to your next task.");
                String ending = "good";
            }

            System.out.print("\nDone reading? (input anything)");
            sc.next();
            System.out.println();





            // Scene 7

            System.out.print("Scene 7: Nightmare On Elm Forest \n--------------\n");

            // CUT IT OFF
            gameRunning = false;
        }
    }

}