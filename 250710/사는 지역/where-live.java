import java.util.*;

class World {
    String name;
    String address;
    String region;

    public World(String name, String address, String region) {
        this.name = name;
        this.address = address;
        this.region = region;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        World[] wo = new World[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();
            wo[i] = new World(name, address, region);
        }

        Arrays.sort(wo, new Comparator<World>() {
            public int compare(World a, World b) {
                return a.name.compareTo(b.name);
            }
        });

        System.out.println("name " + wo[n - 1].name);
        System.out.println("addr " + wo[n - 1].address);
        System.out.println("city " + wo[n - 1].region);
    }
}
