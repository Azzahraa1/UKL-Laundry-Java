
package laundry;


import java.util.ArrayList;

public class Petugas implements User {
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Petugas(){
        this.namaPetugas.add("Administrator X");
        this.alamat.add("Malang");
        this.telepon.add("089766428637");
        
        this.namaPetugas.add("Administrator Y");
        this.alamat.add("Kediri");
        this.telepon.add("081896287286");
    }

    //@Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    //@Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    //@Ov  erride
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    //@Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    //@Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    //@Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    public void tampilPetugas(){
        int n = this.namaPetugas.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
        }
    }

    @Override
    public void SetJabatan(Integer Jabatan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getJabatan(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

   