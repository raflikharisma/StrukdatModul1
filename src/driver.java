import java.util.ArrayList;

public class driver {
    public static void main(String[] args) {
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> lunch = new Konsumsi<>();

        Makanan lalapan = new Makanan();
        lalapan.setNamaHidangan("Ayam Kalasan");
        Minuman boba = new Minuman();
        boba.setNamaHidangan("Thai tea");
        breakfast.setKonsumsi(lalapan, boba);
        listKonsumsi.add(breakfast);


        Makanan nasi = new Makanan();
        nasi.setNamaHidangan("nasi kuning");
        Minuman teh = new Minuman();
        teh.setNamaHidangan("Teh anget");
        lunch.setKonsumsi(nasi, teh);
        listKonsumsi.add(lunch);

        System.out.println("Menu Konsumsi : ");
        for (Konsumsi <Makanan, Minuman> konsumsi:listKonsumsi){
            Makanan makanan = konsumsi.getMakan();
            Minuman minuman = konsumsi.getInum();

            System.out.println(makanan.disantap());
            System.out.println(minuman.disantap());
        }


    }
}
