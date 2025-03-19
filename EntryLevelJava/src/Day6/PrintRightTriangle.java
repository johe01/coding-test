package Day6;

import java.util.Scanner;

public class PrintRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
        for(int i=0; i<n; i++){
            String temp = "";
            for(int j=0; j<i+1; j++){
                temp += "*";
            }
            System.out.println(temp);   
        }
    }
}
