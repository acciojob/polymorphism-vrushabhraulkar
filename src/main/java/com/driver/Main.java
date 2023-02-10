package com.driver;

public class Main {
        public static class Product{
            public int product(int x, int y) {
                int ans=x * y;
                return ans;
            }
            public int product(int x, int y, int z) {
                int ans = x*z*y;
                return ans;
            }
            public double product(double x, double y) {
                double ans=x*y;
                return ans;
            }

        }

    public static void main(String[] args) {
        Product p= new Product();
        System.out.println(p.product(3,5));
        System.out.println(p.product(3,5,7));
        System.out.println(p.product(3.5,5.5));


    }
}