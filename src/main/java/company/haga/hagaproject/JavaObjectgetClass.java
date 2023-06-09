package company.haga.hagaproject.getclass;

public class JavaObjectgetClass {

	public static void main(String[] arguments) {

		Object object = new String("HaGa IT Solution");
		Class objectGetClass = object.getClass();

		System.out.println("Class of Object is " + objectGetClass);
		System.out.println("Class of Object is " + objectGetClass.getName());

	}
}
