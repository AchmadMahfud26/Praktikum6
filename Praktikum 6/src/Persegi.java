public class persegi extends BangunDatar{
    private float panjang;
    private float lebar;

    public persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void gambar() {
        System.out.println("gambar persegi");
    }

    @Override
    public float getluas() {
        return this.lebar * this.panjang;
    }
}

