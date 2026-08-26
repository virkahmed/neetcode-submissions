class Solution {
    // times[()] buff[()] time = 3 champ = {3, 4}
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<double[]> times = new Stack<>();
        for (int i = 0; i < position.length; i++) { 
            Stack<double[]> buff = new Stack<>();
            double time = ((double)target  - position[i])/speed[i];
            double[] champ = {time, position[i]};
            while (!times.isEmpty()) { 
                if (times.peek()[0] <= champ[0] && times.peek()[1] <= champ[1]) { 
                    times.pop();
                    

                }
                else { 
                    if (times.peek()[0] >= champ[0] && times.peek()[1] >= champ[1]) { 
                        champ = times.pop();

                    }
                    else { 
                        buff.push(times.pop());
                    }
                }
            }
            times = buff;
            times.push(champ);


        }
        return times.size();
    }
}
