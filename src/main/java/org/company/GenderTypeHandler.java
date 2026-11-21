package org.company;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.company.entity.Gender;

import java.sql.*;

public class GenderTypeHandler extends BaseTypeHandler<Gender> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i,
                                    Gender param, JdbcType jdbcType) throws SQLException {
        // Saves "MALE" or "FEMALE" as String into DB
        ps.setString(i, param.name());
    }

    @Override
    public Gender getNullableResult(ResultSet rs, String col) throws SQLException {
        String val = rs.getString(col);
        return val == null ? null : Gender.valueOf(val);
    }

    @Override
    public Gender getNullableResult(ResultSet rs, int idx) throws SQLException {
        String val = rs.getString(idx);
        return val == null ? null : Gender.valueOf(val);
    }

    @Override
    public Gender getNullableResult(CallableStatement cs, int idx) throws SQLException {
        String val = cs.getString(idx);
        return val == null ? null : Gender.valueOf(val);
    }
}
