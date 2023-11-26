public class gmail {
    public static void main(String[] args){
        String str = "programmer@gmail.com";
        int index = str.indexOf("@");
        int index1 = str.indexOf(".");
        System.out.println(index);
        System.out.println(index1);
        System.out.print("Username : ");
        for(int i=0;i<index;i++){
            System.out.print(str.charAt(i));
        }
        System.out.print("\nDomain name : ");
        for(int j=index+1;j<str.length();j++){
            System.out.print(str.charAt(j));
        }
        System.out.println("\n");
        
        String str1 = str.substring(index+1, index1);
        if(str1.matches("gmail")){
            System.out.println("YES,the given id belongs to the gmail.");
        }
        else{
            System.out.println("NO,the given id is invalid.");
        }
    }
}
