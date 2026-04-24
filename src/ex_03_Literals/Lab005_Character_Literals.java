package ex_03_Literals;

public class Lab005_Character_Literals {
    public static void main(String[] args) {
        char c1 = 'A';
        // A to Z, a-z, !@#$%^&*()_+
        // char c = "A"; It's a String - "" - bunch of chars.
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        char c9 = 'A';
        //ASCII, (limited numbers) - A -> 65
        //ASCII stands for American Standard Code for Information Interchange.
       //Every character enclosed in single quotation marks will have an integer equivalent value called as ASCII value.
       //ASCII Value Range is 0 – 255.
       //ASCII Value can be assigned to a char type variable


        char rupees = '₹';
        System.out.println(rupees);


        char laugh_smiley = '\u1f60'; // :)
        System.out.println(laugh_smiley);

    }
}
