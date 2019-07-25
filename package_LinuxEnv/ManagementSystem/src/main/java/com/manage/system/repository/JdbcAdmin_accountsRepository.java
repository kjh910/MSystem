//package com.manage.system.repository;
//
//import com.manage.system.common.Id;
//import com.manage.system.entity.Admin_accountsEntity;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class JdbcAdmin_accountsRepository implements Admin_accountsRepository{
//
//    private final JdbcTemplate jdbcTemplate;
//
//    public JdbcAdmin_accountsRepository(JdbcTemplate jdbcTemplate){
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    @Override
//    public Optional<Admin_accountsEntity> findByIdAndPw(Id<Admin_accountsEntity, Long> id){
//        List<Admin_accountsEntity> results = jdbcTemplate.query(
//                "SELECT " +
//                        "* " +
//                        "FROM admin_accounts " +
//                        "WHERE id =? "
//                        ,new Object[]{id.value()},
//                mapper
//        );
//        
//        return Optional.ofNullable(results.isEmpty() ? null : results.get(0));
//    }
//
//    static RowMapper<Admin_accountsEntity> mapper = (rs, rowNum) -> new Admin_accountsEntity(
//            rs.getLong("id"),
//            rs.getString("pw"));
//}
