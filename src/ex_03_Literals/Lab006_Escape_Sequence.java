package ex_03_Literals;

public class Lab006_Escape_Sequence {
    public static void main(String[] args) {

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';
        char backslash_character = '\\';

        System.out.println("AnandaGhosh");
        System.out.println("Ananda"+new_line+"Ghosh");
        System.out.println("Ananda"+tab_line+"Ghosh");
        System.out.println("Ananda"+back_space+"Ghosh");
        System.out.println("Ananda"+carriage_return+"Ghosh");
        System.out.println("Ananda"+backslash_character+"Ghosh");

        System.out.println( "-------------------------------------------------------------------");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

    }
}
