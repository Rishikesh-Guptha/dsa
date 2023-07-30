package dsa.arrays.array_problems;
//Easy level problem
//A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
//You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
//Return the number of indices where heights[i] != expected[i].
public class Height_checker {
    public int heightChecker(int[] heights) {
        int[] heights2 = new int[heights.length];
        for (int i=0;i<heights.length;i++){
            heights2[i]=heights[i];
        }
        int count=0;
        Arrays.sort(heights);
        for (int i=0;i<heights.length;i++){
            if(heights[i]==heights2[i]){
                continue;
            }
            else{
                count+=1;
            }
        }
        return count;

    }
}
