class Solution {
public:
  int func(vector<vector<int>>& events, int k, int idx, vector<vector<int>>& memo) {
    if(idx == events.size() || k == 0){
      return 0;
    }
    if(memo[idx][k] != -1)
      return memo[idx][k];
    vector<int> tmp = {events[idx][1], INT_MAX, INT_MAX};
    int i = upper_bound(events.begin() + idx + 1, events.end(), tmp) - events.begin();
    return memo[idx][k] = max(func(events, k - 1, i, memo) + events[idx][2], func(events, k, idx + 1, memo));
  }
  int maxValue(vector<vector<int>>& events, int k) {
    sort(events.begin(), events.end());
    int n = events.size();
    vector<vector<int>> memo(n + 1, vector<int>(k + 1, -1));
    int ans = func(events, k, 0, memo);
    return ans;      
  }
};