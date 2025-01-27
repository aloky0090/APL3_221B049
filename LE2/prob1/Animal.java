abstract class Animal {
    abstract void makeVoice();
}

class Cow extends Animal {
    void makeVoice() {
        System.out.println("Moo");
    }
}