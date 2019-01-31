import java.util.Scanner;

public class BoxTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter object's length");
        float length = input.nextFloat();
        System.out.println("Please enter object's width");
        float width = input.nextFloat();
        System.out.println("Please enter object's height");
        int height = input.nextInt();
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        if (box3.validate(length,width,height)) {
            System.out.println("你的包裹適合Box3的尺寸");
        } else if (box5.validate(length,width,height)){
            System.out.println("你的包裹適合Box5的尺寸");
        } else {
            System.out.println("沒有合適尺寸的Box");
        }

    }
}
