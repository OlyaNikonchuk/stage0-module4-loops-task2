package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count=0;
        int temp=0;
        if (multiplyByAndToInclusive < 0) {
            temp = -1 * multiplyByAndToInclusive;
        } else {
            temp = multiplyByAndToInclusive;
        }
        if(multiplyByAndToInclusive!=0) {
            while (count <= temp) {
                System.out.println(count*multiplyByAndToInclusive);
                count++;
            }
        }
        }
    }
