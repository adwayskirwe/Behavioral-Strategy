
public class Client {
    public  static  void main(String[]args){
        EncryptLogger o=new EncryptLogger();
        o.setPlainText("I am Adway");
        EncryptionStrategy obj=new CaesarCipher();
        o.setEncryptionStrategy(obj);
        EncryptionStrategy obj2=new HillCipher();
        o.setEncryptionStrategy(obj2);
    }
}
