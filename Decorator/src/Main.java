
public class Main {
	public static void main(String[] args) {
        Application app = new Application();
        app.dumbUsageExample();

        ApplicationConfigurator configurator = new ApplicationConfigurator();
        configurator.configurationExample(true, true);
    }
}
