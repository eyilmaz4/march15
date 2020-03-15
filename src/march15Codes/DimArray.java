package march15Codes;

public class DimArray {
    int size;

    public DimArray(){
      this.size=5;
         }
    public int [] returnArray(){
        int [] arr= new int [this.size];
        int i=2;
        for(int j=0; j<this.size; j++){
           arr[j]=i;
           i+=2;
        }
        return arr;
    }
         public void printOddIndexes(int [] arr){
        for(int i=0; i<arr.length; i++){
            if(i %2!=0){
                System.out.print("i:"+i);
            }
        }
    }
    public void printEvenIndexes(int [] arr){
                for(int i=0; i<arr.length; i++){
            if(i %2==0){
                System.out.println(arr[i]);
            }
        }
    }
    public void maxNumber(){

    }
}
