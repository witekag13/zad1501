package devices;

import javax.print.DocFlavor;
import java.net.URL;
import java.util.ArrayList;

public class Phone extends Device {
    private static String server = "app.store.com";
    private static String protocol = "https";
    private static String version = "1.0.1";

    public Phone(String producent, String model, int yearOfProduction) {
        super(producent, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on " + getProducent() + " " + getModel());
    }

    private String displayAppAdress(String protocol, String server, String version, String name){
        return protocol +"://" + server + "/" + name + "/version/" + version;
    }

    public void installAnApp(String name){
        System.out.println("Installing app from: " + displayAppAdress(protocol,server,version,name));
    }

    public void installAnApp(String name, String v){
        System.out.println("Installing app from: " + displayAppAdress(protocol,server,v,name));
    }

    public void installAnApp(ArrayList<String> names){
        for(String n : names) {
            System.out.println("Installing app from: " + displayAppAdress(protocol, server, version, n));
        }
    }

    public void installAnApp(URL u){
        System.out.println("Installing app from: " + u);
    }

    @Override
    public String toString() {
        return "Phone{" +
        "producent='" + super.getProducent() + '\'' +
        ", model='" + super.getModel() + '\'' +
        "}";
    }
}
