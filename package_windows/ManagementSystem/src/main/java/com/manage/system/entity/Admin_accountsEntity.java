//package com.manage.system.entity;
//
//import org.apache.commons.lang3.builder.ToStringBuilder;
//import org.apache.commons.lang3.builder.ToStringStyle;
//
//import java.util.Objects;
//
///**
// * @개요: DB에서 가져온 데이터를 자바 변수로 넣는 Entity 클래스
// * @처리내용: DB 컬럼과 같은 이름으로(캐멀타입) 데이터 타입, 명 정의된 변수에 DB결과값을 넣음
// * @Method Name : 
// */
//public class Admin_accountsEntity {
//    private final Long id;
//    private final String pw;
//
//    public Admin_accountsEntity(Long id, String pw){
//        this.id=id;
//        this.pw=pw;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getPw() {
//        return pw;
//    }
//
//    @Override
//    public String toString(){
//        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
//                .append("id",id)
//                .append("pw",pw)
//                .toString();
//    }
//
//    @Override
//    public int hashCode(){
//        return Objects.hash(id);
//    }
//}
