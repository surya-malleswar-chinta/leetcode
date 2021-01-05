class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = 0;
            if (map.get(num) != null) count = map.get(num);
            map.put(num, count+1);
        }
        Map<Integer,List<Integer>> freqMap = new TreeMap<>();
        for (int num : nums) {
            List<Integer> list = new ArrayList<>();
            int freq = map.get(num);
            if (freqMap.get(freq) != null) list = freqMap.get(freq);
            list.add(num);
            freqMap.put(freq, list);
        }
        int[] res = new int[nums.length];
        int count = 0;
        for (int freq : freqMap.keySet()) {
            List<Integer> list = freqMap.get(freq);
            Collections.sort(list, Collections.reverseOrder()); 
            for (int num : list) res[count++] = num;
        }
        
        return res;
    }
}