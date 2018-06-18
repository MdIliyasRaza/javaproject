class Call
{
public void swapp(int a,int b)
{
int yemp;
temp=a;
a=b;
b=temp;
}
public static void  main(String[] args)
{
int x=5;y=15;
Call t=new call();
t.swap(x,y);
System.out.print(x+""y);
}
}