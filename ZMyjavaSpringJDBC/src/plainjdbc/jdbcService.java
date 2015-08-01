package plainjdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class jdbcService {
	
	DataSource dataSource = null;
	JdbcTemplate jdbct;
		
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbct = new JdbcTemplate(dataSource);
	}

	public List<Map<String, Object>> getDataById(){
				String sqlQuery = "SELECT * FROM jdbctest";
				return jdbct.queryForList(sqlQuery);
	}
	
	class TestRowMapper implements RowMapper<jdbcDemo>{

		@Override
		public jdbcDemo mapRow(ResultSet arg0, int arg1) throws SQLException {
			jdbcDemo jd = new jdbcDemo(arg0.getInt(1),arg0.getString(2),arg0.getInt(3));
			return jd;
		}
		
	}

}
