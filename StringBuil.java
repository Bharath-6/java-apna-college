import java.util.*;

public class StringBuil {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // //char at index 0
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // insert infront of tony
        sb.insert(0, 'S');
        System.out.println(sb);

        // now we want to make tony as tonny we will inlcude n infront of n
        sb.insert(2, 'n');
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(2, 3);
        System.out.println(sb);
        // appending
        StringBuilder sbb = new StringBuilder("h");
        sbb.append("e");// in string str = str +"e";
        sbb.append("l");// in string str = str +"l";
        sbb.append("l");
        sbb.append("o");
        System.out.println(sbb);
        System.out.println(sbb.length());
    }
}
