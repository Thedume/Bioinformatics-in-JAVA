// Chap03Ex07 - 역상보 서열 만들기 2

public class Chap03Ex07 {
    public static void main(String[] args) {
        String dna_seq = "ACGTAGATCGATTG";
        StringBuffer revcomp = new StringBuffer();
        int len = dna_seq.length();

        System.out.println("original : " + dna_seq);

        for(int i = 0; i < len; i++){
            if (dna_seq.charAt(i) == 'A')
                revcomp.append('T');
            else if (dna_seq.charAt(i) == 'G')
                revcomp.append('C');
            else if (dna_seq.charAt(i) == 'T')
                revcomp.append('A');
            else if (dna_seq.charAt(i) == 'C')
                revcomp.append('G');
        }
        
        revcomp = revcomp.reverse();
        System.out.println("rev-comp : " + revcomp);
    }
}
