//package blog.controllers;
//
//import blog.forms.LoginForm;
//import blog.services.LoginService;
//import blog.services.NotificationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.validation.Valid;
//
//
//@Controller
//public class AccountController {
//
//    @Autowired
//    private NotificationService notificationService;
//
//    @Autowired
//    private LoginService loginService;
//
//    @RequestMapping("/users/login")
//    public String showLoginForm(LoginForm loginForm){
//        return "users/login";
//    }
//
//    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
//    public String showLoginForm(@Valid LoginForm loginForm, BindingResult bindingResult){
//
//        if(bindingResult.hasErrors()){
//            notificationService.addErrorMessage("Please fix errors!");
//            return "users/login";
//        }
//
//        if(! loginService.authenticate(loginForm.getUsername(), loginForm.getPassword())){
//            notificationService.addErrorMessage("Invalid login");
//            return "users/login";
//        }
//
//        notificationService.addInfoMessage("You logged in.");
//
//        return "redirect:/";
//    }
//}
