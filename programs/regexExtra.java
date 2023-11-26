
public class regexExtra {
    public static void main(String[] args){
        String str = "  asj     sa mn    aaa    ";
        String strNot = "Hello bhaiya aur btao kya chal rha h";
        System.out.println(str.replaceAll("\\s+", " "));
        System.out.println("Given string : "+strNot);
        String ste[] = strNot.split("\\s");
        System.out.println("The number of words in the string are "+ste.length);
    }
}
