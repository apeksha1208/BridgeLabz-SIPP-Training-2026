package EncapsulationAndAbstraction;

public abstract class shape {
//    int length;
//    int width;
    public abstract double area();
    public abstract double perimeter();

}
class circle extends shape{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
    @Override
    public double area() {
        return Math.PI* radius* radius;
    }
    @Override
    public double perimeter() {
        return 2*Math.PI * radius*radius;
    }
    public double getter(){
        return radius;
    }
}
class rectangle extends shape{
    int length;
    int width;
    rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2*length*width;
    }
}
class triangle extends shape{
    int base;
    int height;
    int a;
    int b;
    int c;
    triangle(int base,int height, int a, int b, int c){
        this.base=base;
        this.height=height;
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public double area() {
        return 1/2 * base * height;
    }
    @Override
    public double perimeter() {
        return a+b+c;
    }
}
class mainshape{
    public static void main(String[] args) {
        shape [] shaped =new shape[3];
        shaped[0]=new circle (3);
        shaped[1]=new rectangle(4,5);
        shaped[2]=new triangle(2,3,1,2,3);
        for(shape s: shaped){
            System.out.println(s.area());
            System.out.println(s.perimeter());

        }
    }
}