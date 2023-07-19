
package laundry;


public interface User {
     public void setNama(String nama);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);
    public void SetJabatan(Integer Jabatan);
    
    public String getNama(int id);
    public String getAlamat(int id);
    public String getTelepon(int id);
    public Integer getJabatan(int id);
}
