package exercise.lifeBoat;
import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = people.length;
        int big = people.length - 1;
        
        Arrays.sort(people);
        
        for(int small = 0; small < big; big--)
        {
            if(people[small] + people[big] <= limit)
            {
                small++;
                answer--;
            }
        }
        
        
        return answer;
    }
}