 abstract class Abstraction
{
    abstract void area();

    void nonabs()
    {
        System.out.println("THIS IS A NON ABS METHOD");
    }

}

class Sq extends Abstraction{
    void area(){
        int side=5;
        int sqarea=side*side;


        System.out.println("Area of a sq is:" +sqarea);
    }

}

class Rect extends Abstraction{
    void area(){
        int l=2,b=6;
        int rectarea=l*b;
        
        System.out.println("Area of a rect is:" +rectarea);
    }

}

class Tri extends Abstraction{
    void area(){
        int h=5,b=6;
        float triarea=0.5f*b*h;
        
        System.out.println("Area of a tri is:" +triarea);
    }

}
class Circ extends Abstraction{
    void area(){
        int r=6;
        double circarea=3.14*r*r;
        
        System.out.println("Area of a circ is:" +circarea);
    }

}

public class Main{
    public static void main(String[] args)
    {
        Abstraction s=new Sq();
        s.area();
        s.nonabs();

        Rect r=new Rect();
        r.area();
        r.nonabs();

        Tri t=new Tri();
        t.area();
        t.nonabs();

        Circ c=new Circ();
        c.area();
        c.nonabs();

    }
}




