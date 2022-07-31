package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 1;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int result = 1;
            System.out.println(1);
            while (count <= power) {
                result = result * 2;
                System.out.println(result);
                count++;
            }
        }
    }
}
