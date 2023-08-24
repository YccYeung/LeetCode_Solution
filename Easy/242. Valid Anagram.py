from collections import defaultdict
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        
        tracker = defaultdict(int)
        for v in s:
            tracker[v] += 1
        for v in t:
            tracker[v] -= 1
            
        return all(x==0 for x in tracker.values())
