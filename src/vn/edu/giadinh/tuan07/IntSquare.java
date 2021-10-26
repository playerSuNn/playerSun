package vn.edu.giadinh.tuan07;

public class IntSquare {
    private int intValue;

    public IntSquare(){}

    public IntSquare(int i)
    {
        intValue = i;
    }

    private int caculateSquare()
    {
        return (int) Math.pow(intValue, 2);
    }

    public int getSquare()
    {
        return caculateSquare();
    }
    
}
