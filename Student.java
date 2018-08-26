package CH02;

public class Student implements Person {

    String id; // ID is specify to denote a person unique id
    String name; // use to name identify
    int age;
    public Student(String i, String n, int a){
        id = i; //
        name = n;
        age = a;

    }

    protected int studyHours(){ return  age/2;}
    public String getID(){ return id;}
    public String getName(){ return name;}
    public int getAge(){ return age;}
    public boolean equalTo(Person other ){
        Student otherStudent = (Student)other;
        return (id.equals(otherStudent.getID()));
    }

    public String toString(){
        return "Student( ID: " + id + ", Name : " + name + ", Age: " + age + ")";
    }
}
