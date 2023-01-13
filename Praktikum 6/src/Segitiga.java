public class Segitiga extends BangunDatar{
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void gambar() {
        System.out.println("gambar segitiga");
    }

    @Override
    public float getluas() {
        return (float) (0.5 * alas * tinggi);

    }
}
