package com.checkmate.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checkmate.dao.TaskmainRepository;
import com.checkmate.dto.Dbtest;
import com.checkmate.dto.TaskMainDTO;
import com.checkmate.entity.TaskmainEntity;
 

@Service
public class DbtestService {
	
	private static final String  DROP_TRIGGER ="DECLARE   "
			+ "     CURSOR all_tables   "
			+ "     IS   "
			+ "      select 'drop trigger ' || trigger_name  stmt from user_triggers  where trigger_name like '%CHECKMATETRG%';   "
			+ "    "
			+ "      v_id   NUMBER := 1;   "
			+ "  BEGIN   "
			+ "     FOR rec_cur IN all_tables   "
			+ "     LOOP   "
			+ "    BEGIN    "
			+ "    dbms_output.put_line( rec_cur.stmt);   "
			+ "   EXECUTE IMMEDIATE  rec_cur.stmt;   "
			+ "       "
			+ "  v_id := v_id +1;   "
			+ "  EXCEPTION    "
			+ "      WHEN OTHERS    "
			+ "        THEN dbms_output.put_line(SQLERRM );   "
			+ "  end;   "
			+ "     END LOOP;   "
			+ "     dbms_output.put_line(v_id);   "
			+ "  END;   "
			+ "  ";
 
	private static final String CREATE_TRIGGER ="DECLARE   "
			+ "     CURSOR all_tables   "
			+ "     IS   "
			+ "        SELECT  table_name    "
			+ "        FROM all_tab_columns    "
			+ "        WHERE table_name like 'F%' and table_name not like '%JOB_LIST%' and table_name not like '%PARAM%' and column_name LIKE '%XMLR%' and data_type LIKE '%XMLTYPE%' AND OWNER=( Select user from dual);   "
			+ "    "
			+ "      v_id   NUMBER := 1;   "
			+ "  BEGIN   "
			+ "     FOR rec_cur IN all_tables   "
			+ "     LOOP   "
			+ "    BEGIN    "
			+ "   EXECUTE IMMEDIATE   'create or replace trigger CHECKMATETRG_'   "
			+ "                          || rec_cur.table_name   "
			+ "                          || '   "
			+ "  after insert or update or delete on '   "
			+ "                          || rec_cur.table_name   "
			+ "                          || '   "
			+ "  FOR EACH ROW    "
			+ "  declare   "
			+ "  begin   "
			+ "      "
			+ "  if inserting then   "
			+ "     insert into LOG_TABLE values(''INSERTING on '||rec_cur.table_name||''',:NEW.RECID  ,  dbms_transaction.local_transaction_id ,:NEW.XMLRECORD,CURRENT_TIMESTAMP);   "
			+ "  elsif updating then   "
			+ "     insert into LOG_TABLE values(''UPDATING on '||rec_cur.table_name||''',:NEW.RECID  ,  dbms_transaction.local_transaction_id ,:NEW.XMLRECORD,CURRENT_TIMESTAMP);   "
			+ "   elsif deleting then   "
			+ "     insert into LOG_TABLE values(''DELETING on '||rec_cur.table_name||''',:OLD.RECID  ,  dbms_transaction.local_transaction_id ,:OLD.XMLRECORD,CURRENT_TIMESTAMP);   "
			+ "   end if;   "
			+ "      "
			+ "  end;';   "
			+ "  v_id := v_id +1;   "
			+ "  EXCEPTION    "
			+ "      WHEN OTHERS    "
			+ "        THEN dbms_output.put_line(SQLCODE);   "
			+ "  end;   "
			+ "     END LOOP;   "
			+ "     dbms_output.put_line(v_id);   "
			+ "  END;";
  

	public String createTrigger(Dbtest dbtest) {

		String res = "";
		try {
			if (dbtest.getDbtypesys1() != null && dbtest.getDbtypesys1().equals("oracle"))
				Class.forName("oracle.jdbc.driver.OracleDriver");
			else
				Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@" + dbtest.getJdbcurlsys1(),
					dbtest.getUsernamesys1(), dbtest.getPasswordsys1());
			DatabaseMetaData dbmd = con.getMetaData();

			CallableStatement stmt = con.prepareCall(CREATE_TRIGGER);

			stmt.execute();
			res = "Trigger Created Successful";

			con.close();
		} catch (Exception e) {
			res = "Trigger Creation Failed";
			System.out.println(e);
		}
		return res;
	}

	public String dropTrigger(Dbtest dbtest) {
		String res = "";
		try {
			if (dbtest.getDbtypesys1() != null && dbtest.getDbtypesys1().equals("oracle"))
				Class.forName("oracle.jdbc.driver.OracleDriver");
			else
				Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@" + dbtest.getJdbcurlsys1(),
					dbtest.getUsernamesys1(), dbtest.getPasswordsys1());
			DatabaseMetaData dbmd = con.getMetaData();

			CallableStatement stmt = con.prepareCall(DROP_TRIGGER);

			stmt.execute();
			res = "Trigger Deoped Successful";

			con.close();
		} catch (Exception e) {
			res = "Trigger Drop Failed";
			System.out.println(e);
		}
		return res;

	}

	public String dbTestMethod(Dbtest dbtest) {

		String res = "";
		try {
			if (dbtest.getDbtypesys1() != null && dbtest.getDbtypesys1().equals("oracle"))
				Class.forName("oracle.jdbc.driver.OracleDriver");
			else
				Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@" + dbtest.getJdbcurlsys1(),
					dbtest.getUsernamesys1(), dbtest.getPasswordsys1());
			DatabaseMetaData dbmd = con.getMetaData();

			String table[] = { "TABLE" };
			ResultSet rs = dbmd.getTables(null, null, null, table);

			if (rs.next()) {
				//System.out.println(rs.getString(3));
				res = "connection success";

			}

			con.close();
		} catch (Exception e) {
			res = "connection Failure";
			System.out.println(e);
		}
		return res;
	}
}