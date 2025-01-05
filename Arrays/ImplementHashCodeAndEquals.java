

import java.util.Objects;
public class ImplementHashCodeAndEquals{
	
	public static void main(String [] args){
		Student student1=new Student(1,"Alice");
		Student student2=new Student(2,"Bob");
		Student student3=new Student(1,"Alice");
		
		System.out.println("student1.equals(student2) :"+student1.equals(student2));
		System.out.println("student1.equals(student3) :"+student1.equals(student3));
		
		System.out.println("HashCode of student1:"+ student1.hashCode());
		System.out.println("HashCode of student2:"+ student2.hashCode());
		System.out.println("HashCode of student3:"+ student3.hashCode());
		
		
	}
	
	public static  class Student{
		private int id;
		private String name;
		
		
		public Student(int id,String name){
			this.id=id;
			this.name=name;
		}
		
		@Override
		public int hashCode(){
			return Objects.hash(id,name);
		}
		
		@Override
		public boolean equals(Object obj){
			if(this==obj){
				return true;
			}
			if(obj==null ||  getClass()!=obj.getClass()){
				return false;
			}
			Student student=(Student)obj;
			return this.id==student.id && Objects.equals(this.name,student.name);
		}
	
	}


}