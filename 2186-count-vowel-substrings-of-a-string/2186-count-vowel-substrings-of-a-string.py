class Solution:
    def countVowelSubstrings(self, word: str) -> int:
        vowels = set("aeiou")
        n = len(word)
        total = 0
        i = 0

        # Process only continuous blocks of vowels
        while i < n:
            if word[i] not in vowels:
                i += 1
                continue

            j = i
            while j < n and word[j] in vowels:
                j += 1
            # Count valid substrings within this vowel block
            total += self._countValidSubstrings(word[i:j])
            i = j

        return total

    def _countValidSubstrings(self, s: str) -> int:
        total = 0
        count = {}
        left = 0
        # Expand the sliding window
        for right in range(len(s)):
            count[s[right]] = count.get(s[right], 0) + 1

            # When the window contains all five vowels, 
            # every extension to the right remains valid.
            while len(count) == 5:
                total += len(s) - right
                count[s[left]] -= 1
                if count[s[left]] == 0:
                    del count[s[left]]
                left += 1

        return total
