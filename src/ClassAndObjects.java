class  Person {
    int age;
    String name;
    String gender;
    public  void printPersonInfo(){
        System.out.println("Age : "+age);
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
    }
}
public class ClassAndObjects {
    public static void main(String[] args) {
        //
        Person obj = new Person();
        obj.name = "Mr kevin";
        obj.gender = "Male";
        obj.age = 12;
        obj.printPersonInfo();
    }

}
