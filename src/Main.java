//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Лапицкий Д.В", 2022, "ул.Вяземская", "+79053677326", 2, "Программирование"),
                new Student("Уханов А.А", 2023, "ул.Проспект Строителей", "+7922877326", 2, "Программирование"),
                new Student("Дугин И.А", 2022, "ул.Проспект Победы", "+79048507420", 2, "Администрирование")
        };
        System.out.println("Список студентов");
        for ( Student student : students){
            System.out.println(student.getFullName());
        }
        System.out.println("Студенты с факультета \"Администрирование:\" ");
        for ( Student student : students){
            if ( student.getFacultet() == "Администрирование") {
                System.out.println(student.getFullName());
            }
        }
        System.out.println("Студенты, поступившие после 2022 года");
        for (int i = 0; i < students.length; i++){
            if ( students[i].getYearOfInvite() > 2022) {
                System.out.println(students[i].getFullName());
            }
        }
    }
}
class Student {
    private String FullName;
    private int YearOfInvite;
    private String Address;
    private String Number;
    private int Course;
    private String Facultet;

    Student(String FullName, int YearOfInvite, String address, String Number, int course, String Facultet){
        this.FullName = FullName;
        this.YearOfInvite = YearOfInvite;
        this.Address = address;
        this.Number = Number;
        this.Course = course;
        this.Facultet = Facultet;
    }

    public String getFullName(){
        return this.FullName;
    }
    public void setFullName(String FullName){
        this.FullName = FullName;
    }

    public int getYearOfInvite(){
        return this.YearOfInvite;
    }
    public void setYearOfInvite(int yearOfInvite){
        this.YearOfInvite = yearOfInvite;
    }

    public String getAddress(){
        return this.Address;
    }

    public String getNumber(){
        return this.Number;
    }
    public void setNumber(String number){
        this.Number = number;
    }

    public void setCourse(int course){
        this.Course = course;
    }

    public String getFacultet(){
        return this.Facultet;
    }
}

