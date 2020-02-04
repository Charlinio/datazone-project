package com.charl.datazone.project.controllers;

import com.charl.datazone.project.utility.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = UrlConstants.INDEX)
public class IndexController {

    @GetMapping(path = UrlConstants.INDEX)
    public String goIndex() {
        return "Index";
    }
}
