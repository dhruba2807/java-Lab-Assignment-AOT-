public class DisplaySequenceA1 {
    public static void main(String[] args) {
        // Program to display the sequence A1, B2, C3, ...., ...Y25,Z26, A1, B2,...............
        char ch = 'A';
        int num = 1;
        for (int i = 1; i <= 26; i++) {
            if (ch > 'Z') {
                ch = 'A';
            }
            System.out.println(ch + "" + num);
            num++;
            ch++;
        }
    }
}
