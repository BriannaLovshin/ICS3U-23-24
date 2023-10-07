package lesson6;

import java.util.Scanner;

public class BayviewGlenPool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the length of the pool: ");
        int length = in.nextInt();
        System.out.print("Please enter the length of the shallow end of the pool: ");
        int shallowLength = in.nextInt();
        System.out.print("Please enter the length of the transition part of the pool: ");
        int transition = in.nextInt();
        System.out.print("Please enter the length of the shallow height of the pool: ");
        int shallowHeight = in.nextInt();
        System.out.print("Please enter the height of the deep end of the pool: ");
        int deepHeight = in.nextInt();
        System.out.print("Please enter the width of the pool: ");
        int width = in.nextInt();
        System.out.print("Please enter the liner cost per square meter: ");
        int linerCost = in.nextInt();
        
        int transitionHeight = deepHeight - shallowHeight; 
        double transitionLength = Math.sqrt(transitionHeight*transitionHeight + transition * transition);
        double deepLength = length - (transitionLength +shallowLength);

        // surface area of the pool (liner)//

        int salenghtwall = (length * width);
        int sawidthwallshallow = shallowHeight * width;
        int sawidthwalldeep = deepHeight * width;
        int sabottomshallow = shallowLength * width;
        double sabottomdeep = deepLength * width; 
        double sabottomtransition = transition * width;

        int linertotal = (int)(salenghtwall + sawidthwallshallow + sawidthwalldeep + sabottomshallow + sabottomdeep + sabottomtransition);
        int linerprice = (int)(linertotal *linerCost);
        System.out.print("The amount of liner is ");
        System.out.print(linertotal);
        System.out.println("m squared.");
        System.out.print("The cost of the liner is $");
        System.out.print(linerprice);
        System.out.println(".");

        //volume of pool//
        int volumetop = (shallowHeight*length*width); 
        double volumebottom = (deepLength*deepHeight*width);
        double volumemiddle = (transitionLength*shallowHeight*width);
        double volumetriangle = (0.5*(transitionHeight*transitionLength*width));
        int totalvolume = (int)(volumetop + volumebottom + volumemiddle + volumetriangle);
        double volume = totalvolume*0.9;

        System.out.print("The pool needs ");
        System.out.print(volume);
        System.out.print("L of water to keep the pool 90% full.");

                

                

        




        



    }

}




