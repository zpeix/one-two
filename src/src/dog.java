package src;
public class dog {
	 String name;
	 int age;
	 String kind;
	 public dog(){
		 System.out.println("���ǹ�");
	 }
	 public dog(String name){
		 this.name=name;
		 System.out.println("����һֻ��");
	 }
	 public dog(String name,int age){
		 this.name=name;
		 this.age=age;
		 System.out.println("����һֻ����");
	 }
	 public dog(String name,int age,String kind){
		 this.name=name;
		 this.age=age;
		 this.kind=kind;
		 System.out.println("����һֻ�ÿ��ĵ���");
	 }
	public void show(){
		System.out.println(this.name+" "+this.age+" "+this.kind);
	}
	
	
	
}
