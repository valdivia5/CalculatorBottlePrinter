public class Bottle {
    private int volume;

    public Bottle(){
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

    public int drink() {
        return this.volume -= 10;
    }

    public int empty() {
        this.volume = 0;
        return this.volume;
    }

    public int full() {
        this.volume = 100;
        return this.volume;
    }
}
