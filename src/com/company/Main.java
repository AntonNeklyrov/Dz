package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Human[] humans = {new Teacher("Владимир", "Кургасов",45), new Student("Андрей", "Неклюдов", 17), new Teacher("Руслан", "Мамедов", 15) };

        int[] desc = {3, 6, 2 ,1, 15};

       System.out.println("Humans DESC");
       for(int i = desc.length-1 ; i >= 0; i--){
           System.out.println(desc[i]);;
       }



        int max = 0;
        for (int j : desc) {
            if (j > max) {
                max = j;
            }
        }

        int secondMax = 0;

        for (int i = 0; i < desc.length; i++) {
            if(desc[i] != max && desc[i] > secondMax){
                secondMax = desc[i];
            }
        }


        System.out.println(secondMax);
    }
}
