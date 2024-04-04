public class DisplaySequenceAMM {
    public static void main(String[] args) {
        // Program to display the sequence AMM, COO, EQQ ,..........
        char ch = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (ch + i - 1));
            }
            System.out.println();
        }
    }
}
