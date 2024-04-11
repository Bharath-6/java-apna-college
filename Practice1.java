class Animal{
    String sound;
    public Animal(String sound){
        this.sound = sound;
    }
    public void show(){
        System.out.println(sound);
    }
}
// class dog extends Animal{
//     public dog(String sound){
//         super(sound);
//     }
//     public void show(){
//         System.out.println("Barks");
//     }

// }
public class Practice1 {
    public static void main(String[] args) {
        Animal d = new Animal("Sounds");
        d.show();

    }
}
