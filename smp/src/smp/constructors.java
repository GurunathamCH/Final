package smp;


class Conn
{int a;
	///constructor is a special kind of method which contains the same name as class.
	//used to our own values instead of default values
//return type no need

//defalut.parameterized(single parameter,multiple parameter,copy constructor)
public void add()//normal method

{
	
System.out.println(a);
}
public Conn()//default constructor
{
	
	System.out.println(a);
}
String name,address,rolnumber,classname,section,Percent,Grade;
public Conn(String name,String address,int rolnumber,int classname,String section,double Percent,String Grade)
{
	
System.out.println(name+" "+address+" "+rolnumber+" "+classname+" "+section+" "+Percent+" "+Grade);
}
//Copy Constructor
public Conn(Conn aa)
{//System.out.println(C.name);
	this.name=aa.name;
	String name1=aa.name;
	System.out.println("name"+name1);
	
//class var    object ref
	this.address=aa.address;
	this.rolnumber=aa.rolnumber;
	this.classname=aa.classname;
	this.section=aa.section;
	this.Percent=aa.Percent;
	this.Grade=aa.Grade;

}

public Conn(int a)//single parameterized constructor
{System.out.println("int parameter");
	System.out.println(this.a);
	System.out.println(a);

}

public Conn(float b)//single parameterized constructor
{
	
System.out.println("float parameter");
	
	System.out.println(b);
}

public  Conn(int a,int b)//multiple parameterized constructor
{
	System.out.println("two int parameter constructor");
	System.out.println(a+b);

}
public  Conn(int a,float b)//multiple parameterized constructor
{
	System.out.println("two int parameter constructor");
	System.out.println(a+b);

}
}

public class constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Conn c=new Conn();
//Conn c1=new Conn(3);
//Conn c2=new Conn(3.788f);
//Conn c4=new Conn(3,5);
//Conn c6=new Conn(3,56.8f);
Conn aa=new Conn("gowtham", "hyd", 454, 4, "A", 47.89, "A");
Conn aa1=new Conn(aa);
System.out.println("   "+aa1.address);
	}

}
