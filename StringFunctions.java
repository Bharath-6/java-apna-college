public class StringFunctions {
    public static void main(String args[]) {
        // concatenation: Adding the strings is known as concatenation
        String firstName = "Tony";
        String lastName = "Strak";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        // length
        System.out.println(fullName.length());
        // charAt:used to print each of the charcter present in the sentence
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
        // compare
        String name1 = "Tony";
        String name2 = "Tony";
        // 1 s1>s2
        // 2 s1==s2
        // 3 s1<s2
        // in the case of both string hello and cello then the biggest string is hello
        // and the smallest will be the cello
        // some times we use equal to it will work but not in all cases
        if (name1.compareTo(name2) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        // substring
        String sentence = "my name is Bharath";
        String name = sentence.substring(11, sentence.length());
        String name1 = sentence.substring(11);
        System.out.println(name1);
        System.out.println(name);

        // strings are immutable :once we create any string we can't modify if we want
        // it modify then we hava to create new string.
        // parseInt Method of Integer class
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);
        // to string method of string class
        int number1 = 123;
        String str1 = Integer.toString(number1);
        System.out.println(str1.length());

    }
}
