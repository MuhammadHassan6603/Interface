interface Myinf
{
    void name(String a);
    void age(int b);
}
class Myclass implements Myinf
{
    public void name(String a)
    {
        String n=a;
        System.out.println("Name is = " +n);
    }
    public void age(int b)
    {
        int a=b;
        System.out.println("Age is = " +a);
    }
    public static void main(String args[])
    {
        Myclass mc=new Myclass();
        mc.name("Hasaan");
        mc.age(19);
    }
}