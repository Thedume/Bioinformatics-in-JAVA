package Chap03;
// Ex. Chap03Ex04 - 반복문, while-loop

public class Chap03Ex04 {
    public static void main(String[] args) {
        int i = 0;
        String dna_seq = "acgtacgt";
        System.out.println("length: " + dna_seq.length());
        System.out.println("i - dna");
        System.out.println("-------");
        while(i < dna_seq.length()){
            System.out.println(i + " : " + dna_seq.charAt(i));
            i++;
        }
        System.out.println(i);
    }
}
