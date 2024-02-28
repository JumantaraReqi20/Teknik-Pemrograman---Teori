package Week1_2_3;

public class Luar extends Clothes{
    String choice;
    public Luar(String choice){
        this.choice = choice;
    }

    @Override
    public void choiceClothes() {
        System.out.println("Saya memilih " + choice + " untuk outernya");
    }
}
