
public class EncryptionDecorator extends DataSourceDecorator {
	public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        // 1. Encriptar os dados passados.
        String encryptedData = "Encrypted(" + data + ")";
        // 2. Passar dados encriptados para o método writeData do objeto envolvido.
        wrappee.writeData(encryptedData);
    }

    @Override
    public String readData() {
        // 1. Obter os dados do método readData do objeto envolvido.
        String data = wrappee.readData();
        // 2. Tentar decifrá-lo se for encriptado.
        return "Decrypted(" + data + ")";
    }
}
