package com.sniper.leetcodereview.init;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileAppender;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.sniper.leetcodereview.common.Result;
import com.sniper.leetcodereview.entity.Algorithm;
import com.sniper.leetcodereview.entity.dto.AlgorithmDTO;
import com.sniper.leetcodereview.enums.ResultEnums;
import com.sniper.leetcodereview.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Optional;

/**
 * @Description TODO
 * @Author sniper
 * @Date 2023/6/19 11:48 PM
 **/
@Component
public class InitData {

    @Autowired
    private AlgorithmService algorithmService;

    public void init(String topic) {
        Result<Algorithm> result = algorithmService.findOne(topic);
        Algorithm algorithm = result.getData();
        if (ObjectUtil.isEmpty(algorithm)){
            return;
        }
        System.out.println(algorithm.getTopic());
        StringBuilder builder = new StringBuilder();
        StringBuilder path = builder
                .append("src").append(File.separator).append("main").append(File.separator).append("java")
                .append(File.separator).append("com").append(File.separator).append("sniper").append(File.separator)
                .append("leetcodereview").append(File.separator).append("AlgorithmTest.java");
        File file = new File(path.toString());
        if (file.exists()){
            file.delete();
        }
        FileAppender appender = new FileAppender(file, 16,true);
        appender.append("package com.sniper.leetcodereview;");
        appender.append("\n");

        appender.append("/*");
        appender.append("题目："+algorithm.getTopic());
        appender.append("\n");
        appender.append("难度："+algorithm.getDifficulty());
        appender.append("\n");
        appender.append("内容："+algorithm.getContent().replace(" ",""));
        appender.append("\n");
        appender.append(algorithm.getExample().replace(" ",""));
        appender.append("\n");
        appender.append("提示：");
        appender.append(algorithm.getTip());
        if (StrUtil.isNotEmpty(algorithm.getRemark())){
            appender.append("备注：");
            appender.append(algorithm.getRemark());
        }
        appender.append("*/");

        appender.append("public class AlgorithmTest {");
        appender.append("\tpublic static void main(String[] args) {");
        appender.append("\t}");
        appender.append("\tpublic static "+algorithm.getResult()+" test("+algorithm.getParam()+") {");
        if (ResultEnums.get(algorithm.getResult().trim()) == null){
            appender.append("\t\treturn null;");
        }else if (ResultEnums.get(algorithm.getResult().trim()).getCode().equals("boolean")){
            appender.append("\t\treturn true;");
        }else{
            appender.append("\t\treturn 0;");
        }
        appender.append("\t}");
        appender.append("}");
        appender.flush();
    }


}
