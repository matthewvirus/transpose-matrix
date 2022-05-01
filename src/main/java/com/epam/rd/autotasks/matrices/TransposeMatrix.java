package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
        //Put your code here

        int rows = 0, columns = 0;
        for (int i = 0; i < matrix.length; i++) {
            rows = matrix.length;
            for (int j = 0; j < matrix[0].length; j++) {
                columns = matrix[0].length;
            }
        }
        if (rows == columns) {
            for (int i = 0; i < rows; i++) {
                for (int j = i + 1; j < columns; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        } else {
            int[][] newMatrix = new int[columns][rows];
            for (int i = 0; i < columns; i++) {
                for (int j = 0; j < rows; j++) {
                    newMatrix[i][j] = matrix[j][i];
                }
            }
            return newMatrix;
        }
        return matrix;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        /*int[][] matrix = {
                {1, 2},
                {7, -13} };*/
        int[][] matrix = {
                {44744618, 23787125, 83266047, 94154030, 89215225, 38740067, 62305097, 21244690, 4999802, 58779630, 93095389, 23155041},
                {95239441, 69026292, 70704155, 8517654, 10316923, 53553951, 91268015, 81378405, 13147073, 2931348, 99090883, 51455937},
                {73403432, 96941550, 53081810, 15702538, 99806153, 87143651, 18152614, 57539182, 45559076, 92234466, 11151784, 43596965},
                {33501974, 34848462, 84357123, 53724674, 21484652, 72280988, 16207778, 57503004, 79720209, 7223820, 45720172, 88457858},
                {53572955, 37697173, 81481014, 90674245, 70193820, 70627210, 10123993, 56385774, 6159287, 90978294, 70112531, 60430141},
                {88694278, 58387509, 9723035, 25230763, 39995722, 59289542, 33591796, 97253628, 35365522, 27324351, 49329708, 65269313},
                {73645177, 85300798, 27805935, 21255016, 32308076, 53489120, 66704102, 28705333, 25675737, 11630863, 52248178, 66898467},
                {12884071, 2017673, 75069558, 79786566, 954553, 53194038, 65034665, 54799287, 47617130, 80709006, 85516092, 150727},
                {61586660, 12867982, 82789431, 78040324, 10480017, 80305951, 37835617, 6119478, 4507315, 41020351, 48100912, 26302956},
                {19230110, 76039958, 57782197, 56145043, 88858389, 69185040, 2893469, 62411417, 61276555, 67159506, 93147443, 22566329},
                {5336298, 47675751, 6858938, 64137571, 97045617, 7122609, 87231715, 47243086, 22304992, 13278954, 43464931, 79011274},
                {3461194, 4459927, 2089074, 34870921, 28319457, 17043142, 82699662, 13451268, 10660219, 69792934, 449042, 9333230}};


        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
