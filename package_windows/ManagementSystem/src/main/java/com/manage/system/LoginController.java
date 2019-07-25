//package com.manage.system;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.manage.system.common.Id;
//import com.manage.system.entity.Admin_accountsEntity;
//import com.manage.system.service.Admin_accountsService;
//
//@Controller
//public class LoginController {
//
//    private final Admin_accountsService admin_accountsService;
//    
////    private static final Logger indexLogger = LoggerFactory.getLogger(LoginController.class);
//
//    public LoginController(Admin_accountsService admin_accountsService){
//        this.admin_accountsService = admin_accountsService;
//    }
//
//    @RequestMapping(value = "/loginCheck", method=RequestMethod.POST)
//    public String loginCheck(Long userId) {
//
//        Id<Admin_accountsEntity, Long> id;
//
//        id= Id.of(Admin_accountsEntity.class, userId);
//
//        admin_accountsService.login(id);
//
//        return "main/index/index";
//    }
//}
