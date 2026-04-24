package ex_02_Variables_Datatypes;

public class Lab003_Suitable_Datatypes {
    static void main(String[] args) {
        // I want to store the age of a person
        // We will be considering maximum age of a person (ex: 122)
        // should we use byte/short/ int ?

        byte max_age_b = 122; // Maximum range of byte is 127

        // if we store the value in short/int the extra memory will be wasted
        // we need to optimize the code
        short max_age_s = 122;
        int max_age = 122;

        System.out.println( max_age_b);

       //similarly we can't store larger value in a small container
        // we have to use suitable datatypes acc to its range
        //byte max_age_c = 128;
    }
}
