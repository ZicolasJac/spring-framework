package ds.zjc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LeetCodeTest {

	@Test
	public void testChu() {
		int[] nums = {-1, 0, 3, 5, 9, 12};
		int target = 120;

		int result = -1;

		int loop = nums.length / 2;
		while (true) {
			if (target == nums[loop]) {
				result = loop;
				break;
			}
			if (target < nums[loop]) {
				if (loop == 0) {
					break;
				}
				loop = loop / 2;
				continue;
			}

			if (target > nums[loop]) {
				if (loop == (nums.length - 1)) {
					break;
				}
				loop = (loop + nums.length) / 2;
			}
		}

		System.out.println("目标下标是:" + result);
	}

	@Test
	public void testChu2() {
		int[] nums = {-1, 0, 3, 5, 9, 12};
		int target = -1;

		int result = -1;

		int left = 0, right = nums.length - 1;
		while (left <= right) {
			int mid = (right + left) / 2;
			if (nums[mid] == target) {
				result = mid;
				break;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		System.out.println(result);
	}
}
