package com.oriental.bitcoin.controller;

import com.oriental.bitcoin.model.AccountDTO;
import com.oriental.bitcoin.service.AccountDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
@Service
@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RequiredArgsConstructor
public class MemberController {

    @Autowired
    private AccountDAO aDAO;

    @PostMapping("/login")
    @ResponseBody
    public AccountDTO login(HttpServletRequest req, AccountDTO ac) {
        return aDAO.MakeLogin(req, ac);
    }

    @PostMapping("/SignUp")
    @ResponseBody
    public int SignUp(HttpServletRequest req, AccountDTO ac) {
        return aDAO.MakeSignUp(req, ac);
    }

}
