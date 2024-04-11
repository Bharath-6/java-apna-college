package PracticeLowLevelDesign;

interface TrafficSignalState {
    void displayState();

}
//Implement concrete states
class RedState implements TrafficSignalState{
    public void displayState(){
        System.out.println("Traffic signal is RED. STOP!" );
    }

}
class YellowState implements TrafficSignalState{
    public void displayState(){
        System.out.println("Traffic signal is Yellow. Be Ready!" );
    }

}
class GreenState implements TrafficSignalState{
    public void displayState(){
        System.out.println("Traffic signal is Green. You Can Move!" );
    }

}
//define the context class that maintains the current state
class TrafficSignal{
    private TrafficSignalState state;

    public TrafficSignal(){
        this.state = new RedState();
    }
    public void setState(TrafficSignalState state){
        this.state = state;
    }
    public void displayCurrentState(){
        state.displayState();
    }
}
public class TrafficMain {
    public static void main(String[] args) {
        TrafficSignal signal = new TrafficSignal();
        signal.displayCurrentState();;
    }
}
