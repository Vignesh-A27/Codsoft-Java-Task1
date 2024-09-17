import java.util.Scanner;
public class NumberGame{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int chances = 7;
        int finals = 0;
        boolean playAgain=true;
        System.out.println("Welcome to the Game");
        System.out.println("Hey player you have "+chances+" chances to win this game");
        while (playAgain){
            int rand = getrandN(1,100);
            boolean guess = false;
            for(int i=0;i<=chances;i++){
                System.out.println("Chance "+(i+1)+"  Enter Your Guess");
                int user = sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("You've Won The Game");
                    break;
                }
                else if(user>rand){
                    System.out.println("Guess is high");
                }
                else{
                    System.out.println("Guess is low");
                }
            }

            if(guess==false){
                System.out.println("Sorry. No more chances.The Number is "+rand);

            }
            String pA = sc.nextLine();
            playAgain=pA.equalsIgnoreCase("y");

        }
        System.out.println("Hope you enjoyed the game");
        System.out.println("Your Score:"+finals);
        }
        public static int getrandN(int min,int max){
            return(int)(Math.random()*(max-min+1)+min);

    }
}
