class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int sIdx = 0;
        int qIdx = 0;
        int cnt = 0;
        int counter = 0;
        while (sIdx < sandwiches.length) {
            if (students[qIdx] == sandwiches[sIdx]) {
                cnt++;
                sIdx++;
                students[qIdx] = -1;
                counter = -1;
            } 
            qIdx = (qIdx + 1) % students.length;
            counter++;
            if (counter == students.length) break;
        }
        return students.length - cnt;
    }
}