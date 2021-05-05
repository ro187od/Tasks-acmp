package com.company;

import java.util.Scanner;

public class Tasks892 {

    public static void main(String[] args) {
        final String[] month = {
                "January", "February",
                "March", "April",
                "May", "June",
                "Jule", "August",
                "September", "October",
                "November", "December"
        };

        Scanner in = new Scanner(System.in);
        int number_month = in.nextInt() - 1;

        if(number_month < 0 || number_month > month.length){
            System.out.println("Error");
        }else{
            System.out.println(month[number_month]);
        }

    }
}
