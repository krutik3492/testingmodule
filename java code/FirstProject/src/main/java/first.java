
public class first {
	public static void main(String[] args) {
		System.out.println("krutik shah");
		System.out.println("sunilbhai shah");
		int i = 2;
		System.out.println(i);
	}

}

/*In Java programming, public static void main(String[] args) is a special method that serves as the entry point of a Java application. When you run a Java program, the Java Virtual Machine (JVM) looks for this method and starts executing the code inside it. Let's break down each part of this signature:

public: This is an access modifier, which means the main method can be accessed from outside the class. It allows the JVM to call this method from any other class.

static: This is a keyword that indicates the main method belongs to the class itself, not to an instance (object) of the class. This is necessary because the JVM calls the main method without creating an object of the class containing the main method.

void: This keyword indicates that the main method does not return any value. In Java, a method with a return type of void means it doesn't produce a result when executed.

main: This is the name of the method. It is the standard name recognized by the JVM as the entry point of the Java program.

(String[] args): This is the parameter list of the main method. Parameters are inputs to the method. In this case, the main method takes a single parameter, which is an array of strings called args. The args parameter allows you to pass command-line arguments to your Java program when you run it from the command line.*/