package shelterv2;

public class Shelter {

    private String namaShelter;
    private int jumlahPenduduk;
    private String[] namaPenduduk = new String [20];

    public String getPendudukbyIndex(int index) {
        return namaPenduduk[index];
    }

    public String[] getNamaPenduduk() {
        return namaPenduduk;
    }

    public void setNamaPenduduk(String[] namaPenduduk) {
        this.namaPenduduk = namaPenduduk;
        
    }

    public String getNamaShelter() {
        return namaShelter;
    }

    public void setNamaShelter(String namaShelter) {
        this.namaShelter = namaShelter;
    }

    public int getJumlahPenduduk() {
        return jumlahPenduduk;
    }

    public void setJumlahPenduduk(int jumlah) {
        namaPenduduk = new String[jumlah];
        jumlahPenduduk = jumlah;

    }

    public Shelter() {

    }

    public Shelter(String namaShelter, int panjang) {
        this.namaShelter = namaShelter;
        namaPenduduk = new String[panjang];
        jumlahPenduduk = panjang;

    }

    public void tampilPenduduk(String judul) {
        System.out.println("=====" + judul + "=====");
        for (int i = 0; i < this.namaPenduduk.length; i++) {
            if (this.namaPenduduk[i] != null) {
                System.out.println("No. " + (i + 1) + " " + this.namaPenduduk[i]);
            }
        }
    }

    public void addPenduduk(String nama) {
        for (int i = 0; i < this.namaPenduduk.length; i++) {
            if (this.namaPenduduk[i] == null) {
                this.namaPenduduk[i] = nama;
                break;
            }
            if (i == this.namaPenduduk.length - 1) {
                System.out.println("Maaf Shelter ini sudah penuh");
            }
        }
    }
}

