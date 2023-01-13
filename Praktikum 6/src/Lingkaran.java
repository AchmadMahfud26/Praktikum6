import java.lang.Math;
public class lingkaran extends BangunDatar {
    private float radius;

    public lingkaran(float radius) {
        this.radius = radius;
    }

    @Override
    public void gambar() {
        System.out.println("gambar lingkaran");
    }

    @Override
    public float getluas() {
        return (float) (Math.PI * radius * radius);
    }
}

