package Strings;

public class AdjecencyUpperCase {
    public static String LowerToUpper(String s) {
        // code here
        char[] ch=s.toCharArray();
        StringBuilder newStr= new StringBuilder();
        int i=0;
        for( i=0;i<ch.length-1;i++){

                if(ch[i]==ch[i+1]){
                    newStr.append(String.valueOf(ch[i]).toUpperCase());
                    i++;
                }
            else{
                newStr.append(ch[i]);
            }
        }
         if(i==ch.length-1)
          newStr.append(ch[i]);
        return String.valueOf(newStr);
    }

    public static void main(String[] args) {
        String s="geeksforgeeks";
        System.out.println(LowerToUpper(s));
    }
}
