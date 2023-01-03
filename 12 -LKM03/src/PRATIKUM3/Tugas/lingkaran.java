package PRATIKUM3.Tugas;

public class lingkaran extends BangunDatar{
    float r;

    void SetJari_jari(float r){
        this.r = r;
    }
    void luas(){
        float luas =(float) 3.14*r*r;
        System.out.println("Luas Lingkaran: " + luas);
    }
    void keliling(){
        float keliling = (float)3.14*2*r;
        System.out.println("Keliling Lingkaran: " + keliling);
    }
}
