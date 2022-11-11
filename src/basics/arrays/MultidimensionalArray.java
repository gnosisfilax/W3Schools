package basics.arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
//To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array.
        int x = myNumbers[1][2];
        System.out.println(x);
        System.out.println("\n");
        for ( int i = 0; i < myNumbers.length; i++){
            for(int j = 0; j < myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
