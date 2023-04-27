import java.util.Arrays;
import java.util.HashMap;

public class LargestTree {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		HashMap<Integer, Integer> forest = new HashMap<Integer, Integer>();	
		forest.put(2, 10);
		forest.put(3, 2);
		forest.put(4, 3);
		forest.put(6, 5);
		forest.put(7, 6);
		System.out.println(largestTree(forest));
	}

	public static int largestTree(HashMap<Integer, Integer> forest) {
// Create a variable to keep track of largest element in the forest
		int maxElement = -1;
// Map to store all the unique parents as key in the given forest with value as
// number of childrenF
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int key : forest.keySet()) {
			if (!forest.keySet().contains(forest.get(key))) {
				map.put(forest.get(key), 0);
			}
			maxElement = Math.max(maxElement, Math.max(key, forest.get(key)));
		}
// Parent Array to store the address of the immediate parent of the ith node
		int[] parent = new int[maxElement + 1];
		Arrays.fill(parent, -1);
// Assigning the value
		for (int key : map.keySet()) {
			parent[key] = key;
		}
		for (int key : forest.keySet()) {
			parent[key] = forest.get(key);
		}
		int max = 0;
		for (int i = 0; i <= maxElement; i++) {
			if (parent[i] != -1) {
				parent[i] = getParent(i, parent);
				map.put(parent[i], map.get(parent[i]) + 1);
				max = Math.max(max, map.get(parent[i]));
			}
		}
		int res = Integer.MAX_VALUE;
		for (int key : map.keySet()) {
			if (map.get(key) == max) {
				res = Math.min(res, key);
			}
		}
		return res;
	}

// Method to get the parent for a given node
	public static int getParent(int x, int[] parent) {
		if (parent[x] != x) {
			return getParent(parent[x], parent);
		}
		return x;
	}
}