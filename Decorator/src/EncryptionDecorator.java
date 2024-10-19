
public class EncryptionDecorator extends DataSourceDecorator {
	public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        // 1. Encriptar os dados passados.
        String encryptedData = "Encrypted(" + data + ")";
        // 2. Passar dados encriptados para o m�todo writeData do objeto envolvido.
        wrappee.writeData(encryptedData);
    }

    @Override
    public String readData() {
        // 1. Obter os dados do m�todo readData do objeto envolvido.
        String data = wrappee.readData();
        // 2. Tentar decifr�-lo se for encriptado.
        return "Decrypted(" + data + ")";
    }
}
