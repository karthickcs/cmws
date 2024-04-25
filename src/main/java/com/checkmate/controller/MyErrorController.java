package com.checkmate.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController  {

    @RequestMapping("/error")
    public void handleError(HttpServletResponse response) throws IOException {
        response.sendRedirect("/cmag/index.html");
    }

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "cmag/index.html";
	}
}