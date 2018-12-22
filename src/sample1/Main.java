package sample1;

public class Main {
	 public static void main(String[] args) {
		 Person p=(Person)new Student();
		 System.out.println(p.name);
		 System.out.println(p.age);
		 
		 Student s=(Student) p;
		 System.out.println(s.age);
		 System.out.println(s.name);
		 System.out.println(s.marks);
	}
		
	}
