package usefulExtraExercises.ArrayConditionalsAndMethods;

public class Example {

    public static void main(String[] args) {

        // Write a method that reverses any String and print to console
        // Input should be a string
        // Output should be reversed input
        // "Hello" -> "olleH"
        System.out.println("Question 1: ");

        String notDeclaredString = StringReversed(null);
        String helloReversed = StringReversed("Hello, World!");
        String charlesReversed = StringReversed("Charles");

        System.out.println(notDeclaredString);
        System.out.println(helloReversed);
        System.out.println(charlesReversed);
        System.out.println();

        // Given the following String input
        // String input = "   amig os cod e  "
        // Write a method that transforms input into: Amigoscode
        System.out.println("Question 2: ");

        String testString = stripsWhitespaceAndCapitalize("   amig os cod e  ");
        String testStringTwo = stripsWhitespaceAndCapitalize("     ch a r   le s ");
        String emptyWhiteSpace = stripsWhitespaceAndCapitalize("     ");
        String oneCharacter = stripsWhitespaceAndCapitalize("aa");
        String emptyWhitespaceHello = stripsWhitespaceAndCapitalize("  hello   ");

        System.out.println(testString);
        System.out.println(testStringTwo);
        System.out.println(emptyWhiteSpace);
        System.out.println(oneCharacter);
        System.out.println(emptyWhitespaceHello);
        System.out.println();

        // Write a method that finds the longest string in any given array.
        // i.e. [] -> ""
        // i.e. ["hello", "ola", "bye", "ciao"] -> hello
        // i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        // i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
        System.out.println("Question 3: ");

        String[] array1 = {};
        String[] array2 = {"hello", "ola", "bye", "ciao"};
        String[] array3 = {"hello", "hello", "ola", "bye", "ciao"};
        String[] array4 = {"hello", "bingo", "ola", "bye", "ciao"};

        String result = longestStringInArray(array1);
        System.out.println("String array1 result: " + result);

        String resultTwo = longestStringInArray(array2);
        System.out.println("String array2 result " + resultTwo + ", is the longest word.");

        String resultThree = longestStringInArray(array3);
        System.out.println("String array3 result: " + resultThree + ", is only unique longest string.");

        String resultFour = longestStringInArray(array4);
        System.out.println("String array4 result " + resultFour + ", are the only unque longest strings.");
    }


    public static String StringReversed(String myString) {

        // creates one mutable buffer in memory
        StringBuilder reversed = new StringBuilder();

        // Checks to see if String is empty or null
        if (myString == null || myString.isEmpty()) {
            return myString;
        }

        for (int i = myString.length() - 1; i >= 0; i--) {
            // appends character @ index starting from the end
            reversed.append(myString.charAt(i));
        }

        // toString() creates one final string at the end
        return reversed.toString();
    }

    public static String stripsWhitespaceAndCapitalize(String myString) {

        StringBuilder stripped = new StringBuilder();

        // Checks to see if String is empty or null
        if (myString == null || myString.isEmpty()) {
            return myString;
        }

        for (int i = 0; i < myString.length(); i++) {

            char character = myString.charAt(i);

            // Checks if the character @ index is not white space, then appends to stripped string
            if (!Character.isWhitespace(character)){
                stripped.append(character);
            }

        }

        // if the string doesn't contain white space, capitalize the list letter in the string
        if (!myString.isBlank()){
            stripped.replace(0, 1, stripped.substring(0, 1).toUpperCase());
        } else {
            return "String provided only contains whitespace";
        }

        return stripped.toString();
    }

    public static String longestStringInArray(String[] array){

        String longestString = "";

        // length of a string at an index
        int maxLengthString = 0;

        // Checks to see if String is empty or null
        if (array == null || array.length == 0) {
            return "Array does not contain anything";
        }
        System.out.println();


        for (int i = 0; i < array.length; i++) {

            // Checks if array is null and checks if the current string is longer than any string we’ve seen so far.
            if (array[i] != null && array[i].length() > maxLengthString){

                // Assigns the longest string at index
                longestString = array[i];

                // integer value for the longest string
                maxLengthString = array[i].length();

                // Checks if maxLengthString the same length as the current maximum (This handles ties — strings that are equally long as the longest found so far)
                // Ensures you don’t append a string that’s already in longestString (this handle strings that are identical)
                // Therefore we get different strings of the same length being the longest in the array
            } else if (array[i] != null && array[i].length() == maxLengthString && !longestString.contains(array[i])) {

                longestString += ", " + array[i];

            }
        }

        return longestString;
    }
}
