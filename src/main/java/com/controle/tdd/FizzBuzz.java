package com.controle.tdd;

public class FizzBuzz {
        public static String de(int nbre){
            String S;
            if(nbre % 3 == 0 && nbre % 5 == 0 ){
                S="FizzBuzz";
            }
            else if(nbre % 3 == 0  ){
                S ="Fizz";
            }else if(nbre % 5 == 0 ){
                S="Buzz";
            }else {
                S =""+nbre;
            }
            return S;
        }
    }

