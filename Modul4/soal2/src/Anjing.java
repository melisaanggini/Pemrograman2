import java.util.Arrays;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String n, String r, String w, String[] k) {
        super(n, r);
        warnaBulu = w;
        this.kemampuan = k;
    }

    @Override
    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Memiliki kemampuan : " + Arrays.toString(kemampuan).replace("[", "").replace("]", "").replace(",", ""));
    }
}
