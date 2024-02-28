package Week1_2_3;

public class Atasan extends Clothes{
    String choice;
    public Atasan(String choice){
        this.choice = choice;
    }
    @Override
    public void choiceClothes() {
        System.out.println("Saya memilih " + choice + " untuk atasannya");
    }
}
