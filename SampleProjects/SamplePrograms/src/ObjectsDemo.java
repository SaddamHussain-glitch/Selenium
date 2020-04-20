
public class ObjectsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");

		ObjectsDemo b=new ObjectsDemo();
		b.test();
		int d=b.test1();
		System.out.println(d);
		String s=b.test2();
		System.out.println(s);
		int a=b.test3(10, 10);
		System.out.println(a);

	}
	
	public void test()
	{
		System.out.println("test method");
	}
	public int test1()
	{
		System.out.println("test1 method");
		int a =10, b=20;
		int c=a+b;
		return c;
	}
	public String test2()
	{
		System.out.println("test2 method");
		String s1="Hello ", s2=" World ! ";
		return s1+s2;
	}
	public int test3(int a, int b)
	{
		System.out.println("test3 method");
		return a*b;
	}

}
