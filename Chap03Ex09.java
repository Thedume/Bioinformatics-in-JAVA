// Chap03Ex09 - 실행 중에 대화식 방법으로 서열 입력받기

public class Chap03Ex09 {
    public static void main(String[] args) {
        String dna_seq;
        byte[] b = new byte[10000];
        try{
            System.out.print("Input sequence : ");
            int len = System.in.read(b);
            dna_seq = new String(b);
            dna_seq = dna_seq.trim();
            System.out.println(dna_seq);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
