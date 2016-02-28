package com.home;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Nirav on 30-01-2016.
 */
public class HomePageController extends MultiActionController {

    public ModelAndView showHomePage(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        ModelAndView view = new ModelAndView();
        String page = "home";
        view.setViewName(page);
        return view;
    }
}
