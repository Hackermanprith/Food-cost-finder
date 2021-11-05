
import java.util.*;


class Main {
    public static void main(String[] args) {
        //MENU START
        System.out. println("__________________________________________________________________");
        System.out.println("|                   Welcome to Prithwish Restaurant                   | ");
        System.out.println("|                        TODAY'S MENU                             |");
        System.out.println("|   Item Name                Item id            Price             |");
        System.out.println("|   FISH CHOP                   1                ₹45              |");
        System.out.println("|   MUTTON CHOP                 2                ₹30              |");
        System.out.println("|   EGG CHOP                    3                ₹20              |");
        System.out.println("|   EGG DEVIL                   4                ₹40              |");
        System.out.println("|   VEG.CHOP                    5                ₹20              |");
        System.out.println("|   FISH FRY                    6                ₹95              |");
        System.out.println("|   CHICKEN CUTLET              7                ₹65              |");
        System.out.println("|   MUTTON CUTLET               8               ₹110              |");
        System.out.println("|   CHICKEN PAKORA              9               ₹140              |");
        System.out.println("|   MIXED CHOW (FULL)           10              ₹150              |");
        System.out.println("|   MIXED CHOW(HALF)            11              ₹125              |");
        System.out.println("|   EGG CHOW(FULL)              12              ₹110              |");
        System.out.println("|   EGG CHOW(HALF)              13               ₹95              |");
        System.out.println("|   VEG CHOW(FULL)              14              ₹100              |");
        System.out.println("|   VEG CHOW (HALF)             15               ₹80              |");
        System.out.println("|   CHICKER CURRY(4PC)          16              ₹110              |");
        System.out.println("|   CHICKEN KASA(4PC)           17              ₹140              |");
        System.out.println("|   CHILLY CHICKEN(6PC)         18              ₹160              |");
        System.out.println("|   CHICKEN MANCHURIAN (6PC)    19              ₹180              |");
        System.out.println("|   FRIED RICE(VEG)             20              ₹120              |");
        System.out.println("|   EGG CHICKEN RICE            21              ₹150              |");
        System.out.println("|   FRIED RICE(MIX)             22              ₹160              |");
        System.out.println("|   CHILLY FISH(6 PC)           23              ₹200              |");
        System.out.println("|   FISH MANCHURIAN(6 PC)       24              ₹210              |");
        System.out.println("|   FISH PAKORA(6PC)            25              ₹190              |");
        System.out.println("|   PANEER PAKORA (6PC)         26              ₹110              |");
        System.out.println("|   Panner CHILLY (6PC)         27              ₹130              |");
        System.out.println("|   PANEER MANCHURIAN (6PC)     28              ₹150              |");
        System.out.println(" _________________________________________________________________");
        System.out.println("             Thank You for Visiting |    No Azina Moto            ");
        System.out.println("__________________________________________________________________");
        //MENU END
        //ALL VARS
        Scanner sc = new Scanner(System.in);
        System.out.println("How many items you wanna order ?");
        int nooder = sc.nextInt();
        double bal = 0.00;
        double fishchop = 40.00;
        double muttonchop = 30.00;
        double eggchop = 20.00;
        double eggdevil = 40.00;
        double vegchop = 20.00;
        double fishfry = 95.00;
        double chickencutlet = 65.00;
        double muttoncutlet = 110.00;
        double chickenpokora = 140.00;
        double mixedchowfull = 150.00;
        double mixedchowhalf = 125.00;
        double eggchowfull = 110.00;
        double eggchowhalf = 95.00;
        double vegchowfull = 100.00;
        double vegchowhalf = 80.00;
        double chickencurry = 110.00;
        double chickenkasa = 140.00;
        double chillychicken = 160.00;
        double chickenmanchurian = 180.00;
        double vegfriedrice = 120.00;
        double eggchickenrice = 150.00;
        double mixedfriedrice = 160.00;
        double chiilyfish = 200.00;
        double fishmanchurian = 210.00;
        double fishpakora = 190.00;
        double panneepakora=110.00;
        double pannerchilly = 130.00;
        double pannermanchurian = 150.00;
        //loop
        for(int i = 1; i<=nooder;i++){
            System.out.println("Enter the id of the item you wanna order");
            int input = sc.nextInt();
            System.out.println("Enter the Quantity needed");
            int ammount = sc.nextInt();
            //logic
            if(input == 1){
                bal = fishchop*ammount + bal;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 2){
                bal =   bal +  muttonchop*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 3){
                bal = bal + eggchop*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 4){
                bal = bal + eggdevil*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 5){
                bal = bal + vegchop*ammount;
                System.out.println("Your total amount for now ₹" + bal);

            }
            if (input == 6){
                bal = bal + fishfry*ammount;
                System.out.println("Your total amount for now ₹" + bal);

            }
            if(input == 7){
                bal = bal + chickencutlet*ammount;
                System.out.println("Your total amount for now ₹" + bal);

            }
            if(input == 8){
                bal = bal + muttoncutlet*ammount;
                System.out.println("Your total amount for now ₹" + bal);

            }
            if(input == 9){
                bal = bal + chickenpokora*ammount;
                System.out.println("Your total amount for now ₹" + bal);

            }
            if(input == 10){
                bal = bal + mixedchowfull*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 11){
                bal = bal + mixedchowhalf*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 12){
                bal = bal + eggchowfull*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 13){
                bal = bal + eggchowhalf*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 14){
                bal = bal + vegchowfull*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 15){
                bal = bal + vegchowhalf*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 16){
                bal = bal + chickencurry*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 17){
                bal = bal + chickenkasa*ammount;
                System.out.println("Your total amount for now ₹" + bal);

            }
            if(input == 18){
                bal = bal + chillychicken*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 19){
                bal = bal + chickenmanchurian*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 20){
                bal = bal + vegfriedrice*ammount;
                System.out.println("Your total amount for now ₹" + bal);

            }
            if(input == 21){
                bal = bal + eggchickenrice*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 22){
                bal = bal + mixedfriedrice*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 23){
                bal = bal + chiilyfish*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 24){
                bal = bal + fishmanchurian*ammount;
                System.out.println("Your total amount for now ₹" + bal);
            }
            if(input == 25){
                bal = bal + fishpakora*ammount;
                System.out.println("Your total amount for now ₹" + bal);

            }
            if(input == 26){
                bal = bal + panneepakora*ammount;
                System.out.println("Your total amount for now ₹" + bal);

            }
            if(input == 27){
                bal = bal + pannerchilly*ammount;
                System.out.println("Your total amount for now ₹" + bal);

            }
            if (input == 28){
                bal = bal + pannermanchurian*ammount;
                System.out.println("Your total amount for now ₹" + bal);

            }
        }
        System.out.println("____________________________________________________________");
        System.out.println("| Total bill                                    : ₹" + bal +"   |");
        System.out.println("____________________________________________________________");
        System.out.println("                       Thanks for visiting                  ");
        System.out.println("_____________________________________________________________");
    }
}