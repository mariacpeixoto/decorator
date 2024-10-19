
public class ApplicationConfigurator {
	public void configurationExample(boolean enabledEncryption, boolean enabledCompression) {
        DataSource source = new FileDataSource("salary.dat");
        if (enabledEncryption) {
            source = new EncryptionDecorator(source);
        }
        if (enabledCompression) {
            source = new CompressionDecorator(source);
        }

        SalaryManager salaryManager = new SalaryManager(source);
        String salary = salaryManager.load();
        System.out.println(salary);
    }
}
