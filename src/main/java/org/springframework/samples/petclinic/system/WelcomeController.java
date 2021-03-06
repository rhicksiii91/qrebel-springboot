package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
class WelcomeController {

    private static final String MESSAGE = "> BEST DAY <";
//    private static final String MESSAGE = "> " + Days.TUESDAY.name() + " <";

    @GetMapping("/")
    public ModelAndView welcome() {
        ModelAndView model = new ModelAndView();
        model.addObject("day", MESSAGE);
        model.setViewName("welcome");
        return model;
    }

/*    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }*/
}
