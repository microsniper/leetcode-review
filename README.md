# 项目介绍
**是否LeetCode刷过的题总是忘记？ 该项目主打算法题的复习，将做过的算法题添加到数据库中，然后在idea中随机获取一道题，就可以复习了，再也不需要打开LeetCode官网了**

# 技术栈
**前端**

 技术 | 说明   | 官网                        
 ---- |------|---------------------------  
 Vue  | 前端框架 | https://vuejs.org/        
 Vue-router | 路由框架 | https://router.vuejs.org/ 
Element| 前端UI框架     | https://element.eleme.io |


**后端**

技术 | 说明   | 官网                        
---- |------|---------------------------  
SpringBoot  | Web应用开发框架 | https://spring.io/projects/spring-boot  
Mybatis-Plus | ORM框架 | https://mybatis.plus/guide/

**开发环境**

工具 | 版本号      | 下载                        
---- |----------|---------------------------  
JDK  | 1.8      | https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Mysql | 5.7      | https://www.mysql.com/



# 项目演示
Vue项目地址：https://github.com/microsniper/algorithm

![图片名称](http://sniper-blog.oss-cn-beijing.aliyuncs.com/blogImage/leetcode-review-/1687879463-leetcode-review-01.png)

支持简单的搜索，添加，修改，删除（物理删除）
## 添加或修改

![图片名称](http://sniper-blog.oss-cn-beijing.aliyuncs.com/blogImage/leetcode-review-/1687879841-leetcode-review-02.png)
只需要将对应的信息填入即可。

# idea演示
修改 application.yml 中数据库信息。

找到单元测试类,执行 `init()` 方法,会在 `com.sniper.leetcodereview` 包下随机获取一道题生成一个 `AlgorithmTest`类
![图片地址](http://sniper-blog.oss-cn-beijing.aliyuncs.com/blogImage/leetcode-review-/1687880216-leetcode-review-03.png)

![图片地址](http://sniper-blog.oss-cn-beijing.aliyuncs.com/blogImage/leetcode-review-/1687880566-leetcode-review-04.png)

此时就可以愉快的做题了！！

`如果感觉不错，给个 star 吧`

`如果有想法或更好的介意，欢迎留言讨论`