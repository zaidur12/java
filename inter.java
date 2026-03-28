interface Animal {
    void makesound();
    void eat();
}

class Dog implements Animal {
    public void makesound() {
        System.out.println("bark");
    }

    public void eat() {
        System.out.println("meat");
    }
}

public class inter {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.makesound();
        obj.eat();
    }
}
