class Boolean
{
    protected static void ram(boolean b , float f , double d )
    {
        System.out.println(b);
        System.out.println(f);
        System.out.println(d);
    }
    public static void main(String[] args)
    {
        ram( true,5.5f , 65.56d);
    }
}