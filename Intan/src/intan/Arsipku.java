
package intan;


public class Arsipku implements Biodata, Nilai {
    public static void main(String[] args) {
       Arsipku ps = new Arsipku();
       ps.tampilNama();
       ps.tampilTempatlahir();
       ps.tampilHobi();
       ps.tampilNilaiAgama();
       ps.tampilNilaiBahasaIndonesia();
       ps.tampilNilaiMatematika();
       
        
    }

    @Override
    public void tampilNama() {
        System.out.println("Namaku Intan Nuraini Hadi");
    }

    @Override
    public void tampilTempatlahir() {
        System.out.println("Tempat Tanggal Lahir 02-08-2002");
    }

    @Override
    public void tampilHobi() {
        System.out.println("Membaca Novel");
    }

    @Override
    public void tampilNilaiAgama() {
        System.out.println("Nilai Agama : 100");
    }

    @Override
    public void tampilNilaiBahasaIndonesia() {
        System.out.println("Nilai Bahasa Indonesia : 100");
    }

    @Override
    public void tampilNilaiMatematika() {
        System.out.println("Nilai Matematika : 100");
    }

    
 }
    

