import java.util.Scanner;

//        import java.util.Scanner;
//
        public class ClassB {
    public static void main(String[] args) {

        System.out.println("Please Enter Number");
        Scanner a=new Scanner(System.in);
        int NumberA =a.nextInt();
//      //  Scanner b=new Scanner(System.in);
//      //  int NumberB =b.nextInt();
//       // System.out.println(NumberA+NumberB);
        int z=hed1(NumberA);
        System.out.println(z);
        int x=hed2(NumberA);
        System.out.println(x);
        System.out.println(x+z);
//
//        //System.out.println("Please Enter two things");
//        //    Scanner a=new Scanner(System.in);
//        //   String NumberA =a.next();
//        //   Scanner b=new Scanner(System.in);
//        //   String NumberB =b.next();System.out.println(NumberA+" "+NumberB);
//        //double a = 10.8;
//        //double b = 15.8;
//
//        //   if (a > b) {
//        //       System.out.println(a);
//
////        } else if (a==b) {
//        //         System.out.println(a + b);
//
//        //  } else {
//        //      System.out.println(b);
//        //  for (a=0;a<b;a=a+0.5){
//        //      System.out.println(a);
//        //   }
//
//        // while (a<=b){
//        //    System.out.println(a);
//        //  a++;
//
//        //}
//
//
//        //   while (a<=b){
//        //    System.out.println(a);
//        //   a++;
//        // if(a>14.8){
//        //   break;
//        //}
//
//        // while (a<=b){
//        //   if(a==12.8){
//        //     continue;
//        //}
//
//        // System.out.println(a);
//        //a++;
//
//        //    for (a=10;a<b;a++){
//        //      if(a==12.0){
//        //        continue;
//        //  }
//
//        //System.out.println(a);
//        //
//        //String name =  hed("Hedva");
//        ///System.out.println(name);
//        // }
//
//        // static String hed(String h) {
//        //   h= h + " " + "shabat shalom";
//        //   return (h);
//
//        //  }
////} {
//        //        System.out.println(a);
//        //      a=a+0.75;
//        //} while (a<b);
//
//
//        //}
////}
//
//
//        //  for (int x = 0; x < 5; x++) {
//        //      int y = 0;
//        //do {
//        // System.out.println("*");
//        //    y++;
//        //   }
//        //     while (y <=x) ;
//        //      System.out.println();
//
//        //      }
//
//
////k
//        // for(int i=0; i<5 ;i++){
////
//        //      for(int j=0; j <= i; j++){
//        //         System.out.print("*");
//        //     }
//
//        //     System.out.println("");
//        //   }
////
////L.
//    //    for (int row = 0; row < 7; row++) {
//     //       for (int col = 0; col < 7; col++) {
//      //          if (row == col)
//       //             System.out.print("*");
//        //        if (row == 0 && col == 6)
//       //             System.out.print("*");
//        //        if (row == 1 && col == 5)
//        //            System.out.print("*");
//         //       if (row == 2 && col == 4)
//         //           System.out.print("*");
//        //        if (row == 4 && col == 2)
//         //           System.out.print("*");
//         //       if (row == 5 && col == 1)
//          //          System.out.print("*");
//          //      if (row == 6 && col == 0)
//          //          System.out.print("*");
//          //      if (row == 6 && col == 6)
//           //         row++;
//
//          //      else
//           //         System.out.print(" ");
//
//          //  }
//        //    System.out.println();
//     //   }
//
//
//
//       /// System.out.println("Please Enter Number  BETWEEN 10-99");
//
//        // System.out.println("Please Enter two Number");
//        //Scanner console = new Scanner(System.in);
//        //int a=console.nextInt();
//        //Scanner a = new Scanner(System.in);
//       // int NumberA =a.nextInt();
//        //Scanner b=new Scanner(System.in);
//        //int NumberB =b.nextInt();
//        //System.out.println(NumberA+NumberB);
//
//
//       // System.out.println(NumberA);
//        // int n = N2(N1);
//
//   // static int N2 (int x){
//     ////       N2=N1*2;
//         //   return (N2);
//
//        //}
//       // for (int row = 0; row < 7; row++) {
//           // for (int col = 0; col < 7; col++) {
//               // if (row == col || row + col == 7 - 1) {
//                //    System.out.print("*");
//              //  } else {
//            //        System.out.print(" ");
//          //      }
//         //   }
//        //    System.out.println();
//        //}
}
    static int hed1(int y) {
        int x = y % 10;

        return (x);
    }
    static int hed2(int y){

        int z=y/10;

        return (z);
    }

}
