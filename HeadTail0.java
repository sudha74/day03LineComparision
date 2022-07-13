import java.util.Random;
import java.util.Scanner;

public class HeadTail0{

    public class HeadTail1 {
        public static void main(String[] args) {
            int headCount = 0;
            int tailCount = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter number");
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++)
            {
                Random random = new Random();
                int result = random.nextInt(2);
                if (result == 1) {
                    System.out.println("head");
                    headCount = headCount + 1;
                } else {
                    System.out.println("tail");
                    tailCount = tailCount + 1;
                }
            }
            System.out.println("Head count = " +headCount);
            String tailcount = null;
            System.out.println("Tail count = " +tailcount);

        }
    }

}
