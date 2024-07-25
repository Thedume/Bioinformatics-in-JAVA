package Chap03;
// Ex. Chap03Ex05 - 반복문으로64가지의 DNA 뉴클리오타이드 생성

public class Chap03Ex05 {
    public static void main(String[] args) {
        String dna = "ACGT";
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    System.out.println(
                        i + " " + j + " " + k + " - " +
                        dna.charAt(i) + " " +
                        dna.charAt(j) + " " +
                        dna.charAt(k)
                    );

                }
            }
        }
    }
}
