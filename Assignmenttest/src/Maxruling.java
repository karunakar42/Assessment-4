public class Solution {
	class Solution 
{
    
    public static int maxMeetings(int start[], int end[], int n)
    {
       
        
        ArrayList<meeting> meet = new ArrayList<>();
        
        for(int i=0;i<start.length;i++){
            meet.add(new meeting(start[i],end[i],i+1));
        }
        
        meetingcom mc = new meetingcom();
        
        Collections.sort(meet,mc);
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(meet.get(0).start);
        int limit = meet.get(0).end;
        
        for(int i=1;i<start.length;i++){
            if(meet.get(i).start > limit){
                limit = meet.get(i).end;
                ans.add(meet.get(i).pos);
            }
        }
        
        return ans.size();
        
    }
}

public class Maxruling{
    int start;
    int end;
    int pos;
    
    public meeting(int start, int end, int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

 class meetingcom implements Comparator<meeting>{
    
    public int compare(meeting o1, meeting o2){
        if(o1.end < o2.end){
        return -1;
        
    }
    else if(o1.end>o2.end){
        return 1;
        
    }else if(o1.pos<o2.pos){return -1;}
    
    return 1;
    }
}