public class Rectangulo {

    //Constants


    //Attributes

    public Punto izqSup;
    public Punto izqInf;
    public Punto derSup;
    public Punto derInf;
    public int altura;
    public int ancho;

    //Constructors

    Rectangulo(Punto pInic, int alt, int ancho){

        this.izqInf = pInic;
        this.izqSup = new Punto(pInic.getX(),pInic.getY()+alt);
        this.derInf = new Punto(pInic.getX()+ancho,pInic.getY());;
        this.derSup = new Punto(pInic.getX()+ancho,pInic.getY()+alt);
        this.altura = alt;
        this.ancho = ancho;

    }

    //Getters & Setters

    public Punto getIzqSup() {

        return izqSup;
    }

    public Punto getIzqInf() {

        return izqInf;
    }

    public Punto getDerSup() {

        return derSup;
    }

    public Punto getDerInf() {

        return derInf;
    }

    public int getAltura() {

        return altura;
    }

    public void setAltura(int altura) {

        this.altura = altura;
    }

    public int getAncho() {

        return this.ancho;
    }

    public void setAncho(int ancho) {

        this.ancho = ancho;
    }

    //Methods

    public int getArea(){

        return this.getAncho() * this.getAltura();
    }

    public void trasladar(int x, int y){

        this.izqSup.dezplazar(x,y);
        this.izqInf.dezplazar(x,y);
        this.derSup.dezplazar(x,y);
        this.derInf.dezplazar(x,y);
    }

    public int comparar(Rectangulo aComparar){

        if (this.getArea() > aComparar.getArea() ) {
            return 1;
        } else
            if (this.getArea() < aComparar.getArea() ){
                return -1;
            } else return 0;
    }

    public boolean esCuadrado(){

        return this.getAncho() == this.getAltura();
    }

    public int getLadoSup(){

        return Math.max(this.getAltura(),this.getAncho());
    }

    public boolean estaAcostado(){

        return this.getAncho() > this.getAltura();
    }

    public void printRectangulo(){

        System.out.println("-------Inf Izq-------");

        System.out.print(this.getIzqInf().getX() + ",");

        System.out.println(this.getIzqInf().getY());

        System.out.println("-------Sup Izq-------");

        System.out.print(this.getIzqSup().getX() + ",");

        System.out.println(this.getIzqSup().getY());

        System.out.println("-------Inf Der-------");

        System.out.print(this.getDerInf().getX() + ",");

        System.out.println(this.getDerInf().getY());

        System.out.println("-------Sup Der-------");

        System.out.print(this.getDerSup().getX() + ",");

        System.out.println(this.getDerSup().getY());

    }

    public static void main (String [] args) {

        Punto ejP = new Punto();
        Punto ejP2 = new Punto();
        Rectangulo ejRec = new Rectangulo(ejP, 2, 3);
        Rectangulo ejRec2 = new Rectangulo(ejP2, 2,3);
        ejRec.trasladar(1,1);
        //ejRec.printRectangulo();
        System.out.println(ejRec.estaAcostado());
        //System.out.println(ejRec.comparar(ejRec2));



    }


}
