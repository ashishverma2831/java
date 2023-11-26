package strings;

import java.util.Scanner;

public class stringMethod {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = new String("Hello World");
        System.out.println(s);

        // char charArray[] = {'a','b','c','d'};
        // System.out.println(charArray);
        // String strChar = new String(charArray);
        // System.out.println(strChar);

        // byte byteArray[] = {65,66,67,68};
        // System.out.println(byteArray);
        // String strByte = new String(byteArray);
        // System.out.println(strByte); 

        // String str = "It's the beginning of the worst generation.";
        // System.out.println(str.length());
        // System.out.println("The length of the string is "+str.length());
        // int stringLength = str.length();
        // System.out.println("Length of entered string is "+stringLength);
        // System.out.print("Entered any string: ");
        // String enteredString = sc.nextLine();
        // System.out.println("You have entered: "+enteredString);
        // int enteredStringLength = enteredString.length();
        // System.out.println("The length of the entered String is "+enteredStringLength);

        // String str = "tony stark";
        // str = str.toUpperCase();
        // System.out.println(str);
        // System.out.println("Enter any string: ");
        // String str1 = sc.nextLine();
        // str1 = str1.toUpperCase();
        // System.out.println(str1);

        // String str = "MNSFNKNMLFJKSNKLLSKN";
        // str = str.toLowerCase();
        // System.out.println(str);

        // String str = "      welcome bhaiya    ";
        // str = str.trim();
        // System.out.println(str);

        // String str = "amkfjngjngjnnsj";
        // String str1 = str.substring(5);
        // System.out.println(str1);
        // String str2 = str.substring(4, 9);
        // System.out.println(str2);
        
        // String str = "tony chopper tony tony chopper";
        // String str1 = str.replace('o', 'h');
        // System.out.println(str1);
        // String str2 = str.replace("tony", "zoro");
        // System.out.println(str2);

        // String str = "www.onePiece.org";
        // boolean str1 = str.startsWith("www");
        // boolean str2 = str.startsWith("www",5);
        // boolean str3 = str.startsWith(".",3);
        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(str3);

        // String str = "www.onePiece.org";
        // boolean str1 = str.endsWith("org");
        // boolean str2 = str.endsWith("org",5);
        // boolean str3 = str.endsWith(".",3);
        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(str3);

        // String str = "Tony Stark";
        // char s = str.charAt(2);
        // System.out.println(s); 
        // for(int i=0;i<str.length();i++){
        //     System.out.print(str.charAt(i));
        // }
        // for(int i=0;i<str.length();i++){
        //     System.out.print(str.charAt(i));
        // }

        // String str = "tony and stark";
        // int indexNum = str.indexOf("n");
        // System.out.println(indexNum);
        // String strNot = "sfmksnsmsmn";
        // int indexNumFrom = strNot.indexOf("m");
        // System.out.println(indexNumFrom);
        // int indexNumFrom1 = strNot.indexOf("m",3);
        // System.out.println(indexNumFrom1);
        
        // String str = "tony and stark";
        // int indexNum = str.lastIndexOf("n");
        // System.out.println(indexNum);
        // String strNot = "sfmksnsmsmn";
        // int indexNumFrom = strNot.lastIndexOf("m");
        // System.out.println(indexNumFrom);
        // int indexNumFrom1 = strNot.lastIndexOf("m",5);
        // System.out.println(indexNumFrom1);

        // String str1 = "java program";
        // String str2 = "Java Program";
        // boolean equalString = str1.equals(str2);
        // System.out.println(equalString);
        // String str1 = "java program";
        // String str2 = "java program";
        // boolean equalString = str1.equals(str2);
        // System.out.println(equalString);
        // content check krta h ye (with casing)

        // String str1 = "java program";
        // String str2 = "Java Program";
        // boolean equalString = str1.equalsIgnoreCase(str2);
        // System.out.println(equalString);
        // content check krta h ye (without casing)
        
        // String str = "Java programs";
        // String str1 = new String("Java programs");
        // System.out.println(str.equals(str1));
        // System.out.println(str.equalsIgnoreCase(str1));
        // System.out.println(str==str1);
        // new will create in heap and second one will create in pool area.That's why
        // str != str1.

        // String str1 = "Python";  // P = 16
        // String str2 = "Java";    // J = 10
        // int diff = str1.compareTo(str2); 
        // System.out.println(diff);
        // str1 > str2 as P > J (16>10) => will give positive difference.
        // String str1 = "Python";  // P = 16
        // String str2 = "Python";    // J = 10
        // int diff = str1.compareTo(str2); 
        // System.out.println(diff);
        // str1 == str2 as P == P (16==16) => will give zero as difference.
        // String str1 = "Java";  // P = 16
        // String str2 = "Python";    // J = 10
        // int diff = str1.compareTo(str2); 
        // System.out.println(diff);
        // str1 < str2 as J < P (10<16) => will give negative difference.
        // comparing is nothing but difference between the two's

        // String str = "Tony Stark";
        // System.out.println(str.hashCode());
        // String str1 = "Hello! I am coming";
        // long hashCodeString = str1.hashCode();
        // System.out.println(hashCodeString);
        // String str = "Hello";
        // System.out.println(str.hashCode());

        // String.valueOf(" "); 
        // padhna h bhaiya, nhi aata h

        sc.close();
    }
}
