class Pattern
{
    public static void main(String []args)
    {
        int i=0,j=0;
        for(i=0;i<5;i++)
        {
            for(j=5-i;j>0;j--)
            System.out.print(" ");
            for(j=0;j<i+1;j++)
            System.out.print("* ");
            System.out.println();
        }
    }
}