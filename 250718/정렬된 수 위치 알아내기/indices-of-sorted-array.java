import java.util.*;

class Number implements Comparable<Number> {
    int value;
    int originalIndex;

    public Number(int value, int originalIndex) {
        this.value = value;
        this.originalIndex = originalIndex;
    }

    @Override
    public int compareTo(Number other) {
        return this.value - other.value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Number[] arr = new Number[n];
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            arr[i] = new Number(value, i);
        }

        Arrays.sort(arr);

        int[] result = new int[n];

        for (int sortedIndex = 0; sortedIndex < n; sortedIndex++) {
            int originalIdx = arr[sortedIndex].originalIndex;
            result[originalIdx] = sortedIndex;
        }

        // 출력
        for (int i = 0; i < n; i++) {
            System.out.print(result[i]+1 + " ");
        }
    }
}
