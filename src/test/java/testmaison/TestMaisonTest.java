package testmaison;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestMaisonTest {
	
	@Test
	public void partition_partitionEmptyListAndZeroSplitLength_EmptyResult() {
		List<Integer> emptyList = new ArrayList<Integer>();
		int splitLength = 0;
		ListPartitionManager testMaison = new ListPartitionManager();
		List<List<Integer>> result = testMaison.partition(emptyList, splitLength);
		assertEquals(0, result.size());
	}
	
	@Test
	public void partition_partitionNullListAndSplitLength3_EmptyResult() {
		List<Integer> list = null;
		int splitLength = 3;
		ListPartitionManager testMaison = new ListPartitionManager();
		List<List<Integer>> result = testMaison.partition(list, splitLength);
		assertEquals(0, result.size());
	}
	
	@Test
	public void partition_partitionListOf10ElementAndSplitLength3_ListOf4Parts() {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		int splitLength = 3;
		ListPartitionManager testMaison = new ListPartitionManager();
		List<List<Integer>> result = testMaison.partition(list, splitLength);
		assertEquals(4, result.size());
	}
	
	@Test
	public void partition_partitionListOf10ElementAndSplitLength11_ListOf1Part() {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		int splitLength = 11;
		ListPartitionManager testMaison = new ListPartitionManager();
		List<List<Integer>> result = testMaison.partition(list, splitLength);
		assertEquals(1, result.size());
	}

}
