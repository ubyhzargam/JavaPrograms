import java.util.Scanner;
class RopeCutting
{
    
    private static int RC(int n,int a, int b, int c)
    {
        if(n==0)return 0;
        if(n<0)return -1;
        int res=Math.max(RC(n-a,a,b,c),Math.max(RC(n-b,a,b,c),RC(n-c,a,b,c)));
        if(res==-1)return -1;
        else
        return res+1;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,c;
        n=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println(RC(n,a,b,c));
    }
}