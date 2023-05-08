package JDBC;

import java.util.List;

public class ProductService implements Service {
	
	// Service -> DAO 요청
	private DAO dao;
	
	// 생성자
	public ProductService() {
		dao = new ProductDAO();
	}
	
	@Override
	public int register(Product product) {
		// 실제 DAO에 요청 처리 로직
		System.out.println("register service 진입");
		// dao에게 insert 요청 후 결과를 controller로 리턴 
		return dao.insert(product);
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		System.out.println("list service 진입");
		// dao에게 selectList 요청 후 결과를 List로 controller에 리턴
		return dao.selectList();
	}

	@Override
	public List<Product> detailList() {
		// TODO Auto-generated method stub
		System.out.println("detail list service 진입");
		return dao.selectDetailList();
	}

	@Override
	public int edit(Product product) {
		// TODO Auto-generated method stub
		System.out.println("edit service 진입");
		return dao.update(product);
	}

	@Override
	public int remove(int pno) {
		// TODO Auto-generated method stub
		System.out.println("remove service 진입");
		return dao.delete(pno);
	}

}
