package club.wyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/echarts")
    public String echarts(Model model) {
        System.out.println("IndexController.echarts");
        return "echarts";
    }

}
