import java.lang.Math; // this is importing the math to let me get a random number
import java.util.Scanner; // this adds in the scanner
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean R = false; // This becomes true whe the user chooses Rock
        Boolean P = false; // This becomes true whe the user chooses paper
        Boolean S = false; // This becomes true whe the user chooses Scissors
        String U = ""; // this is the string type variable for the user choice
        char u = 'z'; // this is the char type variable for the user choice
        int ai = 0; // this is the variable that will have a random number from 0-2
        String aic = "no"; // this is the string type variable for the computer choice
        int score = 0; // this is the score counter
        int tally = 0; // adds a tally counter integer
        int win = 0; //  adds a win counter
        Boolean loop = true; // this is the first lop for the initial welcome
        Boolean loop2 = true; // this is the loop for the choice input
        Boolean loop3 = false; // this is the loop for asking wether you would like to continue or not after the game is over
        int count = 0; // this is the cunter which asks if you would like to continue playing after every 3 rounds
        String yesorno = "z"; // this is the string type variable which scans wether yuo would like to continue or not
        char yorn = 'z'; // this is the char type variable which scans wether yuo would like to continue or not
        String yesorno2 = "z"; // this is the string type variable which scans wether yuo would like to continue or not
        char yorn2 = 'z'; // this is the char type variable which scans wether yuo would like to continue or not
        System.out.println("Welcome To The Rock Paper Scissors Game!"); // welcome message
        while (loop){ // starts the loop for the choices
            System.out.println("Please type in your choice, Rock(R), Paper(P), Scissors (S)"); // sets different inputs
            while (loop2){ // this loop is in case the user puts the wrong variable as their choice of rock paper scissors
                System.out.print("Your choice ---> "); // choice message
                U = sc.next().toLowerCase(); // scans any input, even a word and makes it all lower case
                u = U.charAt(0); // converts that string into a char for convenience
                switch (u){ // switch for the user input
                    case 'r': // if the choice was rock then...
                        R = true; // rock boolean is now true
                        loop2 = false; // loop 2 is false so it does not constantly ask for input
                        break; //break
                    case 'p': // if the choice was paper then...
                        P = true; // paper boolean is now true
                        loop2 = false; // loop 2 is false so it does not constantly ask for input
                        break;
                    case 's': // if the choice was Scissors then...
                        S = true;  // scissors boolean is now true
                        loop2 = false; // loop 2 is false so it does not constantly ask for input
                        break;
                    default:
                        System.out.println("This was an invalid input, please try again"); // if the input was anything other than the ones above then error message
                        loop2 = true; // loop is now true so it will ask for input again
                        break;
                }
            }
            ai = (int) (Math.random()*3); // 0=rock, 1=Paper, 2=Scissors // random number generator from 0-2
            switch (ai){ // switch for computer generated choice
                default:
                    break;
                case 0: // if the computer generates 0 then..
                    aic = "Rock"; // the string variable aic is now rock
                    break;
                case 1: // if the computer generates 1 then..
                    aic = "Paper"; // the string variable aic is now paper
                    break;
                case 2: // if the computer generates 2 then..
                    aic = "Scissors"; // the string variable aic is now scissors
                    break;
            }
            System.out.printf("The computer Choose ----> %S\n", aic); // shows the computer generated choice
            count++; // adds one to our counter for number of games played which is reset after every 3 games
            tally++; // adds one to the tally for number of games played over all
            if (R==true && ai==2){ // if the user input is rock and the ai choice was scissors then..
                System.out.println(":)You Won!!!"); // you won message
                score++; // adds one point to score
                win++; // adds one point to the win
            }
            if (R==true && ai==1){ // if user input is rock and the ai choice was paper then..
                System.out.println("You Lost :("); // you lost message
                score--; //removes 1 point
            }
            if (R==true && ai==0){ // if user input is rock and the ai choice was rock then..
                System.out.println("You Tied -_-"); // you tied message
            }
            if (P==true && ai==0){ // // if user input is paper and the ai choice was rock then..
                System.out.println(":)You Won!!!"); // you won message
                score++; // adds one point to score
                win++; // adds one point to the win
            }
            if (P==true && ai==2){ // if user input is paper  and the ai choice was scissors then..
                System.out.println("You Lost :("); // you lost message
                score--; // removes one point
            }
            if (P==true && ai==1){ // if user input is paper and the ai choice was paper then..
                System.out.println("You Tied -_-"); // you tied message
            }
            if (S==true && ai==1){ // if user input is scissors and the ai choice was paper then..
                System.out.println(":)You Won!!!"); // you won message
                score++; // adds one point
                win++; // adds one point to the win
            }
            if (S==true && ai==0){ // if user input is scissors and the ai choice was rock then..
                System.out.println("You Lost :("); //you lost message
                score--; // removes a point
            }
            if (S==true && ai==2){ // if user input is scissors and the ai choice was scissors then..
                System.out.println("You Tied -_-"); //you tied message
            }
            //System.out.printf("%d\n", ai);  this used to be here to test and make sure the random generator was actually giving a proper output
            System.out.printf("Your Score ---> %d\n", score);// scre message
            if (score==-1){ // if your score is -1
                System.out.println("!!Game Over!!");// game over message
                System.out.printf("You won %d game(s) out of %d\n",win , tally); // score message
                score = 0; // score is reset to 0
                count = 0; // count is reset to 0
                tally = 0; // tally count is reset to 0
                win = 0; // win count s reset to 0
                loop3 = true; // loop 3 becomes true
            }
            while (count==3) { // after 3 rounds of playing...
                System.out.println("You have been playing for a while. Would you still like to continue?"); // would you like to continue playing message
                yesorno2 = sc.next().toLowerCase(); // scans for yes or no and makes it lower case
                yorn2 = yesorno2.charAt(0); // takes the character at the first letter
                if (yorn2=='y'){ // if it is y then..
                    System.out.println("Goodluck!"); // goodluck message
                    loop = true; // makes the original loop true
                    loop2 = true; // makes the loop2 true
                    count = 0; // resets count to 0
                }
                if (yorn2=='n'){ // if the reply is n then..
                    System.out.println("Goodbye!"); // goodbye message
                    System.out.printf("You won %d games out of %d",win , tally); // score message
                    loop = false; // original loop is false
                    loop2 = false; // loop2 is false
                    loop3 = false; // loop3 is false
                    System.exit(0); // exits the code
                }
                if (yorn2!='n'&& yorn2!='y'){
                    System.out.print("This Input is not valid. Please Try Again\n"); // this input is invalid message
                    count = 3;
                }
            }
            while (loop3){ // if the loop is 3 true then..
                System.out.println("Would You like to try again"); // try again message
                yesorno = sc.next().toLowerCase();// takes input and makes it lower case
                yorn = yesorno.charAt(0); // takes the character at the first letter
                if (yorn=='y'){ // if y then..
                    System.out.println("Goodluck!"); // goodluck message
                    loop = true; //loop is true
                    loop2 = true; //loop2 is true
                    loop3 = false;  //loop3 is true
                    count = 0; // count is reset
                }
                if (yorn=='n'){ //if the reply is n then..
                    System.out.println("Goodbye!"); //goodbye message
                    loop = false; // loop is false
                    loop2 = false; // loop2 is false
                    loop3 = false; // loop3 is false
                    System.exit(0);  // exits the system
                }
                if (yorn !='n'&& yorn !='y'){
                    System.out.print("This Input is not valid. Please Try Again\n");
                    loop3 = true;
                }
            }
            R = false; // resets the rock boolean
            P = false; // resets the paper boolean
            S = false; // resets the scissors boolean
            loop3 = false; // makes loop 3 false
            loop2 = true; // makes loop 2 true
        }
    }
}