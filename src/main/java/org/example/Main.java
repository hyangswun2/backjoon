/* 문제 :
    1000 미만의 자연수에서 3과 5의 배수의 총합을 구하라.
 */

package org.example;

public class Main {
    public static void main(String[] args) {
    int add_all = 0;
    for (int i = 0; i < 999; i++) {
        if ((i + 1) % 3 == 0 || (i + 1) % 5 == 0) add_all += (i + 1);
    }
    System.out.println(add_all);
    }
}