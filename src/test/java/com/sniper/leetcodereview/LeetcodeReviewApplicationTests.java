package com.sniper.leetcodereview;

import com.sniper.leetcodereview.init.InitData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LeetcodeReviewApplicationTests {

    @Autowired
    private InitData initData;

    @Test
    public void init() {
        initData.init();
    }

}
