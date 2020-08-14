package util;
public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        do {
            System.out.print("Enter some whole integer number: ");
            String userInput = input.getString();
            input.getInt(userInput);
        } while( input.yesNo() );
        do {
            input.getDouble(1, 10);
        } while( input.yesNo() );
    }
}
