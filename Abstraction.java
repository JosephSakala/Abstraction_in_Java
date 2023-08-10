
abstract class animal{//this is an abstract class containing two abstract methods
    public abstract void move();
        
    
    public abstract void eat();
        
}

class dog extends animal{
    public void move(){
        System.out.println("Dogs walk and run");
    }
    public void eat(){
        System.out.println("Dogs eat bones"); 
    }
}

class fish extends animal{
    public void move(){
        System.out.println("Fish swims");
    }
    public void eat(){
        System.out.println("Fish eats larva");
    }
}



public class Abstraction {

    public static void main(String []args){

        //animal  obj = new animal(); Note: Abstract methods can never be instanciated
        animal obj1 = new dog();
        animal obj2 = new fish();


      //  obj.move();
      //  obj.move();//

        obj1.move();
        obj1.eat();

        obj2.move();
        obj2.eat();

    }
    
}
