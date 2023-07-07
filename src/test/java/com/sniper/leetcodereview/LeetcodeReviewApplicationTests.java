package com.sniper.leetcodereview;

import com.sniper.leetcodereview.init.InitData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LeetcodeReviewApplicationTests {

    @Autowired
    private InitData initData;

    /**
     * 随机获取
     */
    @Test
    public void findAny() {
        initData.init(null);
    }

    /**
     * 指定题目获取 模糊匹配
     */
    @Test
    public void findOne(){
        initData.init("两数");
    }

}
