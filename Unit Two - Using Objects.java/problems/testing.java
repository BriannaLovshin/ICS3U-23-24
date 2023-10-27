package problems;


public class testing {
    public static void main(String[] args) {
    String a = "abc";
        String b = "<<>>";
        String makeOutWorld = b.substring(0, 2) + a.substring(1) + b.substring(2);
        System.out.println(makeOutWorld); 

       String j = "Hi";
       String k = "Hi";
       String i = new String("Hi");
       System.out.println(j==i); 
        System.out.println(k.equals(i));


    }
    
}
