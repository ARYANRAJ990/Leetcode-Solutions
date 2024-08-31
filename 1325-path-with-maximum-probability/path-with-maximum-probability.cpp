class Solution {
public:
    double maxProbability(int n, vector<vector<int>>& edges, vector<double>& succProb, int start_node, int end_node) {

        // Create adjacency list where each node has a list of pairs (neighbor, probability)
        vector<vector<pair<int, double>>> adj(n);
        
        // Initialize the probability of reaching each node as 0, except the start node which is 1.
        vector<double> prob(n, 0.0);
        prob[start_node] = 1.0;
        
        // Fill the adjacency list with the edges and their corresponding success probabilities
        for (int i = 0; i < edges.size(); i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double w = succProb[i];

            adj[u].push_back({v, w});
            adj[v].push_back({u, w});
        }

        // Max-heap priority queue to get the node with the maximum probability at each step
        priority_queue<pair<double, int>> pq;
        pq.push({1.0, start_node});  // Start with the start node and probability 1.0

        // Dijkstra's algorithm loop
        while (!pq.empty()) {
            double currProb = pq.top().first;
            int node = pq.top().second;
            pq.pop();

            // If we reach the end node, return the probability
            if (node == end_node) return currProb;

            // Process all neighbors
            for (auto& neighbour : adj[node]) {
                int adjNode = neighbour.first;
                double neighbourProb = neighbour.second;

                // If we found a path to adjNode with a higher probability, update it
                if (currProb * neighbourProb > prob[adjNode]) {
                    prob[adjNode] = currProb * neighbourProb;
                    pq.push({prob[adjNode], adjNode});
                }
            }
        }

        // If we can't reach the end node, return 0.0
        return 0.0;
    }
};