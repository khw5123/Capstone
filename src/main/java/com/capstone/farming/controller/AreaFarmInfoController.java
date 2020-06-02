package com.capstone.farming.controller;

import com.capstone.farming.dao.AreaFarmInfoDAO;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Log4j
@Controller
public class AreaFarmInfoController {

    @Autowired
    AreaFarmInfoDAO areaFarmInfoDAO;
    //dao 전체정보가져오기
    //현재위치 클릭 시 -> ajax로 url 파라미터를 통해 해당지역 가져오기
    @GetMapping("/AreaFarmInfo")
    public String getAllAreaFarmInfo(Model model){
        //로그 추가하는 법 알기
        model.addAttribute("shippingAreaList", areaFarmInfoDAO.findAll());
        return "AreaFarmInfo";
    }
}