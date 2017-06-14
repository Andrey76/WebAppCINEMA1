package helper;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by andr_ on 18.05.2017.
 */
public final class PropertyHolder {
    private static PropertyHolder propertyHolder;

    private boolean isInMemoryDB;
    private String jdbcUrl;
    private String dbUserLogin;
    private String dbUserPassword;
    private String dbDriver;
    private PropertyHolder() {
        loadProperties();
    }

    public static synchronized PropertyHolder getInstance() {
        if (propertyHolder == null) {
            propertyHolder = new PropertyHolder();
        }
        return propertyHolder;
    }

    private void loadProperties() {
        Properties prop = new Properties();

        try {
            prop.load(PropertyHolder.class.getClassLoader().getResourceAsStream("app.properties"));

            this.isInMemoryDB = Boolean.valueOf(prop.getProperty("isInMemoryDB"));
            this.dbDriver = prop.getProperty("dbDriver");
            this.jdbcUrl = prop.getProperty("jdbcUrl");
            this.dbUserLogin = prop.getProperty("dbUserLogin");
            this.dbUserPassword = prop.getProperty("dbUserPassword");

        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public String getDbDriver() {
        return dbDriver;
    }

    public String getDbUserLogin() {
        return dbUserLogin;
    }

    public String getDbUserPassword() {
        return dbUserPassword;
    }

    public boolean isInMemoryDB() {
        return isInMemoryDB;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }
}
