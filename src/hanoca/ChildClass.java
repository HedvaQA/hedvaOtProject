package hanoca;

public class ChildClass extends  AbstractA implements InterfaceA {
    int a;
    int b;

    @Override
    public int calculate(int a,int b) {

         //System.out.println(a*b);
         return a*b;
    }

    public int sum(int a,int b) {
        int c=a+b;
       // System.out.println(c);
        return c;

    }



}
