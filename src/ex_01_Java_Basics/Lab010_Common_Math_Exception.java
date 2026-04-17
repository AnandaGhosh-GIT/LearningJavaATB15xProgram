package ex_01_Java_Basics;

public class Lab010_Common_Math_Exception {
    static void main(String[] args) {
       // Single Qutoes are not supported in JAVA
        // System.out.println('10/0');

        //math exception - divided by 0 will cause this error
        System.out.println(10/0);
        System.out.println(0/100);
        System.out.println(0/0);
    }

    }
}
