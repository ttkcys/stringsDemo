package stringsdemo;

public class StringsDemo {

    public static void main(String[] args) {
        String message = "Today, weather is good.";

        //Prints the message to the screen.
        System.out.println(message);

        //Prints the length of the message to the screen.
        System.out.println("Numbers of element : " + message.length());

        //It prints the 5th element of the message to the screen.
        System.out.println("Element of 5 : " + message.charAt(4));

        //Merges to the end of the message.
        System.out.println(message.concat(" Nicee!!"));

        //Checks if your message starts with T.
        System.out.println(message.startsWith("T"));

        //Checks if your message starts with W.
        System.out.println(message.startsWith("W"));

        //Checks if your message ends with ..
        System.out.println(message.endsWith("."));

        //Checks if your message ends with T.
        System.out.println(message.endsWith("T"));

        //Assigns the elements of the message to a new array.
        char[] characters = new char[6];
        message.getChars(0, 5, characters, 0);
        System.out.println(characters);

        //Indicates with which index the specified character or text begins in the message.
        System.out.println(message.indexOf('a'));
        System.out.println(message.indexOf("wea"));
        System.out.println(message.lastIndexOf('s'));
        System.out.println(message.lastIndexOf("is"));

        //It is used for the expression we want to change.
        System.out.println(message.replace(' ', '-'));

        //It prints the text from the index we want to start with.
        System.out.println(message.substring(2));

        //It prints the text from the index we want to start to the index we want to end.
        System.out.println(message.substring(2, 8));

        //We separate the words of the text one by one and keep it in the array.
        for (String word : message.split(" ")) {
            System.out.println(word);
        }

        //Converts all text to lowercase.
        System.out.println(message.toLowerCase());

        //Converts all text to uppercase.
        System.out.println(message.toUpperCase());

        String message2 = "     Today, weather is good.     ";
        //Deletes leading and trailing spaces in text.
        System.out.println(message.trim());

    }

}
