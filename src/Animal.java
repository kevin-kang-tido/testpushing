public class Animal {
    private  int id ;
    private  String name;
    private int age;

    public  void Store(String name,int age , int id){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public  void run(){
        System.out.println("This is run Method : ");
        System.out.println("Animal name : "+name);
        System.out.println("Animal age : "+age);
        System.out.println("Animal Id : "+id);

    }

    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.name = "koko";
        obj.id = 11;
        obj.age = 111;
        obj.run();

    }



}
