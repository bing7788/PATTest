package test;

import java.util.Scanner;

public class Arps {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        String[] str = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(str[i]);
            min = arr[i] > min ? min : arr[i];
            max = arr[i] < max ? max : arr[i];
        }
        if (min == max) {
            System.out.println("Possible");
            return;
        }
        int dif = (max - min) / (n - 1);
        for (int i = 0; i < n; i++) {
            int tmp = (max - Math.abs(arr[i])) / dif;
            if (tmp < 0 || tmp >= n) {
                System.out.println("Impossible");
                return;
            }
            arr[tmp] = -Math.abs(arr[tmp]);
        }
        for (int i : arr) {
            if (i > 0) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }
 
}
