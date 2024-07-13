public class Main {

    public static void main(String args[]){
        ArraysExample obj=new ArraysExample();
        obj.demoArrays();

    }
    
}


class ArraysExample{
    void demoArrays(){
        int [] ages=new int [3];
        // float weigth[]=new float[2];
        // String names[]=new String {"Tausif","Ahmad","Raj"};

        ages[0]=20;
        ages[1]=30;
        ages[2]=40;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

    }
}