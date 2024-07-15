public class encapsulate
{

    public static void main(String []args)
    {
        employee e1=new employee();
        e1.setEid(101);
        e1.setEname("VoiDx");
        System.out.println("emp id="+e1.getEid());
        System.out.println("emp name="+e1.getEname());

    }
}
class employee
{
    private int eid;
    private String ename;

    void setEid(int id)
    {
        eid=id;
    }
    int getEid()
    {
        return eid;
    }
    void  setEname(String name)
    {
        ename=name;
    }
    String getEname()
    {
        return ename;
    }
}
