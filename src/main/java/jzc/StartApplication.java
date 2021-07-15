package jzc;

import jzc.cn.SearchOtInfo;
import jzc.cn.service.OtService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lhl98
 */

@RestController
@SpringBootApplication
@MapperScan("jzc.cn.mapper")
public class StartApplication {

    @Autowired
    OtService otService;

    @PostMapping("/")
    @ResponseBody
    public String index(@RequestBody SearchOtInfo searchOtInfo) {
        System.out.println(otService.selectOne(3).toString() + "");

//        SearchOtInfo searchOtInfo1=new SearchOtInfo();
//        searchOtInfo1.setStartTimeScreening(searchOtInfo.getStartTime());
//        searchOtInfo1.setEndTimeScreening(searchOtInfo.getEndTime());
//
//        System.out.println(otService.selectList(searchOtInfo1));
        return "config client";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
