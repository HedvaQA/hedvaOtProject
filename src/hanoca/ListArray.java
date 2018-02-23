package hanoca;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import tirgul.Monkey;

import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {

//     int []hedvaList=new int [3];
//        hedvaList[0]=10;
//     hedvaList[1]=1976;
//     hedvaList[2]=1805;
//       // System.out.println(hedvaList[1]);
//        //System.out.println();
//        for (Integer i:hedvaList){
//            System.out.println(i);
//
//
//        }
//        System.out.println();
//        ArrayList<Monkey> hedvaList2 = new ArrayList<Monkey>();
//        Monkey m = new Monkey("momo");
//        hedvaList2.add(m);
//
//        Monkey n = new Monkey("nina");
//        hedvaList2.add(n);
//
//        Monkey l = new Monkey("lola");
//        hedvaList2.add(l);
//        //System.out.println(hedvaList2.get(2).getMname());
//        for (Monkey s : hedvaList2) {
//            System.out.println(s.getMname());
//        }

//
        int i;
        int x=0;
    double averageA;
    int[] intArr= new int[6];
    intArr[0]=15;
        intArr[1]=23;
        intArr[2]=66;
        intArr[3]=88;
        intArr[4]=99;
        intArr[5]=105;

        averageA =(intArr[0]+intArr[1]+intArr[2]+intArr[3]+intArr[4]+intArr[5])/6;
        System.out.println(averageA);

        for(i=0;i<intArr.length;i++) {
            if (intArr[i] == 67) {
                System.out.println("yes");
                x=1;
            } else {
                if (i == intArr.length-1 & x==0  ) {
                    System.out.println("no");
                }
            }


        }
    }

}
