public class DisplaySequenceABA {
    public static void main(String[] args) {
        // Program to display the sequence ABA, BCB, CDC, DED,........
        int alphabet = 65;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (alphabet + j - 1));
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) (alphabet + j - 1));
            }
            System.out.println();
        }
    }
}
