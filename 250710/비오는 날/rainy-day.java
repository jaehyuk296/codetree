import java.util.*;

class Data {
    String date;
    String day;
    String weather;

    public Data(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    public void print() {
        System.out.println(date + " " + day + " " + weather);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Data[] arr = new Data[n];

        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            arr[i] = new Data(date, day, weather);
        }

        Arrays.sort(arr, new Comparator<Data>() {
            public int compare(Data a, Data b) {
                return a.date.compareTo(b.date);
            }
        });

        for (int i = 0; i < n; i++) {
            if (arr[i].weather.equals("Rain")) {
                arr[i].print();
                break;
            }
        }
    }
}
