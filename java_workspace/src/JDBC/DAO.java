package JDBC;

import java.util.List;

public interface DAO {

	int insert(Product product);

	List<Product> selectList();

	List<Product> selectDetailList();

	int update(Product product);

	int delete(int pno);
}
