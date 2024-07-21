public class Armstrong {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ,");
            }
        }
    }

    private static boolean isArmstrong(int n) {
        int cpy = n;
        int count = 0;
        while (cpy > 0) {
            cpy = cpy / 10;
            count++;
        }
        cpy = n;

        int sum = 0;
        while (cpy > 0) {
            sum += Math.pow(cpy % 10, count);
            cpy = cpy / 10;
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }
}
