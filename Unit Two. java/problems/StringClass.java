package problems;

public class StringClass{ 
    public static void main(String[] args) {

        //problem 1//
        String a = "abc";
        String b = "<<>>";
        String makeOutWorld = b.substring(0, 2) + a.substring(0) + b.substring(2);
        System.out.println(makeOutWorld); 

        //problem 2//
        String c = "WOOHOO";
        String firstHalf = c.substring(0, 3);
        System.out.println(firstHalf);

        //problem 3//
        String d = "Hello";
        String WithoutEnd = d.substring(1, 4);
        System.out.println(WithoutEnd);

        //problem 4//
        String e = "hi";
        String f = "hello";
        String comboString = (e+f+e);
        System.out.println(comboString);

        //problem 5//
        String g = "Hello";
        String h = "There";
        String NonStart = g.substring(1, 5) + h.substring(1, 5);
        System.out.println(NonStart);

        //problem 6//
        String i = "Hello";
        String left2 = i.substring(2, 5) + i.substring(0, 2);
        System.out.println(left2);

        //problem 7//
        String  j = "Hello";
        String right2 = j.substring(3, 5) + j.substring(0, 3);
        System.out.println(right2);

        //problem 8//
        String  k = "Hello";
        String withouEnd2 = k.substring(0, 1) + k.substring(4) + k.substring(0, 1) + k.substring(4);
        System.out.println(withouEnd2);

        //problem 9//
        String l = "string";
        String MiddleTwo = l.substring(2, 4);
        System.out.println(MiddleTwo);

        //problem 10//

        String m = "Chocolate";
        String nTwice = m.substring(0, 3) + m.substring(6);
        System.out.println(nTwice);

        //problem 11/
        String n = "java";
        String twoChar = n.substring(0, 2);
        System.out.println(twoChar);

        //problem 12//
        String o = "solving";
        String middleThree = o.substring(2, 5);
        System.out.println(middleThree);

        //problem 13//
        String p = "abcd";
        String atFirst = p.substring(0, 2);
        System.out.println(atFirst);

        //problem 14//
        String q = "last";
        String lastChars = q.substring(0, 1) + q.substring(2, 3);
        System.out.println(lastChars);

        //problem 15//
        String r = "cat";
        String s = "abc";
        String conCat = s.substring(0, 2) + r.substring(0);
        System.out.println(conCat);



        }



    
}
