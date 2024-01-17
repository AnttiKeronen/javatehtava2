package main;
public class hedgehog {
    private String nimi;
    private int ikä;


    public hedgehog() {
        this.nimi = "Pikseli";
        this.ikä = 5;
    }

    public hedgehog(String nimi, int ikä) {
        this.nimi = nimi;
        this.ikä = ikä;
    }

    public void speak(String text) {
        if (text.isEmpty()) {
            System.out.println("Olen " + this.nimi + " ja ikäni on " + this.ikä + " vuotta,  mutta antaisitko silti syötteen?");
        } else {
            System.out.println(this.nimi + ": " + text);
        }
    }

    public void run(int rounds) {
        for (int i = 0; i< rounds; i++) {
            System.out.println(this.nimi + " juoksee kovaa vauhtia!");
        }
    }

    public String getName() {
        return this.nimi;
    }

    public int getAge() {
        return this.ikä;
    }
}
