public class ClassA {
    public static void main(String[] args) {
//        float a =3.1454587878f;
//        int b = (int)a;
//        System.out.println(b);
//        float h = 8f;
//        float e = 9f;
//        if (h != e) {
//            System.out.println(h);
//            System.out.println(h+e);
//            System.out.println(h*e);
//            System.out.println(e/h);
//        }
//
////        System.out.println("חדוה לימודיאוטומציה");
//    }
        A a = new B();

        System.out.println(a.i);
    }
        static class A{
        int i=10;

        }

        static class B extends A{
            int i=20;

        }
    }

