package march15Codes;

public class StringOperations {
    String value=" ";

    public StringOperations(String value) {
this.value=value;
    }
    public String reverse(){
String newA=" ";
        for(int i=this.value.length()-1; i>=0; i--){
    newA+=this.value.charAt(i);
}
        return newA;
    }
    public String firstCapital(){
        String newVal=" ";
        String firstLetter=" ";

        newVal+=this.value.charAt(0);
        newVal+=newVal.toUpperCase();
       String letter=" ";
        for(int i=1; i<this.value.length(); i++){
            if(this.value.charAt(i-1)==' '){
                letter+=this.value.charAt(i);
                letter+=letter.toUpperCase();
                newVal+=letter;
            }
            else {
                newVal=" ";
                newVal+=this.value.charAt(i);
            }
        }
      return newVal;
    }
    public String returnStringArray(String value){
       String [] newArr=new String [value.length()];
       for(int i=0; i< value.length(); i++){
           newArr[i]+=value.charAt(i);
                 }
       for(String letter:newArr){
           System.out.print(letter);
                  }
       return value;
    }
}