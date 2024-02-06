import java.util.ArrayList;

public class ListInterfaceExample {

static void ArrayListExample(){
    ArrayList<Integer> l= new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    System.out.println(l);//[1,2,3]
    System.out.println(l.get(1));//2
    l.set(1,10);
    System.out.println(l);//[1,10,3]
    System.out.println(l.contains(10));
    System.out.println(l.contains(9));
}



    public static void main(String[] args) {
        ArrayListExample();
    }
    
}
