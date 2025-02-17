package com.ptteng.controller;

import com.ptteng.model.Occupation;
import com.ptteng.model.Student;
import com.ptteng.service.OccupationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping
public class HomeController {

    @Autowired
    OccupationService occupationService;

    @RequestMapping(value = "/home1")
    public String home(Model model) throws Exception {
        List<Student> students = occupationService.get1();
        model.addAttribute("list", students);
        return "home";
    }

    @RequestMapping(value = "/u")
    public String u() throws Exception {
        return "home2";
    }

    @RequestMapping(value = "/u/home2")
    public String home2() throws Exception {
        return "home2";
    }

    @RequestMapping(value = "/home3", method = RequestMethod.GET)
    public String home3(Model model) throws Exception {
        List<Occupation> list = list = occupationService.get();
        model.addAttribute("list", list);
        return "home3";
    }
}
