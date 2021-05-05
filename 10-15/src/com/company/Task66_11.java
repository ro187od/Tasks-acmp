package com.company;

import java.util.Scanner;

public class Task66_11 {
    public static void main(String[] args) {
        final char[] letters_q = {'q' , 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};

        Scanner in = new Scanner(System.in);
        int letterFromConsole = in.next().charAt(0);

        for (int i= 0; i <= letters_q.length; i++){
            if(letters_q[i] == letterFromConsole){
                if(i+1 == letters_q.length){
                    System.out.println("I'm sorry, it's last letter.");
                }else{
                    System.out.println(letters_q[i+1]);
                }
                break;
            }
        }
    }

}
