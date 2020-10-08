package ASSIGNMENT2;

public class PyramidPattern4
{
    public static void main(String[] args)
    {
       for(int i = 1 ; i <= 9 ;i++)
       {
          for(int j = 9; j <=15 ; j++)
          {
                if(j >= 3 && j <= 9)
                {
                    System.out.print(j);
                }
          }
           System.out.println();
       }
    }
}
