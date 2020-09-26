import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char top_left = '┌';
        char top_right = '┐';
        char bottom_left = '└';
        char bottom_right = '┘';
        char top_bottom = '─';
        char sides = '│';
        System.out.println("Enter the dimensions of Rectangle");
        System.out.println("(The dimensions of Rectangle should be greater than or equal to 2)");
        System.out.println("Height :");
        int height;
        height = sc.nextInt();
        System.out.println("width :");
        int width;
        width = sc.nextInt();
        System.out.println("Required Rectangle is as follows : ");

        System.out.print(top_left);
        for (int i = 0; i < width - 2; i++) {
            System.out.print(top_bottom);
            System.out.print(top_bottom);

        }
       System.out.println(top_right);

       for (int j = 0; j < height - 2; j++) {
            System.out.print(sides);
            System.out.print(" ");
            for (int i = 0; i < width - 2; i++)
                System.out.print(" ");
            System.out.println(sides);
        }
        System.out.print(bottom_left);
        //System.out.print(top_bottom);
        for (int i = 0; i < width - 2; i++) {
            System.out.print(top_bottom);
            System.out.print(top_bottom);
        }
        System.out.println(bottom_right);
    }
}
