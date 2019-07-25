package com.manage.system.repository;

import static com.manage.system.util.DateTimeUtils.dateTimeOf;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.manage.system.entity.RegistrationsEntity;


/**
 * @개요: DB에서 처리한 Registrations테이블 관련 수치연산을 처리
 * @처리내용: SQL문 전송 -> 각 타입에 맞게 결과값을 리턴
 * @Method Name : 
 */
@Repository
public class JdbcRegistrationsRepository implements RegistrationsRepository {
	
	private final JdbcTemplate jdbcTemplate;
	
	public JdbcRegistrationsRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
	
	@Override
	public Long countCreatedAt() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(
				"SELECT count(*) "
				+ "FROM "
				+ "(SELECT created_at FROM registrations GROUP BY created_at) "
				+ "AS foo;",Long.class);
	}
	
	@Override
	public List<Timestamp> createdAtList() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList(
				"SELECT * "
				+ "FROM "
				+ "(SELECT created_at FROM registrations GROUP BY created_at) "
				+ "AS foo;",Timestamp.class
				);
	}
	
	@Override
	public Long countByCreatedAt(String createdAt) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(
				"SELECT count(*) "
				+ "FROM registrations "
				+ "WHERE created_at Like ?", new Object[] {createdAt+"%"},
				Long.class);
	}

	static RowMapper<RegistrationsEntity> mapper = (rs, rowNum) -> new RegistrationsEntity(
			rs.getLong("id"),
			rs.getString("receiptNumber"),
			rs.getString("phoneMobile"),
			rs.getString("paymentWay"),
			rs.getLong("amount"),
			rs.getInt("refund"),
			rs.getString("deviceId"),
			rs.getInt("specialGoodFlag"),
			dateTimeOf(rs.getTimestamp("createAt")),
			dateTimeOf(rs.getTimestamp("updateAt")));

}
