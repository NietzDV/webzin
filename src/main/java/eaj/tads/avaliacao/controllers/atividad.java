package eaj.tads.avaliacao.controllers;

import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Controller
public class atividad{

@RequestMapping(value = "/pl")

    @GetMapping
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
    var writter = response.getWriter();
    writter.println("hello from GET");
    writter.close();
    }






}
