package com.controller;

import com.beans.UserBean;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    private HashMap<String, User> users = new HashMap<>();

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String index(Map<String, Object> map) {
        map.put("users", users.values());
        return "user/index";
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public String save(HttpServletRequest request, Map<String, Object> map) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        users.put(userName, new User(userName, password, firstName, lastName, email, phoneNumber));
        return "redirect:/user";
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public String add(@RequestParam Map<String, Object> map) {
        return "user/add";
    }

    @RequestMapping(value = "/user/get/{username}", method = RequestMethod.GET)
    public String getUserByUsername(@PathVariable String username) {
        System.out.println("Login username: " + username);

        User user = users.get(username);

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        UserBean bean = (UserBean) context.getBean("userBean");
        bean.setUser(user);
        return "redirect:/user";
    }
}