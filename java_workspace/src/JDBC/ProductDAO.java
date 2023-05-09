package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements DAO {
	// DB Connection
	private Connection conn;
	// PreparedStatement 클래스를 사용하여 객체 생성 후 사용
	private PreparedStatement pst;
	// query문을 저장하기 위한 변수
	private String query = "";
	
	// 생성자
	public ProductDAO() {
		DatabaseConnector dbc = DatabaseConnector.getInstance();
		conn = dbc.getConnection();
	}
	
	
	// sql 구문 시작
	@Override
	public int insert(Product product) {
		// pname, price, madeby
		query = "insert into product(pname, price, madeby) values(?,?,?)";
		try {
			pst = conn.prepareStatement(query);  // DB 연결 구문
			// pst.set자료형(물음표순번, 값)
			pst.setString(1, product.getPname());
			pst.setInt(2, product.getPrice());
			pst.setString(3, product.getMadeby());
			// executeUpdate() => 값이 업데이트 되어야 하는 상황 (insert, update, delete)
			// executeQuery() => DB가 변하지 않는 상황 (select)
			// 결과를 리턴(insert의 결과 : 1 or 0)
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("insert error");
			e.printStackTrace();
		}
		return 0;
	}


	@Override
	public List<Product> selectList() {
		// TODO Auto-generated method stub
		System.out.println("dao 진입 성공");
		query = "select * from product order by pno desc";
		List<Product> list = new ArrayList<Product>();
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();    // select만 받아서 갈 게 있기 때문에 해줘야 함
			while(rs.next()) {
				list.add(new Product(rs.getInt("pno"), rs.getString("pname"), rs.getString("regdate")));
			}
			return list;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("selectList error");
		}
		return null;
	}


	@Override
	public List<Product> selectDetailList() {
		// TODO Auto-generated method stub
		System.out.println("dao 진입 성공");
		query = "select * from product";
		List<Product> detailList = new ArrayList<Product>();
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				detailList.add(new Product(rs.getInt("pno"), rs.getString("pname"), rs.getInt("price"), 
						rs.getString("regdate"), rs.getString("madeby")));
			}
			return detailList;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("selectDetailList error");
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public int update(Product product) {
		System.out.println("dao 진입 성공");
		query = "update product set price=? where pno=? ";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, product.getPrice());
			pst.setInt(2, product.getPno());
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("update error");
			e.printStackTrace();
		}
		return 0;
	}


	@Override
	public int delete(int pno) {
		System.out.println("dao 진입 성공");
		query = "delete from product where pno=? ";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, pno);
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("delete error");
			e.printStackTrace();
		}
		return 0;
	}

	
	
}
