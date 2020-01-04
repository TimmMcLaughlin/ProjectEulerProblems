public class ProblemOne {
    private static final int belowNum = 1000;
    private static int sum;

    public static void main(String[] args) {
        Multiple multiple = new Multiple();
        sum = multiple.findAllMultiplesOfThreeOrFiveBelow(belowNum);
        System.out.println(sum);
    }
}

