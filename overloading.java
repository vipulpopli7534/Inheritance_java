package asg5;

public class overloading {

	void print(){
		System.out.println("print without arguments");
		
	}
	void print (int x){
		System.out.println("print with int "+x+" argument");
	}
	void print(float x){
		System.out.println("print with float "+x+" argument");
	}
	
	public static void main(String[]args){
		overloading o=new overloading();
		o.print();
		o.print(5);
		o.print(5.56f);
	}
}
