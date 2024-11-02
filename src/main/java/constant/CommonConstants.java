package constant;
import static utils.Reader.getEnvironmentConfig;
public class CommonConstants {
    public static final String LOCATION="./src/test/resources/properties/common.properties";
    public static final String WEBSITE_URL= getEnvironmentConfig(LOCATION,"url");
}
