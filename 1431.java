class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);
        int maxCandies = Integer.MIN_VALUE;
        for(int candie : candies) {
            if(maxCandies < candie) maxCandies = candie;
        }
        for (int candie : candies) {
            res.add(candie + extraCandies >= maxCandies);
        }
        return res;
    }
}