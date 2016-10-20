/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nqueengui;

import java.util.*;

public class Solver{
    String ans;
    Solver(int n){
        ans = new String("");
        solve(n);
    }
   

    public static boolean checkpos(int[] q, int n) {
        for (int i = 0; i < n; i++) {
            if ((q[i] == q[n])||((q[i] - q[n]) == (n - i))||((q[n] - q[i]) == (n - i)))
            	return false;
        }
        return true;
    }

    public void printQueens(int[] q) {
        int n = q.length;
        String temp = new String();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (q[i] == j) {System.out.print("Q "); temp += "Q";}
                else           {System.out.print("* "); temp += "*";}
            }
            System.out.println();
            temp += "\n";
        }  
        System.out.println();
        temp += "\n";
        ans += temp;
    }

    public void solve(int n) {
        int[] a = new int[n];
        solve(a, 0);
    }

    public void solve(int[] q, int k) {
        int n = q.length;
        if (k == n) printQueens(q);
        else {
            for (int i = 0; i < n; i++) {
                q[k] = i;
                if (checkpos(q, k)) solve(q, k+1);
            }
        }
    }  

}