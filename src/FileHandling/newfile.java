package FileHandling;

//Check data type in JAVA
public class newfile {
    public static void main(String[] args) {
        System.out.println('2');
        String s="1234";
        System.out.println(((Object) s.charAt(0)).getClass().getSimpleName());
        System.out.println(((Object)('a'+2)).getClass().getSimpleName());
    }
}
