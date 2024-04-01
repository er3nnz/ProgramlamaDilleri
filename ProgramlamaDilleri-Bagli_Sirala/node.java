public class node {
    private int veri;
    private int adres;

    public node(int veri, int adres) {
        this.veri = veri;
        this.adres = adres;
    }
    public int getVeri() {
        return veri;
    }

    public int getAdres() {
        return adres;
    }
    public void setAdres(int adres) {
        this.adres = adres;
    }
}