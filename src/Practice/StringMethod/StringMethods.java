package Practice.StringMethod;

public class StringMethods {
    public static void main(String[] args) {
        String country= "America";
        String capital= "Washington DC";
        String tempVaalue ="Nepal";

        //Length method is used to get the length of string. O/P=7(AAmerica=7)
        System.out.println("The length of country:"+ country.length());

        //charAt(): It is used to get a character at the specified index.o/p=r
        System.out.println("The character of America is:"+country.charAt(3));

        //equals(): It is used to check if two string are equal or not
        System.out.println("the two string are equal:"+country.equals(capital));

        //replace(): It is used to replace a string with another string.
        System.out.println("Replace String is:"+country.replace(country,capital));

        //substring(): It is used to get a substring from a string.
        System.out.println(capital.substring(8));
        //toUppercase
        System.out.println(country.toUpperCase());
        System.out.println(capital.toLowerCase());
    }
}
