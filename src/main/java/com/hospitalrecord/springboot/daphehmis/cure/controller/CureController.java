package com.mh.trektrekker.daphehmis.cure.controller;

import com.mh.trektrekker.daphehmis.cure.service.CureService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class CureController {

    private final CureService cureService;

    @GetMapping("/cure")
    public String getCureDashboard(ModelMap map) {
        map.put("users", cureService.getCureNeededUser());
        //map.put("users", cureService.getUserFromMobileNum());
        return "" +
                "";
    }
}
