package lib.gintec_rdl.spector.providers.test;

import lib.gintec_rdl.spector.Spector;
import lib.gintec_rdl.spector.TypeInfo;
import org.junit.Test;

public class TestProvider {
    @Test public void testProvider(){
        System.setProperty("spector.autoloadProviders", "true");

        TypeInfo typeInfo;

        typeInfo = Spector.inspect("spector.png");

        assert typeInfo != null : "Unknown file type";
        assert typeInfo.getExtension().equalsIgnoreCase("png") : "Not a PNG file";
    }
}
