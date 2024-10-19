
public class Application {
	public void dumbUsageExample() {
        DataSource source = new FileDataSource("somefile.dat");
        source.writeData("salaryRecords");
        // O arquivo alvo foi escrito com dados simples.

        source = new CompressionDecorator(source);
        source.writeData("salaryRecords");
        // O arquivo alvo foi escrito com dados comprimidos.

        source = new EncryptionDecorator(source);
        // A variável fonte agora contém isso:
        // Encryption > Compression > FileDataSource
        source.writeData("salaryRecords");
        // O arquivo foi escrito com dados comprimidos e encriptados.
    }
}
