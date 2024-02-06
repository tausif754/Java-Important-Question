public class MethodExample {
    static void introduce(int age,String name,String[] hobbies){
        System.out.println("My name is "+name);
        System.out.println("I am "+age+"years old");
        System.out.println("My hobbies are ");
        for(String hobby:hobbies){
           System.out.println ("-"+hobby);
        }
    }
    public static void main(String[] args) {
        String name="Tausif Ahmad";
        int age =22;
        String []arr={"Wathcing YouTub","Playing Cricket","Reading books"};
        introduce(age,name,arr);
        // MethodExample obj=new MethodExample();
        // obj.introduce();
    }
    
}
