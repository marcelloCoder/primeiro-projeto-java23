package br.com.ebac.primeiro.abstractfactory.modulo15;

public class Demo {
	
	private static App configureApplication() {
        App app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("TOYOTA")) {
            factory = new ToyotaFactory();
        } else {
            factory = new FiatFactory();
        }
        app = new App(factory);
        return app;
    }

    public static void main(String[] args) {
        App app = configureApplication();
        app.paint();
    }

}
