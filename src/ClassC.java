import tirgul.Cclass;
import tirgul.Monkey;

public class ClassC {

    public static void main(String[] args) {
//        Monkey x =new Monkey("greg");
//        System.out.println();
//        x.setMname("momo");
//        System.out.println(x.getMname());

 Cclass child = new Cclass("Girl");
 child.setAge(10);
 child.setName("Boy");
        System.out.println(child.getName());
        System.out.println(child.getAge());
    }


}
