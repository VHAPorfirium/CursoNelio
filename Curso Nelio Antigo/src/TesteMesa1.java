import java.util.Scanner;

public class TesteMesa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 5, y = 0;

        while (x > 2) {
            System.out.println(x);
            y = y + x;
            x = x - 1;
        }
    }
}
