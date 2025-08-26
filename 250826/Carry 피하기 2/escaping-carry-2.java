import java.util.Scanner;

public class Main {
    public static int[] intarr(int num) { // 각 자리수 배열로 분해 (5자리 고정)
        int a = 5;
        int arr[] = new int[a];
        int i = 0;
        int ten = 10000;
        while (a > 0) {
            arr[i] = num / ten;
            num = num % ten;
            i++;
            ten /= 10;
            a--;
        }
        return arr;
    }

    public static int carry(int[] a, int[] b, int[] c) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int temp = a[i] + b[i] + c[i];
            if (temp >= 10) return -1; // 자리올림 발생 → 무효
            sum = sum * 10 + temp;     // 한 자리씩 합치기
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();           // 숫자 개수
        int[] arr = new int[n];         // 입력 저장
        int finial[][] = new int[n][5]; // 결과 저장 (n행 5열)

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();          // 숫자 입력
            int result[] = intarr(arr[i]);  // 자릿수 배열
            finial[i] = result;             // 2차원 배열에 저장
        }

        int max = -1;
        // 3개 숫자 고르기
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    int result = carry(finial[i], finial[j], finial[k]);
                    if (result != -1) {
                        max = Math.max(max, result);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
