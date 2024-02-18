/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ansıcolors;

import java.util.Scanner;

/**
 *
 * @author Emir Sapmaz
 */
public class ANSIcolors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text that you want to make colorful!");
        String coloredText = input.nextLine();
        String ANSIcolor = "\u001B[30m";
        String ANSIreset =  "\u001B[0m";
        int splitted = Integer.parseInt(ANSIcolor.substring(2, 4));//getting the numbers of the ANSI color codes in the string
        while(true){
            splitted++; //incremeting the ANSI color code to change the color
            String newSplitted = Integer.toString(splitted); //converting the incremented number to string to be able to concat it to the orginal string
            String newString = ANSIcolor.substring(0, 2).concat(newSplitted+"m"); //adding the first part of the string and numbers together to make a new incremented string
            System.out.println(newString+coloredText+ANSIreset); //printing the colorful text, we need to add the color code in the beginning, text in the middle and reset(if needed) at the end of the string.
            if(splitted==45) //making the loop go back to the beginning
                splitted=29;
            else if(splitted==37) // skipping few numbers because they are colorles.
                splitted=40;
            Thread.sleep(400); //making the loop slower by making the main thread sleep 
        }
    }
}
