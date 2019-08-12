
package HRD;


public class penilaian1 {
        
        private final String tanggal;
        private final int id;
        private final int nik;
        private final String nama;
        private final String nilai;
        
 public penilaian1(String Atanggal,int Aid,int Anik,String ANama,String Anilai){
     this.tanggal =Atanggal;
     this.id =Aid;
     this.nik =Anik;
     this.nama = ANama;
     this.nilai =Anilai;
    }  

    public String getTanggal() {
        return tanggal;
    }

    public int getId() {
        return id;
    }

    public int getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getNilai() {
        return nilai;
    }
    
}
