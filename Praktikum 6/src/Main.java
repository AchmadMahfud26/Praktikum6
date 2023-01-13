public class Main {
    public static void main(String[] args) {
        // membuat objek bangundatar dari class persegi
        BangunDatar rect = new persegi(100, 200);

        // membuat objek bangundatar dari class lingkaran
        BangunDatar circ = new lingkaran(50);

        // membuat objek bangundatar dari class segitiga
        BangunDatar Seg = new Segitiga(70, 80);


        /* memanggil method draw */
        rect.gambar();
        circ.gambar();
        Seg.gambar();

        System.out.println("Luas Lingkaran: " + circ.getluas());
        System.out.println("Luas Persegi: " + rect.getluas());
        System.out.println("Luas Segitiga: " + Seg.getluas());
    }
}