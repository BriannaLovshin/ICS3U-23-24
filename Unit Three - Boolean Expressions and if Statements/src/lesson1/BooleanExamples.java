package lesson1;

//boolean examples//

public class BooleanExamples {
    public static void main(String[] args) {
        boolean isHappy = true;
        boolean hasBlueShoes = false;

        System.out.println(isHappy);
        System.out.println(hasBlueShoes);

        System.out.println(4>3);
        System.out.println(4>3);

        System.out.println(4>=3);
        System.out.println(4<=3);

        System.out.println(4==3); 
        String str = "Hello";
        System.out.println("Hi".equals(str));  
        System.out.println("Hello".equals(str));   
        System.out.println(str == "Hello");  

        System.out.println(4!=3); //true (!= means that it is not equal)

        System.out.println(!isHappy); // false because !true is false
        System.out.println(isHappy == false);

        System.out.println(!"Hello".equals(str)); //make hello note equal to str by putting a !




    }
}
