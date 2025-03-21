class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        prev_count = 0
        total = 0
        
        for row in bank:
            # Count devices in current row more efficiently using built-in methods
            curr_count = row.count('1')
            
            # Skip rows with no devices
            if curr_count == 0:
                continue
                
            # Calculate beams between previous row with devices and current row
            total += prev_count * curr_count
            
            # Update previous count for next iteration
            prev_count = curr_count
        
        return total