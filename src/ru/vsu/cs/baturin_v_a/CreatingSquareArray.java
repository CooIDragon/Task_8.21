package ru.vsu.cs.baturin_v_a;

public class CreatingSquareArray {

    public int[][] createSquareArray(int[][] array) {
        if (array.length == array[0].length) {
            return array;
        } else {
            int numOfRowsAndColumns = Math.min(array.length, array[0].length) ;
            int[][] newArray = new int[numOfRowsAndColumns][numOfRowsAndColumns];

            for(int r = 0; r < numOfRowsAndColumns; r++) {
                for(int c = 0; c < numOfRowsAndColumns; c++) {
                    newArray[r][c] = array[r][c];
                }
            }
            return newArray;
        }
    }
}
