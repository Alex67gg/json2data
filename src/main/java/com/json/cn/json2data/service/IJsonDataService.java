package com.json.cn.json2data.service;

import com.json.cn.json2data.vo.JsonDataVO;

import java.io.IOException;
import java.util.List;

public interface IJsonDataService {
    List<JsonDataVO> getJsonData() throws IOException;
}
