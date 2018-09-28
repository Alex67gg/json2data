package com.json.cn.json2data.controller;

import com.json.cn.json2data.service.impl.JsonDataService;
import com.json.cn.json2data.vo.JsonDataVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex5467
 */
@RestController
@Api(value = "全局设置", tags = {"全局设置接口"})
public class JsonDataController {
    @Autowired
    private JsonDataService jsonDataService;
    /**
     * 初始化：
     * @param
     */
    @ApiOperation(value = "初始controller", notes = "初始controller")
    @GetMapping(value = "/init")
    public String deleteQA() {
        return "Hello World";
    }
    @ApiOperation(value = "处理json数据", notes = "处理json数据")
    @GetMapping(value = "/jsondatas")
    public List<JsonDataVO> jsonData2Entity(){
        List<JsonDataVO> jsonDataServiceList = new ArrayList<>();
        try {
            jsonDataServiceList = jsonDataService.getJsonData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonDataServiceList;
    }
}
