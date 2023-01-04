import java.util.Arrays;
/**
 * Write a description of class TemperatureTable here.
 *
 * @author Umasathvik Pantham
 * @version 04/19/2021
 */
public class TemperatureTable
{
    private int[][] tempTable;
    
    /**
     * Constructs a 2d array for temperatures in SJ and South Pole
     * 
     * @param sjTemps the array that contains SJ temps
     */
    public TemperatureTable(int[][] sjTemps)
    {
        tempTable = sjTemps;
    }

    /**
     * Finds the average of a specific column
     *
     * @param colIndex the index of the column
     */
    public double columnAverage(int colIndex)
    {
        int rows = tempTable.length;
        double sum = 0;
        for (int row = 0; row < rows; row ++)
            sum += tempTable[row][colIndex];
        return sum / rows;
    }
    
    /**
     * Finds the value of the max value in a row
     *
     * @param rowIndex the index of the row
     * @return max the max value of the row
     */
    public int rowMax(int rowIndex) 
    {
        int cols = tempTable[0].length;
        int max = Integer.MIN_VALUE;
        for (int col = 0; col < cols; col ++)
        {
            if (max < tempTable[rowIndex][col])
                max = tempTable[rowIndex][col];
        }    
        return max;
    }
    
    /**
     * Finds the value in the maxrow and mincolumn
     *
     * @param limit the limit of the array
     * @return limit the limit of the array
     */
    public int largerValueInMaxRowMinColumn(int limit) 
    {
        return limit;
    }
}
