package id.ten.springmultitenancy.master;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.HashMap;
import java.util.Map;

/**
 * Package: id.ten.springmultitenancy.master
 * <p>
 * User: TetenNugraha
 * Date: 9/30/2021
 * Time: 4:03 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class MasterService {

    public static Map<Object, Object> getDataSourceHashMap() {

        DriverManagerDataSource dataSource1 = new DriverManagerDataSource();
        dataSource1.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource1.setUrl("jdbc:mysql://localhost:3306/demo_database_multitenant_1");
        dataSource1.setUsername("root");
        dataSource1.setPassword("root");

        DriverManagerDataSource dataSource2 = new DriverManagerDataSource();
        dataSource2.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource2.setUrl("jdbc:mysql://localhost:3306/demo_database_multitenant_2");
        dataSource2.setUsername("root");
        dataSource2.setPassword("root");

        HashMap map = new HashMap();
        map.put("tenantId1", dataSource1);
        map.put("tenantId2", dataSource2);

        return map;
    }

}
