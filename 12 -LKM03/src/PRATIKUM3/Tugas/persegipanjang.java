package PRATIKUM3.Tugas;

public class persegipanjang {
    float panjang;
    float lebar;

    void SetPanjangLebar(float panjang, float lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    void luas(){
        float luas = panjang*lebar;
        System.out.println("Luas Persegi Panjang: " + luas);
    }
    void keliling(){
        float keliling = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }
}
