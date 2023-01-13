public abstract class BangunDatar {
    String Warna;

    public BangunDatar(String Warna) {
        this.Warna = Warna;
    }
    public String getWarna(){
        return this.Warna;
    }
    public void setWarna(String warna){
        this.Warna = Warna;
    }
    public abstract void gambar();
    public abstract float luas();


}

