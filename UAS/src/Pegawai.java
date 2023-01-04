public class Pegawai {
    public String nama;
    public String jabatan;
    public double pajak;
    private double gajiPokok;
    private double gajiBersih;

    public Pegawai(String nama, String jabatan, float pajak){
        this.nama = nama;
        this.jabatan = jabatan;  
        this.pajak = pajak;
    }
    public void setGajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public double getGajiBersih(){
        return gajiBersih = gajiPokok - (gajiPokok*pajak);
    }
    void display(){
        gajiBersih = (gajiPokok*gajiBersih) - gajiPokok;
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Jabatan : " + this.jabatan);
        System.out.println("Gaji Bersih : " + getGajiBersih());
    }
    public static void main(String[] args) throws Exception {
        Pegawai pegawai1 = new Pegawai("Fajar","Manager",500);
        pegawai1.setGajiPokok(15.000000);
        pegawai1.display();
    }
}

