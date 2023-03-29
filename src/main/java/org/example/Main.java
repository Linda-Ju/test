package org.example;


import java.util.HashMap;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i < 10; i++) {
//            System.out.println(i);
//        }
//
//        int a = 5;
//        while (a > 1) {
//            System.out.println(a);
//            a--;
//        }
//
//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=10);


//        int a = 2;
//        int b = 3;
//        int c = a +b;
//        a = c - a;
//        b = c - b;
//        System.out.println(a + ", " + b);
//
//        int a = 2;
//        int b = 3;
//        a = a + b;
//        b = a - b;
//        a = a - b;
//        System.out.println(a + ", " + b);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int number = scanner.nextInt();
//        if(number %2==0){
//            System.out.println("number is even");
//        }else{
//            System.out.println("number is odd");
//        }

//        String string1 = "Hello world";
//        int count;
//        //Converts given string into character array
//        char string[] = string1.toCharArray();
//        System.out.println("Duplicate characters in a given string: ");
//        //Counts each character present in the string
//        for(int i = 0; i <string.length; i++) {
//            count = 1;
//            for(int j = i+1; j <string.length; j++) {
//                if(string[i] == string[j] && string[i] != ' ') {
//                    count++;
//                    //Set string[j] to 0 to avoid printing visited character
//                    string[j] = '0';
//                }
//            }
//            //A character is considered as duplicate if count is greater than 1
//            if(count > 1 && string[i] != '0')
//                System.out.println(string[i]);
//        }
//
//        COUNT DUPLICATES
//        String str = "This this is is done by Saket Saket";
//        String[] split = str.split(" ");
//        HashMap<String, Integer> map = new HashMap<>();
//        for (String s : split) {
//            if (map.containsKey(s)) {
//                int count = map.get(s);
//                map.put(s, count + 1);
//            } else {
//                map.put(s, 1);
//            }
//        }
//        System.out.println(map);

//        int num, a = 0,b=0, c =1;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the number of times: ");
//        num = in.nextInt();
//        System.out.println("Fibonacci Series of the number is: ");
//        for (int i=0; i<num; i++) {
//            a = b;
//            b = c;
//            c = a+b;
//            System.out.println(a + "");    //if you want to print on the same line, use print()
//        }

//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number= sc.nextInt();
//        if(isPrime(number)) {
//            System.out.println(number + " is prime number");
//        }
//        else{
//            System.out.println(number + " is a non-prime number");
//        }
//    }
//    static  boolean isPrime(int num)
//    {
//        if(num<=1)
//        {
//            return false;
//        }
//        for(int i=2;i<=num/2;i++)
//        {
//            if((num%i)==0)
//                return  false;
//        }
//        return true;
//    }


    }
}

