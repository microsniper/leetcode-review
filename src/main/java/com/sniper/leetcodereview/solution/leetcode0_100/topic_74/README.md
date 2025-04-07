

<!-- problem:start -->

# [74. 搜索二维矩阵](https://leetcode.cn/problems/search-a-2d-matrix)

二分查找
二维转一维  
    matrix[x][y]
    i = x * col + y

一维转二维
    nums[i]
    x = i / col;
    y = i % col;
## 题目描述

<!-- description:start -->

<p>给你一个满足下述两条属性的 <code>m x n</code> 整数矩阵：</p>

<ul>
	<li>每行中的整数从左到右按非严格递增顺序排列。</li>
	<li>每行的第一个整数大于前一行的最后一个整数。</li>
</ul>

<p>给你一个整数 <code>target</code> ，如果 <code>target</code> 在矩阵中，返回 <code>true</code> ；否则，返回 <code>false</code> 。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/0000-0099/0074.Search%20a%202D%20Matrix/images/mat.jpg" style="width: 322px; height: 242px;" />
<pre>
<strong>输入：</strong>matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
<strong>输出：</strong>true
</pre>

<p><strong>示例 2：</strong></p>
<img alt="" src="https://fastly.jsdelivr.net/gh/doocs/leetcode@main/solution/0000-0099/0074.Search%20a%202D%20Matrix/images/mat2.jpg" style="width: 322px; height: 242px;" />
<pre>
<strong>输入：</strong>matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
<strong>输出：</strong>false
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li><code>m == matrix.length</code></li>
	<li><code>n == matrix[i].length</code></li>
	<li><code>1 &lt;= m, n &lt;= 100</code></li>
	<li><code>-10<sup>4</sup> &lt;= matrix[i][j], target &lt;= 10<sup>4</sup></code></li>
</ul>

<!-- description:end -->
