
public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        // 1. Comprimir os dados passados.
        String compressedData = "Compressed(" + data + ")";
        // 2. Passar os dados comprimidos para o método writeData do objeto envolvido.
        wrappee.writeData(compressedData);
    }

    @Override
    public String readData() {
        // 1. Obter dados do método readData do objeto envolvido.
        String data = wrappee.readData();
        // 2. Tentar descomprimi-lo se for comprimido.
        return "Uncompressed(" + data + ")";
    }
}
