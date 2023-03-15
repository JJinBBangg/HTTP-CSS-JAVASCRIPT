package ex.leetcode;

import java.util.*;

public class Exam2215 {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int i : nums1) {
			set1.add(i);
		}
		for (int i : nums2) {
			set2.add(i);
		}
		List<Integer> list1 = new ArrayList<>(); 
		List<Integer> list2 = new ArrayList<>(); 
		list1.addAll(set1);
		list2.addAll(set2);
		list1.removeIf(set2::contains);
		list2.removeIf(set1::contains);
		
		return List.of(list1, list2);

//		List<List<Integer>> list = new ArrayList<>(findDifference(nums1, nums2));
//		list.get(0).retainAll(list.get(1));
//		for (int i = 0; i < nums1.length; i++) {
//			for (int j = 0; j < nums2.length; j++) {
//				if (nums1[i] == nums2[j]) {
//					list.get(0).remove(nums1[i]);
//					list.get(1).remove(nums1[j]);
//				}
//			}
//		}
//		return list;
	}
}
