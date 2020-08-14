import java.util.Arrays;
import java.util.List;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

//        TODO What happens when you run the following code? Why is Arrays.toString necessary?
//        It shows the location of the array when you use System.out.println(numbers);

//        TODO Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
        String[] Persons = new String[3];

        Persons[0] = "Vanessa";
        Persons[1] = "Jesse";
        Persons[2] = "Amaro";

        for(String person : Persons){
            System.out.println(person);
        }

        System.out.println(addPerson(Persons, "Tommy"));

    }
//        TODO Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    public static String addPerson(String[] Persons, String person){
        // display the original array
        System.out.println("Original Array: " + Arrays.toString(Persons));

        // element to be added
        Persons = Arrays.copyOf(Persons, Persons.length + 1);

        // Assign Person to the last element
        Persons[Persons.length - 1] = person;

        return "The new array is: " + Arrays.toString(Persons);
    }
}
