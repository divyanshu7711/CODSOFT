import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
        Random r=new Random();
        char play;
        int won=0;
        int a=0;
        Scanner s=new Scanner(System.in);
        System.out.println(" You will be having 5 chances to Guess the correct Number ");
        System.out.println("Are You ready to play Enter y or n ");
        play=s.next().charAt(0);
        while(play=='y') {
           int z=0;
            int number=r.nextInt(101);// Random number generated
            System.out.println("Enter a Number to Guess the correct number  ");
            for (int i = 0; i < 5; i++) {
                System.out.println("ATTEMPT "+(i+1));
                int n = s.nextInt();
                if ((number - n) > 0) { // guess is smaller
                    if( (number-n)<=10){
                        System.out.println("Entered Number  less");
                    }
                    else if ((number-n)<=30 && (number-n)>10){
                        System.out.println("Entered Number very less");
                    }
                    else{
                        System.out.println("Entered Number  very much less");
                    }

                    z++;

                } else if ((number - n) < 0) {      // larger the guess

                    if( (n-number)<=10){
                        System.out.println("Entered Number is high");
                    }
                    else if ((n-number)<=30 && (n-number)>10){
                        System.out.println("Entered Number is very High");
                    }
                    else{
                        System.out.println("Entered Number is very much Higher");
                    }
                    z++;

                } else {
                    System.out.println("Congratulations It is the desired Number .");
                    z++;
                    System.out.println("you Guessed Right in "+z+" chances .");
                    won++;
                    break;
                }


            }

            System.out.println(" The Number is : "+number);
            System.out.println("DO you want to play the game again");
            System.out.println("Enter y OR n ");
            play=s.next().charAt(0);
            a++;

        }
        System.out.println(" you played the Game "+a+" Times");
        System.out.println(" Out of which you have won "+won+" times .");



    }

}
