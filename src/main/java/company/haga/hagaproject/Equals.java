public class Equals {

	int integer2;

	public static void main(String[] arguments) {

		int integer = 11;

		MyInteger myInteger = new MyInteger();

		myInteger.integer = 22;

		IntegerWithParameter integerWithParameter = new IntegerWithParameter(33);

		integerWithParameter.integer = 44;

		System.out.println(myInteger);
		System.out.println(myInteger.integer);
		System.out.println(integerWithParameter);
		System.out.println(integerWithParameter.integer);

	}

}


public class MyInteger {

	public int integer;

}


public class IntegerWithParameter {

	public int integer;

	public IntegerWithParameter(int integer) {

		this.integer = integer;
		
	}
	
}


public class IntegerWithSetter {



}
