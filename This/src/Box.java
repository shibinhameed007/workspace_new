
public class Box {
	 private String name;
	 public Box ()
	 {
	  this("BMW");    //oveloaded constructor is called.
	 }
	 public Box (String n)
	 {
	  this.name=n;
	  System.out.println(n);//member is initialized using this.
	 }
}
