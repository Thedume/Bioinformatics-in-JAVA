package Chap03;
// Ex. Chap03Ex03 - DNA 서열의 길이 비교

public class Chap03Ex03 {
    public static void main(String[] args) {
        String dna_seq1 = "acgtacgt";
        String dna_seq2 = "acgtagtacgt";

        if(dna_seq1.length() > dna_seq2.length())
            System.out.println(dna_seq1);
        else if(dna_seq1.length() < dna_seq2.length())
            System.out.println(dna_seq2);
        else
            System.out.println("same");
    }
}