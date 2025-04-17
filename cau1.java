/*Người dùng nhập vào 1 số N và yêu cầu in ra các kết quả sau:
 * 1. Danh sách số lẻ
 * 2. Danh sách số chẵn
 * 3. In ra dãy số nguyên tố có trong N
 * 4. In ra dãy số fibonacci có trong N
 */

import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println(""); //Danh sách số lẻ

        for(int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(""); //Danh sách số chẵn

        for(int i = 0; i <= n; i++) {
            if ((i % 1 == 0) && (i % i == 0)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(""); //In ra dãy số nguyên tố có trong N
    }
}