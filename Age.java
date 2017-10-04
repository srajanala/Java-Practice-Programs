package AnonymousInnerClass;

public interface Age {
int x=21;
void getAge();
}

class MyClass implements Age{
	public void getAge(){
		System.out.println("Age is "+x);
	}
}