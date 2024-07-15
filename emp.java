public class emp 
{
    int id;
    String name;
    long salary;

    public void getdata()
    {
      id=106;
      name="tsunade";
      salary=106106;
    }
    public void display()
    {
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("salary="+salary);
    }
    public static void main(String args[])
    {
        emp e1=new emp();
        e1.getdata();
        e1.display();

    }
}
