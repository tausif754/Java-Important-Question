public class ArrayExample {
    void sumOfArray(){
        int []arr={1,3,5,6};
        int sum=0;
        for(int i=0;i<4;i++){
            sum+= arr[i];
        }
        System.out.println(sum);
    }
    void maxOfArray(){
        int []arr={10,90,20,40,60,42};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println("Maximum value="+ans);
    }
    void searchElement(){
        int []arr={12,23,45,67};
        int x=20;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                break;
            }
        }
        System.out.println("found element= "+ans);

    }   
    public static void main(String[] args) {
       ArrayExample obj=new ArrayExample();
       obj.sumOfArray();
       obj.maxOfArray();
       obj.searchElement();
    }
    
}
