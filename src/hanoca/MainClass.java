package hanoca;

public class MainClass {

    ///private static Object GetMassage;

    public static void main(String[] args) {
            ChildClass cc =new ChildClass();
            int m =  cc.calculate(9,15);
            int n= cc.sum(5,3);
            System.out.println(m);
            System.out.println(n);

int number=0;
int c=10;
String excep="";
try {
    c = m / number;
}
    catch (Exception x ) {
        x.printStackTrace();
        excep=x.getMessage();
    }
    finally {
    System.out.println(excep);
}

        }


        }


