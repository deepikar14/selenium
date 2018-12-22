package sample;

public class Main1 {
public static void main(String[] args) {
	//upcasting
	employee e=(employee)new tester();
	System.out.println(e.name);
	employee e1=(employee)new developer();
	System.out.println(e1.name);
	//downcasting
	tester t=(tester)e;
	developer d=(developer)e1;
	System.out.println(t.name);
	System.out.println(t.dept1);
	System.out.println(d.name);
	System.out.println(d.dept2);
}
}
