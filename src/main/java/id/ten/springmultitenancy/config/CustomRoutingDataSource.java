package id.ten.springmultitenancy.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Package: id.ten.springmultitenancy.config
 * <p>
 * User: TetenNugraha
 * Date: 9/30/2021
 * Time: 4:05 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class CustomRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();     // get request object
        if(attr!=null) {
            String tenantId = attr.getRequest().getParameter("tenantId");       // find parameter from request
            return tenantId;
        }else{
            return "tenantId1";             // default data source
        }
    }
}
