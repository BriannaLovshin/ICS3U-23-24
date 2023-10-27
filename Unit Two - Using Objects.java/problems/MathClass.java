package problems;

import java.util.Scanner;

public class MathClass{
    
    public static void main(String[] args) {

        //problem 1
        int a = (int) (Math.random() * 100);
        System.out.println(a);

        //problem 2
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int b = in.nextInt();
        int c = (int) Math.pow(b, 2); 
        System.out.println(c);

        //problem 3
        System.out.print("Please enter a number: ");
        int d = in.nextInt();
        double e = (double) Math.sqrt(d); 
        System.out.println(e);

        //problem 4
        String f = "Toronto";
        System.out.print("Please enter a number between 0-6: ");
        int g = in.nextInt();
         System.out.print("Please enter another number between 0-7 this has to be higher than the number you imputed before: ");
        int h = in.nextInt();
        String user = f.substring(g, h);
        System.out.println(user);

        //problem 5
        System.out.print("imput a word: ");
        String i = in.next();
         System.out.print("imput another word: ");
        String j = in.next();
        boolean k = (boolean) j.equals(i);
        System.out.println(k);

        //problem 6
        int l = (int) (Math.random() * 26) + 65;
        char letter = (char)l;
        System.out.println(l + "  ,this number converted to a charcter is");
        System.out.println(letter);

        //problem 7
        String lola = new String("lola");
        System.out.print("Please enter a character: ");
        String jo = in.next();
        System.out.println(lola.indexOf(jo));

        //problem 8
        System.out.print("Please enter a word: ");
        String yolo = in.next();
        System.out.print("Please enter a word: ");
        String yola = in.next();
        System.out.println(yolo+yola);

        //problem 9
        int la = (int) (Math.random());
        int lao = (int) (Math.random());
        int coco = (int) Math.pow(la, lao); 
        System.out.println(coco);


        //problem 10

       




    }

    
}
