    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                if (n == 0) {
                    return 0;
                } else {
                    return 2 + bunnyEars(n - 1);
                }
            }
        
            public static int factorial(int n){
                if (n == 1) {
                    return 1;
                } else {
                    return n * factorial(n-1);
                }
            }

            public static int sumNumbers(int n){
                if (n == 0) {
                    return 0;
                } else {
                    return n + sumNumbers(n - 1);
                }
            }

            public static String countDown(int n){
                if (n == 0) {
                    return "Blast Off!";
                } else {
                    System.out.println(n);
                    return countDown(n - 1);
                }
            }

            public static int power(int x, int n){
                if (n == 0) {
                    return 1;
                } else {
                    if (n == 1) {
                        return x;
                    } else {
                        return x*power(x, n-1);
                    }
                }

            }

            public static int fib(int n){
                if (n == 0) {
                    return 0;
                } else {
                    if (n == 1) {
                        return 1;
                    } else {
                        return fib(n-1) + fib(n-2);
                    }
                }
            }

            public static int countX(String s){
                if (s.length() == 0) {
                    return 0;
                } else {
                    if (s.substring(0,1).equals("x")) {
                        return 1 + countX(s.substring(1));
                    }
                    else {
                        return countX(s.substring(1));
                    }
                }
            }

            public static String changePi(String s){
                if (s.length() == 0) {
                    return "";
                } else if (s.startsWith("pi")) {
                    return "3.14" + changePi(s.substring(2));
                } else {
                    return s.substring(0, 1) + changePi(s.substring(1));
                }
            }


            public static String reverse(String s) {
                if (s.length() <= 1) {
                    return s;
                } else {
                    return reverse(s.substring(1)) + s.substring(0,1);
                }
            }

            public static Boolean isPalindrome(String s){
                if (s.length() <= 1) {
                    return true;
                }
                int min = 0;
                int max = s.length() - 1;
                if (!s.substring(min, min + 1).equals(s.substring(max, max + 1))) {
                    return false;
                } else {
                    return isPalindrome(s.substring(1, s.length() -1));
                }
            }

            public static void main(String[] args) {
                int n = 3;
                System.out.println(sumNumbers(n));
            }



    }