class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<>();
        if (numRows == 0) return sol;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> curList = levelList(list);
            sol.add(curList);
            list = curList;
        }
        return sol;
    }
    
    List<Integer> levelList(List<Integer> prevList) {
        int size = prevList.size()+1;
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == size-1) list.add(1);
            else list.add(prevList.get(i) + prevList.get(i-1));
        }
        return list;
    }
}