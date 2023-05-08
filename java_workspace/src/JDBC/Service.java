package JDBC;

import java.util.List;

public interface Service {

	int register(Product product);

	List<Product> list();

	List<Product> detailList();

	int edit(Product product);

	int remove(int pno);

}
