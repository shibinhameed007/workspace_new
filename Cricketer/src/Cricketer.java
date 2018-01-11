
public class Cricketer {
	String name;
	String team;
	int age;
	 Cricketer(){
		name="";
		team="";
		age=0;
		
	}
	 Cricketer(String n, String o, int p){
		 name=n;
		 team=o;
		 age=p;
		 System.out.println ("this is " + name + " of "+team);
	 }
	 Cricketer(Cricketer ckt){
		 name=ckt.name;
		 team=ckt.team;
		 age=ckt.age;
		 System.out.println ("this is " + name + " of "+team);
	 }

	 public String toString() 
	 {
	  return "this is " + name + " of "+team;
	 }
}
