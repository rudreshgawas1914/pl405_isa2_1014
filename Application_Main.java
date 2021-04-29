
public class Application_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app=new Application();
		app.setNum1(10);
		app.setNum2(5);
		
		
		System.out.println("The Sum is :"+ app.ComputeSum());
		System.out.println("The diff is :"+ app.ComputeDiff());
		System.out.println("The Product is :"+ app.ComputeMul());
	}

}
