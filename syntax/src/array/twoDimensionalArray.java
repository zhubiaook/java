package array;

public class twoDimensionalArray {
    public static void main(String[] args) {
        // Declare Array
        int[][] scores;

        // Create Array
        scores = new int[2][3];

        // Array assignment
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = i + j;
            }
        }

        // Loop for through each element in an two dimensional Array
        for (int[] k : scores ) {
            for (int v : k) {
                System.out.println(v);
            }
        }

        // Array initializer
        String[][] habbies = {{"basketball", "football"}, {"game", "TV"}};
    }
}
