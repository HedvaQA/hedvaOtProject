package EndProjectOfJava;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MainPage {

    public static void main(String[] args) {
        double oneDolar=3.72;
        double amount;
        double total;
        String again ="Y";
        ArrayList<Double> totalList= new ArrayList<Double>();
        ArrayList<String> totalListC= new ArrayList<String>();
        int i;
        int p=0;
        System.out.println("Welcome to convert currency(Dollar/Shekel) program");
       while (Objects.equals(again, "Y")||Objects.equals(again, "y")){
        System.out.println("If you want to convert USD Dollar to Shekel please press on 1 else press on 2 ");
        Scanner a = new Scanner(System.in);
        int NumberA = a.nextInt();
        //System.out.println(NumberA);

        while (NumberA != 1 && NumberA != 2) {
            System.out.println("Invalid Choice, please try again");
            System.out.println("If you want to convert USD Dollar to Shekel please press on 1 else press on 2 ");
            Scanner b = new Scanner(System.in);
            NumberA = b.nextInt();
        }

        if (NumberA == 1 || NumberA == 2) {
            if (NumberA == 1) {
                System.out.println("Please enter an amount to convert from  Dollar to Shekel");
                Scanner am = new Scanner(System.in);
                amount = am.nextDouble();
                total = amount * oneDolar;
                System.out.println("The result is " + total + " Shekel ");
                totalList.add(total);
                totalListC.add("c");
                System.out.println("Do you want to use the convert currency program again Y/N?");
                Scanner againUse = new Scanner(System.in);
                 again = againUse.next();

            } else {
                System.out.println("Please enter an amount to convert from  Shekel to Dollar");
                Scanner am = new Scanner(System.in);
                amount = am.nextDouble();
                total = amount / oneDolar;
                System.out.println("The result is " + total + " Dollar ");
                totalList.add(total);
                totalListC.add("Dollar");
                System.out.println("Do you want to use the convert currency program again Y/N?");
                Scanner againUse = new Scanner(System.in);
                again = againUse.next();


            }
        }

        }
        System.out.println("Thanks for using our currency converter.");
        System.out.println("Now we show you all the results that you get:");
       for(i=0;i<totalList.size();i++){
            System.out.println(totalList.get(i)+" " +totalListC.get(i));
        }
        }


}
