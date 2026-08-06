public class Student {
 private int id;
 private String name;
 private int age;
 private double gpa;
 private String department;

 public Student(int id, String name, String department, int age, double gpa) {

this.id=id;
this.age=age;
this.gpa=gpa;
this.name=name;
this.department=department;

}

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getDepartment() {
  return department;
 }

 public void setDepartment(String department) {
  this.department = department;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public double getGpa() {
  return gpa;
 }

 public void setGpa(double gpa) {
  this.gpa = gpa;
 }

}




