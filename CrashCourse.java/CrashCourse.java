package CrashCourse;

public class CrashCourse {
   
    public static void main(String[] args) {

        //comment
        /*Multiline comment
        
        */


        System.out.print("Hello");
        System.out.println("World"); //Auto prints on new line
        System.out.println("Hello World");
    
    //Variable Declarations
    //Primitive Variables
    int a; //integer
    double b; //decimal
    boolean c; //True or false

    a = 4;
    b = 5.5;
    c = false;  //lowercase

    // Arithmetic operators
    // + - / * %
    // += -= /= %=

    int d = 3;
    d+= 7;

    System.out.println("d = " + d);
    
    //increment and decrement
    // -- ++
     
    d--;
    d++;
    d++;
    System.out.println("d is NOW equal to " + d);

    //COMPARISONS (always returns true or false)
    // < > <= >= == !=
    System.out.println(4 > 5);
    System.out.println(4 < 5);
    System.out.println(7 == 4);
    System.out.println(1 != 2);
    

    //Logical Operators
    // In order of precedence: Not !  And &&  Or||
    
    boolean e = false; boolean f = true;
    
    //predict output

    System.out.println("____________");

    System.out.println(!e); //true
    System.out.println(e && f); //false
    System.out.println(e || f); //true
    System.out.println(e || f && !e); //true


    System.out.println( e && f); //short circuits after checking e
    
    // CASTING (converting)
    int g = (int)5.5;
    System.out.println(g);
    double h = (double)5/6;
    System.out.println(h);
    
    //STRINGS

    String s1 = "Goodnight";
    String s2 = " and ";
    String s3 = "Goodbye";
    String result = s1 + s2 + s3;
    result += ", Cowboy";
    System.out.println(result);
    


    }

}

