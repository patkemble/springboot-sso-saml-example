package com.davita.sso;

import org.springframework.stereotype.Controller;

/**
 * Created by pkemble on 4/24/17.
 */
@Controller
public class IndexController {

    public String index() {
        return "index";
    }
}
