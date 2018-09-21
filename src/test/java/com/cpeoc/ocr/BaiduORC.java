package com.cpeoc.ocr;

import java.util.HashMap;

import org.json.JSONObject;

import com.baidu.aip.ocr.AipOcr;

public class BaiduORC {
	 //设置APPID/AK/SK
    public static final String APP_ID = "11473218";
    public static final String API_KEY = "vNkeGDaIcMllamD6t9BO55VQ";
    public static final String SECRET_KEY = "SILGs8QKUiWWbrCk1179dAc86tGQr4uM";

    public static void main(String[] args) {
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
       
        //参数
        HashMap<String, String> options = new HashMap<String, String>();
//        options.put("language_type", "CHN_ENG");
//        options.put("detect_direction", "true");
//        options.put("detect_language", "true");
//        options.put("probability", "true");
//        HashMap<String, String> options = new HashMap<String, String>();
//        options.put("recognize_granularity", "big");
//        options.put("language_type", "CHN_ENG");
//        options.put("detect_direction", "true");
//        options.put("detect_language", "true");
//        options.put("vertexes_location", "true");
//        options.put("probability", "true");
        
        
        // 调用接口
        //String image = "test.jpg";
        String image = "kaptcha.jpg";
        //JSONObject res = client.basicGeneral(image, options);
        JSONObject res = client.basicAccurateGeneral(image, options);
        //JSONObject res = client.general(image, options);
        System.out.println(res.toString(2));

    }
}
