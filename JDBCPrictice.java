import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DbUtil{
	public static final String URL = "jdbc:mysql://localhost:3306/imooc";
	public static final String USER = "Liulx";
	public static final String PASSWORD = "123456";
	public static Connection conn = null;
	static {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch(ClassNotFoundException){
			e.printStackTrace();
		} catch(SQLExcption){
			e.printStackTrace();
		}
	}

	public static Connection getConnection(){
		return conn;
	}
}


// package liulx.model;

// import java.util.Date;

// public class Goddess {
// 	private Integer id;
//     private String user_name;
//     private Integer sex;
//     private Integer age;
//     private Date birthday; //注意用的是java.util.Date
//     private String email;
//     private String mobile;
//     private String create_user;
//     private String update_user;
//     private Date create_date;
//     private Date update_date;
//     private Integer isDel;

    //getter and setter;


package liulx.dao;

import liulx.db.DbUtil;
import liulx.model.Goddess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GoddessDao {
	public void addGoddess(Goddess g) throw SQLException{
		Connection conn = DbUtil.getConnection;
		String sql = "INSERT INTO imooc_goddess(user_name, sex, age, birthday, email, mobile,"+"create_user, create_date, update_user, update_date, isdel)"+"values("+"?,?,?,?,?,?,?,CURRENT_DATE(),?,CURRENT_DATE(),?)";
		PrepareStatement ptmt = conn.PrepareStatement(sql);
		ptmt.setString(1, g.getUser_name());
		ptmt.setInt(2, g.getSex());
		ptmt.setInt(3, g.getAge());
		ptmt.setDate(4, new Date(g.getBirthday()).getTime());
		ptmt.setString(5, g.getEmail());
		ptmt.setString(6, g.getMobile());
        ptmt.setString(7, g.getCreate_user());
        ptmt.setString(8, g.getUpdate_user());
        ptmt.setInt(9, g.getIsDel());

        ptmt.execute();

	}

	public void updateGoddess() {
		Connection conn = DbUtil.getConnection;
		String sql = "UPDATE imooc_goddess" +" set user_name=?, sex=?, age=?, birthday=?, email=?, mobile=?,"+" update_user=?, update_date=CURRENT_DATE(), isdel=? "+" where id=?";
		PrepareStatement ptmt = conn.PrepareStatement(sql);
		ptmt.setString(1, g.getUser_name());
		ptmt.setInt(2, g.getSex());
		ptmt.setInt(3, g.getAge());
		ptmt.setDate(4, new Date(g.getBirthday()).getTime());
		ptmt.setString(5, g.getEmail());
		ptmt.setString(6, g.getMobile());
        ptmt.setString(7, g.getCreate_user());
        ptmt.setString(8, g.getUpdate_user());
        ptmt.setInt(9, g.getIsDel());

        ptmt.execute();
	}

	public void delGoddess() {
		Connection conn = DbUtil.getConnection();
		String sql = "delete from imooc_goddess where id=?";
		PrepareStatement ptmt = conn.PrepareStatement(sql);
		ptmt.setInt(1, id);
		ptmt.execute();

	}

	public Goddess get() {
		Goddess g = null;
		Connection conn = DbUtil.getConnection();
		String sql = "SELECT * FROM imooc_goddess WHERE id = ?";
		PrepareStatement ptmt = conn.PrepareStatement(sql);
		ptmt = setInt(1, id);
		ResultSet re = ptmt.executeQuery();
		while (re.next()){
			g = new Goddess();
            g.setId(rs.getInt("id"));
            g.setUser_name(rs.getString("user_name"));
            g.setAge(rs.getInt("age"));
            g.setSex(rs.getInt("sex"));
            g.setBirthday(rs.getDate("birthday"));
            g.setEmail(rs.getString("email"));
            g.setMobile(rs.getString("mobile"));
            g.setCreate_date(rs.getDate("create_date"));
            g.setCreate_user(rs.getString("create_user"));
            g.setUpdate_date(rs.getDate("update_date"));
            g.setUpdate_user(rs.getString("update_user"));
            g.setIsDel(rs.getInt("isdel"));

		}
		return g;
	}
}

















}