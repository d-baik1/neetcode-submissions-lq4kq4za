class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):        #if string s is not equal to string t
            return False            #return false 
        
        return sorted(s) == sorted(t)       #return 