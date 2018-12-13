package example.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDAO extends JdbcDaoSupport {
    public TestDAO() {
        super();
    }

    public void getUserName(){
        String sql = "select * from users";
        List<Map> users = super.getJdbcTemplate().query(sql, new RowMapper<Map>() {
            @Override
            public Map mapRow(ResultSet resultSet, int i) throws SQLException {
                Map<String,String> row = new HashMap<>();
                row.put("name",resultSet.getString("name"));
                return row;
            }
        });
        System.out.println(users);
    }
}
