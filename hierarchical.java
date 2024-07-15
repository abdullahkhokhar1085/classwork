public class hierarchical 
{
    public static void main (String args[])
    {
        addition a1=new addition();
        multiple m1=new multiple();
        a1.getdata();
        a1.sum();
        m1.getdata();
        m1.mul();


    }
    
}
class calculate
{
    int a,b;
    void getdata()
    {
        a=6;
        b=3;
    }
}
class addition extends calculate
{
    void sum()
    {
        int s;
        s=a+b;
        System.out.println("sum="+s);
    }
}

class multiple extends calculate
{
    void mul()
    {
        int m;
        m=a*b;
        System.out.println("multiplication="+m);
    }
}