class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int richest = 0;

        for (const auto& customer : accounts) {
            int wealth = 0;
            for (int money : customer) {
                wealth += money;
            }
            richest = max(richest, wealth);
        }

        return richest;
    }
};
