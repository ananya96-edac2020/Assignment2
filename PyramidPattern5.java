package ASSIGNMENT2;

public class PyramidPattern5
{
    public static void main(String[] args)
    {
        for(int rows = 9 ; rows >= 1 ; rows--)
        {
            for(int collum = 1 ; collum <= rows *2 ; collum++)
            {
                System.out.print(" ");
            }
            for(int rp = rows ; rp <= 9; rp++) {
                System.out.print(rp + " ");
            }
            for(int lp = 9 -1 ; lp >= rows ; lp--) {
                System.out.print(lp + " ");
            }
            System.out.println();
        }
        }
        }

