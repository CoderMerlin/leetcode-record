package com.hm.leetcode.t0349;


import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 题目：两个数组的交集
 给定两个数组，编写一个函数来计算它们的交集。



 示例 1：

 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 输出：[2]
 示例 2：

 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 输出：[9,4]


 说明：

 输出结果中的每个元素一定是唯一的。
 我们可以不考虑输出结果的顺序。
 */
class Solution {
    /**
     * 欢迎关注公众号：Coder编程
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> collect1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> collect2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        collect1.retainAll(collect2);
        return collect1.stream().mapToInt(Integer::valueOf).toArray();
    }
}