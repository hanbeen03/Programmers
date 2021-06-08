package exercise.gameTournament;

public class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        while(true)
        {
            if(a%2 == 1)
                a++;
            if(b%2 == 1)
                b++;
            
            if(a/2 == b/2)
            {
                answer++;
                break;
            }
            else if(a/2 != b/2)
            {
                a /= 2;
                b /= 2;
                answer++;
            }
        }

        return answer;
    }
}
