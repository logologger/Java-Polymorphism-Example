
public class Greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter g=new Greeter();
		HelloWorldGreeting hg=new HelloWorldGreeting();
		//Typical Implementation of Java Polymorphism 
		//Like in one of project i worked the team used this approach 
		//They created AadharScan Interface that performs some set of implementation 
		//Like scanning ,creating pidxml and other stuff
		//This Interface implementation will be different for Mantra and different for Morpho Scanner
		//Thus we are passig behaviour here everytime which keeps on changing everytime based on the device morpho and mantra
		g.greet(hg);
		
		
		//Now we will create a Lambda Expression here
		lambda_example_type function_name = ()->{
			//do something here 
			System.out.println("I am inside Lambda Expression in Java");
		};
		
	
		
	}
	public void greet(Greeting greet){
		
		greet.perform();
		
	}
	
}
 interface lambda_example_type{
	public void add();
}
