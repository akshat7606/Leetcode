import java.util.Arrays;
import java.util.HashMap;

class prisonAfterNDays{
    public static int[] prisonAfterNDays(int[] cells, int N) {
        if (cells == null || cells.length == 0) {
            return cells;
        }
        HashMap<String , Integer> map = new HashMap<>();

        while(N>0){
            int[] result = new int[cells.length];
            map.put(Arrays.toString(cells), N--);

            for(int i=1 ; i<cells.length-1 ; i++){
                result[i] = cells[i-1]==cells[i+1]?1:0;
            }
            cells = result;
            if(map.containsKey(Arrays.toString(cells))){
                N%=map.get(Arrays.toString(cells))-N;
            }

        }
        return cells;
    }
    public static void main(String[] args) {
        int[] cells = {1,0,0,1,0,0,1,0};
        int N = 1000000000;
        System.out.println(prisonAfterNDays.prisonAfterNDays(cells , N));
    }
}