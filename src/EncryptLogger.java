
public class EncryptLogger {
    String plain;
    public void setPlainText(String s){
        plain=s;
    }

    public void setEncryptionStrategy(EncryptionStrategy obj){
        obj.encrypt(plain);
    }
}
