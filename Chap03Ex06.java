// Chap03Ex06 - 역상보 서열 만들기 1

public class Chap03Ex06 {
    public static void main(String[] args) {
        String dna_seq = "ACGTAGATCGATTG";
        String revcomp = "";
        int len = dna_seq.length();
        System.out.println("original : " + dna_seq);

        for(int i = 0; i < len; i++){
            if (dna_seq.charAt(i) == 'A')
                revcomp = 'T' + revcomp;
            else if (dna_seq.charAt(i) == 'G')
                revcomp = 'C' + revcomp;
            else if (dna_seq.charAt(i) == 'T')
                revcomp = 'A' + revcomp;
            else if (dna_seq.charAt(i) == 'C')
                revcomp = 'G' + revcomp;
        }

        System.out.println("rev-comp : " + revcomp);
    }
}
