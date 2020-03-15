package march15Codes;

public class Shapes {
    char Symbol;
    int width;
    int height;
    boolean space;

    public Shapes(){
        this.Symbol='*';
        this.width=4;
        this.height=5;
        this.space=true;


    }
    public Shapes(char symbol, int width, int height, boolean space){
        this.Symbol=symbol;
        this.width=width;
        this.height=height;
    }
    public void printPyramid(){
        for(int i=0; i<this.height; i++){
            for(int j=0; j<i; j++){
                System.out.print(this.Symbol+" ");
            }
            System.out.println();
            }
        }

public void printPyramid(boolean space){
    for(int i=0; i<this.height; i++) {
        for (int j = 0; j < i; j++) {
            if(space) {
                System.out.print(this.Symbol);
            }
            else {
                System.out.print("-"+this.Symbol);
                }
        }
    }
}
public void printRectangle(){
        for(int i=0; i<this.height; i++){
            for(int j=0; j<width; j++){
                System.out.print(this.Symbol);
            }
            System.out.println();
        }
}
}
