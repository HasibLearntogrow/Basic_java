package finalexam;


public class lambdaExpression {
//	public class inter implements myinter{
//		public void sayHello() {
//			System.out.println("I am saying hello from inter");
//		}
//	}
	@FunctionalInterface
	public interface myinter{
		public abstract void sayHello();
	}
	public interface suminter{
		public abstract int sum(int a,int b);
		
	}
	public interface length{
		int getlength(String str);
	}
	public static void main(String[] args){
		System.out.println("My system starts........");
	
		myinter i1=()->System.out.println("This is 1st lambda expression");
		//i1.sayHello();
		myinter i2=()->System.out.println("This is 2nd lambda expression");
		i2.sayHello();
		suminter sumInter = ( a, b)-> a+b;
		
	System.out.println(sumInter.sum(10, 12));
	length Length = str->str.length();
    System.out.println(Length.getlength("Anik"));		
	}

}
