class Emp{

int Salary = 60000;
String name = "Aniket";
int id = 12;

public void emp1(){

System.out.println("---This is first method---");

int Salary = 25000;
String name="Prakash";
int id = 13;
System.out.println(Salary);
System.out.println(id);
System.out.println(name);

}

public void emp2(){
System.out.println("----This is second method---");
Emp e = new Emp();
System.out.println(e.Salary);
System.out.println(e.name);
System.out.println(e.id);


} 


public static void main(String[] args){

System.out.println("-----this is main method------");
Emp e1 = new Emp();
System.out.println(e1.Salary);
System.out.println(e1.name);
System.out.println(e1.id);
e1.emp1();
e1.emp2();






}





}