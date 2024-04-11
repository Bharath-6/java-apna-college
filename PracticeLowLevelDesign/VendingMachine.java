package PracticeLowLevelDesign;

interface VendingMach {
    void displayState();
}

class IdleState implements VendingMach {
    public void displayState() {
        System.out.println("Current the state is Idle");
    }
}

class selectState implements VendingMach {
    public void displayState() {
        System.out.println("Current the state is selectState");
    }
}

class DispenseState implements VendingMach {
    public void displayState() {
        System.out.println("Current the state is DispenseState");
    }
}

class Decidingstate {
    private VendingMach state;

    public Decidingstate() {
        this.state = new IdleState();
    }

    public void setState(VendingMach state){
        this.state = state;
    }
    public void displayCurrentState(){
        state.displayState();
    }
}

public class VendingMachine {
    public static void main(String[] args) {
        Decidingstate d = new Decidingstate();
        d.setState(new selectState());
        d.displayCurrentState();

    }
}
