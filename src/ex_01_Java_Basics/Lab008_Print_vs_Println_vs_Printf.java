package ex_01_Java_Basics;

public class Lab008_Print_vs_Println_vs_Printf {
    public static void main(String[] args) {

        //Print-The cursor remains on the same line immediately after the printed text.
        //      output will appear on that same line.
        System.out.print("Hello Ananda");
        System.out.print(" Ghosh!");


        //Println- The cursor moves to the beginning of the next line after printing the text.
        //         Subsequent output will start on a fresh line.
        System.out.println(" Welcome to");
        System.out.println("JAVA");
        int a = 2 - -7;
        System.out.println(a);

        //Printf- this method provides a way to output formatted text using format specifiers
        //        and optional flags
        String name = "Ananda";
        int age = 30;
        float height = 5.6f;
        System.out.printf("Name: %s, Age: %d, Height: %f", name, age, height);
    }
}
