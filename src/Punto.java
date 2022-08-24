public class Punto {

    //Constants
    public static final int VALOR_DEF_X = 0;
    public static final int VALOR_DEF_Y = 0;

    //Attributes
    public int X;
    public int Y;

    //Constructors
    Punto(int coordX, int coordY){

        X = coordX;
        Y = coordY;
    }

    Punto(){

        this(VALOR_DEF_X,VALOR_DEF_Y);
    }

    //Getters & Setters

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    //Methods

    public void dezplazar(int distX, int distY){
        X = getX() + distX ;
        Y = getY() + distY ;
    }

    public double getDistEuc(int coordX,int coordY){

        return Math.sqrt(Math.pow((X - coordX),2) + Math.pow((Y - coordY),2));
    }

    //Main
    public static void main (String [] args) {

        Punto ejPunto = new Punto(1,2);
        Punto ejPunto2 = new Punto(3,4);
        double distancia = ejPunto.getDistEuc(ejPunto2.getX(),ejPunto2.getY());
        System.out.println(distancia);
    }
}
