
public class FileDataSource implements DataSource {
	private String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }
    
    @Override
    public void writeData(String data) {
        // Escreve dados no arquivo.
        System.out.println("Writing data to " + filename + ": " + data);
    }

    @Override
    public String readData() {
        // Lê dados de um arquivo.
        return "Data from " + filename;
    }
}
