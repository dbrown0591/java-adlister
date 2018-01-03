import com.sun.org.apache.bcel.internal.generic.NEW;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection = null;

    public MySQLAdsDao() {
        Config config = new Config();
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        return null; //for now
    }
    // insert a new ad and return the new ad's id
    @Override
    public Long insert(Ad ad) {
        return null; // for now
    }
}

