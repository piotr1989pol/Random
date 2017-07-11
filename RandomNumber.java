import java.util.Random;

/**
 * Created by Piotr on 2017-07-11.
 */
public class RandomNumber {
public static void main(String args[]) {
    Random gen = new Random();
    int a = gen.nextInt(101);
    System.out.println(a);

}


}
