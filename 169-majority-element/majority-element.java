import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Integer> getCounts(int[] nums) {
//sourabh
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();

        for (int num : nums) {

            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }

        return counts;
    }
    
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> counts = getCounts(nums);

        Map.Entry<Integer, Integer> majority = null;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {

            if (majority == null ||
                entry.getValue() > majority.getValue()) {

                majority = entry;
            }
        }

        return majority.getKey();
    }
}