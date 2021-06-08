class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {};
        answer = new int[2];
        int count = 0;
        int flag = 0;
        int number = 0;
        int turn = 0;
        
        count++;
        turn++;
        number++;
        
        for(int i=1; i<words.length; i++)
        {
            number++;
            count++;
            
            if(i % n == 0)
            {
                number = 1;
                turn++;
            }
            
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0))
            {
                
                break;
            }
                
            
            for(int j=0; j<i; j++)
            {
                if(words[j].equals(words[i]))
                    flag++;
            }
            
            if(flag > 0)
                break;
        }
        
        if(count == words.length && flag == 0)
        {
           answer[0] = 0;
           answer[1] = 0;
        }
        else
        {
            answer[0] = number;
            answer[1] = turn;
        }

        return answer;
    }
}