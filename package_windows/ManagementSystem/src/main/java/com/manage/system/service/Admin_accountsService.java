//package com.manage.system.service;
//
//import com.manage.system.common.Id;
//import com.manage.system.entity.Admin_accountsEntity;
//import com.manage.system.repository.Admin_accountsRepository;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import java.util.Optional;
//
//
//@Service
//public class Admin_accountsService {
//
//    private final Admin_accountsRepository admin_accountsRepository;
//
//    public Admin_accountsService(Admin_accountsRepository admin_accountsRepository){
//        this.admin_accountsRepository = admin_accountsRepository;
//    }
//
//    @Transactional
//    public Optional<Admin_accountsEntity> login(Id<Admin_accountsEntity, Long> id){
//
//        return admin_accountsRepository.findByIdAndPw(id);
//
//    }
//
//}
