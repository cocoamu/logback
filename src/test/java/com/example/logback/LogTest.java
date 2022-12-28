package com.example.logback;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@Slf4j
public class LogTest {
    @Test
    public void test(){
        Map<String, String> user = new HashMap<>();
        user.put("user_id", "123456");
        user.put("mobile", "18888888888");
        user.put("address", "朝阳区百子湾街道某小区1单元101");
        user.put("city", "北京市");
        user.put("country", "中国");
        user.put("email", "heiz123@163.com");
        log.info("customer info: {}", JSON.toJSONString(user));
    }
}
