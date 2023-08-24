public class HSBCBank implements IBank{
    private String BankName;
    private String terminaID;
    private String password;

    public HSBCBank(String bankName, String terminaID, String password) {
        BankName = bankName;
        this.terminaID = terminaID;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAdress){
        System.out.println("Kullanıcı IP Adresi : " + ipAdress);
        System.out.println("Bağlanılan sunucu IP Adresi : " + this.hostIPadress);
        System.out.println(this.BankName + "'e bağlanıldı");
        return true;
    }

    @Override
    public boolean sendCardInfo(double price, int cardNumber, int expireDate, int CV){
        System.out.println("Bankanızdan cevap bekleniyor...");
        System.out.println("İşlem başarılı!");
        return true;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public String getTerminaID() {
        return terminaID;
    }

    public void setTerminaID(String terminaID) {
        this.terminaID = terminaID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
