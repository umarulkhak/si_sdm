package HRD;

public class User_management {
   
        private final int id;
        private final String nama;
        private final String username;
        private final String password;
        
        
        public User_management(int Aid,String Anama,String Ausername,String Apassword){
        this.id=Aid;
        this.nama=Anama;
        this.username=Ausername;
        this.password=Apassword;
      
        }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
        
        
        
    
}
