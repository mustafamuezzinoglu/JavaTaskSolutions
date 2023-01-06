package day33;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public int id;
    public char grade;
    public Long batchNumber;
    public int groupNumber;

    public static String schoolName,programmingLanguage;

    public CydeoStudent(String name, int age, char gender, int id, char grade, Long batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }

    public void study(String lesson){
        System.out.println(name+ "is studying "+ lesson);

    }
    public void attendClass(String lecture){
        System.out.println(name + "is attending "+lecture);
    }

    public void printSchoolName(){
        System.out.println("School name is "+ schoolName);
    }

    public void printProgLanguage(){
        System.out.println("Programming language is "+ programmingLanguage);
    }
}
/*
1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */