import java.util.Arrays;
/**
 * Write a description of class StockArray here.
 *
 * @author Umasathvik Pantham
 * @version 04/17/2021
 */
public class StockArray
{
    private Stock[] theArray;
    private int numOfStocks;

    /**
     * Constructs a StockArray object by creating an
     * array of Stock of the specified length and setting
     * the number of stocks in the array to zero.
     * 
     * @param length the length of theArray
     */
    public StockArray(int length)
    {
        theArray = new Stock[length];
        numOfStocks = 0;
    }

    /**
     *
     * @param stock the stock of the class Stock
     * @param index the index of the array
     */
    public void insert(Stock stock, int index)
    {
        if (numOfStocks < theArray.length && index >= 0 && index <= numOfStocks)
        {
            for (int i = numOfStocks; i > index; i --)
            {
                theArray[i] = theArray[i - 1];
            }
            theArray[index] = stock;
            numOfStocks ++;
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param index1 the index 1 of the array
     * @param index2 the index 2 of the array
     */
    public void swap(int index1, int index2)
    {
        if (index1 < 0 || index1 >= theArray.length) {
            return;   
        }
        
        if (index2 < 0 || index2 >= theArray.length) {
            return;   
        }
        
        Stock temp = theArray[index1];
        theArray[index1] = theArray[index2];
        theArray[index2] = temp;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param symbol the symbol of the stock
     * @return -1 the -1 of the number
     */
    public double quote(String symbol)
    {
        for (Stock stock : theArray)
        {
            if (stock!=null && stock.getSymbol().equals(symbol))
            {
                return stock.getPrice();
            }
        }
        return -1;
    }
    
    /**
     * 
     */
    @Override
    public String toString()
    {
        String s = "[";
    
        if (numOfStocks > 0)
        {
            s +=  "" + theArray[0].toString();
            for (int i = 1; i < numOfStocks; i ++) 
            {
                if (theArray[i]!=null)
                {
                    s += ", " + theArray[i].toString();
                }
            }
        }
        return s + "]";    
    }
}
