package src;
public class dog {
	 String name;
	 int age;
	 String kind;
	 public dog(){
		 System.out.println("我是狗");
	 }
	 public dog(String name){
		 this.name=name;
		 System.out.println("我是一只狗");
	 }
	 public dog(String name,int age){
		 this.name=name;
		 this.age=age;
		 System.out.println("我是一只单身狗");
	 }
	 public dog(String name,int age,String kind){
		 this.name=name;
		 this.age=age;
		 this.kind=kind;
		 System.out.println("我是一只好看的单身狗");
	 }
	public void show(){
		System.out.println(this.name+" "+this.age+" "+this.kind);
	}
	
	
	
}
