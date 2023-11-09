import java.util.concurrent.atomic.AtomicInteger; 

public class MyAtomicInteger {
    public static void main(String[] arguments) {
	AtomicInteger atomicInteger = new AtomicInteger();

	System.out.println(atomicInteger.getAndAdd(10));	
	System.out.println(atomicInteger.addAndGet(10));
    }
}
