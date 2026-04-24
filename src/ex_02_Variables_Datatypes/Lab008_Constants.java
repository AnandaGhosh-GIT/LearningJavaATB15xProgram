package ex_02_Variables_Datatypes;

public class Lab008_Constants {
    public static void main(String[] args) {

        //For Normal Variables We can change the values:
        int i= 10;
        i =100;
        System.out.println(i);

        //Constants are those special variables which value can't be changed
        // We need to add a 'final' keyword for declaring constant values
        final double PI = 3.14;
        // PI = 4.24; // if we want to change the value JAVA will through an Error
        System.out.println(PI);

    }
}
