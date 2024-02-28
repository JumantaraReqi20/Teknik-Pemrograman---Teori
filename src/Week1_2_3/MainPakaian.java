package Week1_2_3;

public class MainPakaian {
    public static void main(String[] args) {

        Berkerah lenganPanjang = new Berkerah("kaos berkerah lengan panjang");
        //Week1_2_3.Berkerah lenganPendek = new Week1_2_3.Berkerah("kaos berkerah lengan panjang");

        //Week1_2_3.Kemeja kemejaLenganPanjang = new Week1_2_3.Kemeja("kemeja dengan lengan panjang");
        Kemeja kemejaLenganPendek = new Kemeja("kemeja dengan lengan pendek");

        //Week1_2_3.Jeans panjang = new Week1_2_3.Jeans("jeans panjang");
        Jeans pendek = new Jeans("jeans pendek");

        //Week1_2_3.BahanBiasa bahanPanjang = new Week1_2_3.BahanBiasa("celana bahan yang panjang");
        BahanBiasa bahanPendek = new BahanBiasa("celana bahan yang pendek");

        Rok rokPanjang = new Rok("rok yang panjang");
        //Week1_2_3.Rok rokPendek = new Week1_2_3.Rok("rok yang pendek");

        Luar mantel = new Luar("mantel");
        //Week1_2_3.Luar jaket = new Week1_2_3.Luar("jaket");


        lenganPanjang.choiceClothes();

        kemejaLenganPendek.choiceClothes();

        bahanPendek.choiceClothes();

        rokPanjang.choiceClothes();

        mantel.choiceClothes();
    }
}