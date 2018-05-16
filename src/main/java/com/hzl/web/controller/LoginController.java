package com.hzl.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Model model, HttpServletRequest request, HttpServletResponse response,
                        @RequestParam("username") String username,
                        @RequestParam("passwordhash") String password,
                        Map<String, Object> map) throws Exception {
        if (!StringUtils.isEmpty(username) && "admin".equals(password)) {
            request.getSession().setAttribute("loginUser", "5555");
            return "redirect:/main.html";
        } else {
            map.put("msg", "用户名密码错误");
            return "web/login";
        }
        //request.getRequestDispatcher("/login").forward(request, response);
    }

}
