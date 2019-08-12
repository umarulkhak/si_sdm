
package HRD;


public class Rekrutment1 {
        private final int id;
        private final String N_pndftr;
        private final String Tem_Lahir;
        private final String Tgl_lahir;
        private final String pen_ter;
        private final String jk;
        private final String posisi;
        private final byte[] picture;
        
         public Rekrutment1(int Aid,String ANam,String Tem,String Tangg
                    ,String pendidikan,String Ajk,String Aposisi, byte[] Pimg){
        this.id=Aid;
        this.N_pndftr=ANam;
        this.Tem_Lahir=Tem;
        this.Tgl_lahir=Tangg;
        this.jk=Ajk;
        this.pen_ter=pendidikan;
        this.posisi =Aposisi;
        this.picture=Pimg;
    }  

    public int getId() {
        return id;
    }

    public String getN_pndftr() {
        return N_pndftr;
    }

    public String getTem_Lahir() {
        return Tem_Lahir;
    }

    public String getTgl_lahir() {
        return Tgl_lahir;
    }

    public String getPen_ter() {
        return pen_ter;
    }

    public String getJk() {
        return jk;
    }

    public String getPosisi() {
        return posisi;
    }

    public byte[] getPicture() {
        return picture;
    }
        
}
