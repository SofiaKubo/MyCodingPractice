package abstractclass;


public abstract class Pet {
    private int pawsCount;
    private String voice;

    protected Pet(int pawsCount, String voice) {
        this.pawsCount = pawsCount;
        this.voice = voice;
    }
    public void sleep() {
        System.out.println("Сплю");
    }
    public void play() {
        System.out.println("Играю");
    }
    public void giveVoice() {
        System.out.println(voice);
    }
    public int getPawsCount() {
        return pawsCount;
    }
}
