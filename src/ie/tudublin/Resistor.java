package ie.tudublin;

import processing.data.TableRow;

public class Resistor 
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public String toString()
    {
        return value + "\t" + ones + "\t" + tens + "\t" + hundreds;
    }   

    public Resistor(TableRow row)
    {
        value = row.getInt(1);
        ones = row.getInt(1);
        tens  = row.getInt(1);
        hundreds = row.getInt(1);
    }
}