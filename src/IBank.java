public interface IBank {
    final String hostIPadress = "127.0.0.1";
    boolean connect(String ipAdress);

    boolean sendCardInfo(double price, int CardNumber, int expireDate, int CV);
}
