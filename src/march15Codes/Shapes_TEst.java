package march15Codes;

public class Shapes_TEst {
    public static void main(String[] args) {
        Shapes myShapes= new Shapes();
        System.out.println("my Symbol:"+" "+myShapes.Symbol+" "+"my width:"+" " +myShapes.width+"My height:"+" "+myShapes.height);
        Shapes s3= new Shapes('@',20, 30,false);
        s3.printRectangle();
        s3.printPyramid();
        myShapes.printPyramid();
        System.out.println();
     myShapes.printRectangle();
     s3.printPyramid();
     s3.printPyramid(false);
    }
}
