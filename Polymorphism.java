class Vehicle
{
    void show() 
    {
        System.out.println("I am a Vehicle");
    }

}

class Car extends Vehicle{
    void show() {
        System.out.println("I am a Car");
}
}

class Bike extends Vehicle
{
    void show() 
    {
        System.out.println("I am a Bike");
    }
}


public class Polymorphism {
	
	public static void main(String[] args) {

       
		Vehicle v1;
		v1=new Car();
		v1.show();
        v1=new Bike();
		v1.show();
       }	
}
