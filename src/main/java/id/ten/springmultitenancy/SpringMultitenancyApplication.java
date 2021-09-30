package id.ten.springmultitenancy;

import id.ten.springmultitenancy.config.CustomRoutingDataSource;
import id.ten.springmultitenancy.master.MasterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "id.ten.springmultitenancy")
public class SpringMultitenancyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMultitenancyApplication.class, args);
	}

	@Bean
	public DataSource dataSource() {
		CustomRoutingDataSource customRoutingDataSource = new CustomRoutingDataSource();
		customRoutingDataSource.setTargetDataSources(MasterService.getDataSourceHashMap());
		return customRoutingDataSource;
	}
}
