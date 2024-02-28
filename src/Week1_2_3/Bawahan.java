package Week1_2_3;

public class Bawahan extends Clothes{
    String choice;
    public Bawahan(String choice){
        this.choice = choice;
    }

    @Override
    public void choiceClothes() {
        System.out.println("Saya memilih " + choice + " untuk bawahannya");
    }
}
