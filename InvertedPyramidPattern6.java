package ASSIGNMENT2;

public class InvertedPyramidPattern1
{
    public static void main(String[] args)
    {
        for(int i = 9 ; i >= 1 ; i--)
        {
            for(int j = 1 ; j <= 9 - i ; j++)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
