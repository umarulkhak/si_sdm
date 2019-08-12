
package HRD;


public class Gaji1 {
        private final String Tgl;
        private final int id;
        private final int nik;
        private final String nama;
        private final String jabatan;
        private final int gaji_pokok;
        private final int tunjangan;
        private final int hari_x;
        private final int total;
        
   public Gaji1(String Tangg,int Aid,int Anik,String ANam,String Ajab,int Agajipok,int Atunjangan,int harix,int total){
        this.Tgl=Tangg; 
        this.id=Aid;
        this.nik=Anik;
        this.nama=ANam;
        this.jabatan=Ajab;
        this.gaji_pokok=Agajipok;
        this.tunjangan=Atunjangan;
        this.hari_x=harix;
        this.total =total; 
    
}

    public String getTgl() {
        return Tgl;
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

    public String getJabatan() {
        return jabatan;
    }

    public int getGaji_pokok() {
        return gaji_pokok;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public int getHari_x() {
        return hari_x;
    }

    public int getTotal() {
        return total;
    }
   
   
}
