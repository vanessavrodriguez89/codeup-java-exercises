public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello, World!");


    int MyFavoriteNumber = 2;
        System.out.println(MyFavoriteNumber);

    String myString = "Today is Friday!";
        System.out.println(myString);
//      TODO Change your code to assign a character value to myString. What do you notice?
//    Received error "java: incompatible types: char cannot be converted to java.lang.String

    int myNumber = 314;
        System.out.println(myNumber);

//        TODO Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//   variable myNumber might not have been initialized

//        TODO Change your code to assign the value 3.14 to myNumber. What do you notice?
//   incompatible types: possible lossy conversion from double to long

//        TODO Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//

//        TODO Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//   incompatible types: possible lossy conversion from double to float.

//        int x = 5;
//System.out.println(x++);
//System.out.println(x);
// Line 32, x is called before it's incremented

//    int x = 5;
//System.out.println(++x);
//System.out.println(x);

//        String class = "Trying to create a variable named /"class/"";
//        System.out.println(class);
//        Mot a statement

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//	at HelloWorld.main(HelloWorld.java:44)

//        TODO Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;
//
        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);

//
//        System.out.print("\n\nEnter something: ");
//    String userInput = scanner.next();
//    System.out.println("You entered: --> \"" + userInput + "\" <--");
    }

}