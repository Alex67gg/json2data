package com.json.cn.json2data.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.json.cn.json2data.service.IJsonDataService;
import com.json.cn.json2data.vo.JsonDataVO;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Service
public class JsonDataService implements IJsonDataService{

    @Override
    public List<JsonDataVO> getJsonData() throws IOException {
        /**
         * 获取json数据，为了掩饰方便，实际开发中一般是从其他接口中获取
         */
        List<JsonDataVO> jsonDataVOList = new ArrayList<>();
        String jsonData = FileUtils.readFileToString(ResourceUtils.getFile("classpath:cmp2.json"));
        JSONObject jsonObject = JSONObject.parseObject(jsonData);
        JSONArray jsonArray = jsonObject.getJSONArray("rows");
        for (int i = 0,j=jsonArray.size(); i <j ; i++) {
            JSONArray jsonArray1 = jsonArray.getJSONArray(1);
            JsonDataVO jsonDataVO = new JsonDataVO();
            jsonDataVO.setId(jsonArray1.getInteger(0));
            jsonDataVO.setName(jsonArray1.getString(1));
            jsonDataVO.setType(jsonArray1.getString(2));
            jsonDataVO.setItype(jsonArray1.getInteger(3));
            jsonDataVOList.add(jsonDataVO);
        }
        return jsonDataVOList;
    }
}
