import java.util.Scanner; //importing the scanner class

class RockPaperScissorsAkshithKachakayala{
   public static void main (String [] args){
      //Variable declaration
      //Initialization
      Scanner userInput = new Scanner(System.in);
      int userSelect = 0;
      int computerSelect = 0;
      int wins = 0;
      int losses = 0;
      int ties = 0;
      String retry;
      String fullName;
      
      //Stores user name and provides instructions on the game
      System.out.println("Please enter full name to enter the game");
      fullName = userInput.nextLine();
      System.out.printf("Hello, %s.Choose the number that corresponds with the attack\FYI: scissors beats paper, rock beats scissors, and paper beats rock \n", fullName);

      //Game is done in a do while so the user plays multiple times
      do{
         
         computerSelect = (int)(Math.random()*3+1); //computer chooses between 1 and 3 to be one of the options
         System.out.println("Choose the number to lock it in \n(1) Rock \n(2) Paper \n(3) Scissors");
         
         if(!userInput.hasNextInt()){ //verifys scanner contains an integer
            System.out.println("Invalid input. Please input integer between 1 and 3\n");
            userInput.next(); //THis action dumps the scanner
         }else{
            userSelect = userInput.nextInt(); //userinput is assigned into selection only if it is an integer
         }
         
         if(userSelect < 1 || userSelect > 3){ //specifys a range for the selection
            System.out.println("Number out of range! Please Try again...");
         }
         
         if(userSelect == 1){ //if the user chose rock
         
            //All outputs if user chooses rock
            if (computerSelect == 1){
               ties++;
               System.out.println("Computer chose rock too, tie! Better Luck Next Time!");
            }
            if (computerSelect == 2){
               losses++;
               System.out.println("Computer chose paper, you lose! Better Luck Next Time!");
            }
            if (computerSelect == 3){
               wins++;
               System.out.println("Computer chose scissors, you win!");
            }
            
         }
         
         if(userSelect == 2){ //if the user chose paper
         
            //All outputs if user chooses paper
            if (computerSelect == 1){
               wins++;
               System.out.println("Computer chose rock, you win!");
            }
            if (computerSelect == 2){
               ties++;
               System.out.println("Computer chose paper too, tie! Better Luck Next Time!");
            }
            if (computerSelect == 3){
               losses++;
               System.out.println("Computer chose scissors, you lose! Better Luck Next Time!");
            }
            
         }
         
         if(userSelect == 3){ //if the user chose scissors
         
            //All outputs  if user chooses scissors
            if (computerSelect == 1){
               losses++;
               System.out.println("Computer chose rock, you lose! Better Luck Next Time!");
            }
            if (computerSelect == 2){
               wins++;
               System.out.println("Computer chose paper, you win!");
            }
            if (computerSelect == 3){
               ties++;
               System.out.println("Computer chose scissors too, tie! Better Luck Next Time!");
            }
            
         }
         
         //shows statistics or wins, losses, and ties and then procedes to ask user about playing again
         System.out.printf("Current stats:\nWins: %d\nLosses: %d\nTies: %d\n", wins, losses, ties);
         userInput.nextLine();
         do{
            System.out.println("Play again? (yes/no)");
            retry = userInput.nextLine();
            retry = retry.toLowerCase();
            if (retry.equals("no")){
               selection = 4;
               break;
            }
            if (retry.equals("yes")){
               break;
            }
         }while(true);
         
         
      } while (selection != 4);
   } //end of main   
} //end of class