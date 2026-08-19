import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CinemaSeat {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int count = 0;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int[] resSeats:reservedSeats){
            int r = resSeats[0];
            int c = resSeats[1];
            map.computeIfAbsent(r-1,x->new ArrayList<>()).add(c-1);
        }
        int seen_row = 0;
        for(int k:map.keySet()){
            List<Integer> exists = map.get(k);
            seen_row++;
            boolean valid1 = true;
            for(int i=1;i<5;i++){
                if(exists.contains(i)){
                    valid1 = false;
                    break;
                }
            }
            boolean valid2 = true;
            for(int i=3;i<7;i++){
                if(exists.contains(i)){
                    valid2 = false;
                    break;
                }
            }
            boolean valid3 = true;
            for(int i=5;i<9;i++){
                if(exists.contains(i)){
                    valid3 = false;
                    break;
                }
            }
            int option1 = valid2?1:0;
            int option2 = (valid1?1:0) + (valid3?1:0);
            count += Math.max(option1,option2);
        }
        return count+(int)((long)n-seen_row)*2;
    }
}