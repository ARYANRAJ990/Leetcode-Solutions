class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // declare hashset wthat will hold window
        Set<Integer> window = new HashSet<Integer>();
        // iterate over nums array
        for(int i = 0; i < nums.length; i++) {
            // check if current index is greater than k, if true then on each iteration remove leftmost element from set
            if(i > k) window.remove(nums[i - k - 1]);
            // try to add element to our window add method will return false if element already in the set, if it's in the set return true
            if(!window.add(nums[i])) return true;
        }
        // return false at the end
        return false;
    }
}