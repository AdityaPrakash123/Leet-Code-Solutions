class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        for (int i=0;i< nums.length;i++){
            if (nums[i]==target){
                list.add(i);
                break;
            }
        }

        for (int i= nums.length-1;i>=0;i--){
            if (nums[i]==target){
                list.add(i);
                break;
            }
        }
        if (list.size()==0){
            list.add(-1);
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        for (int i=0;i< answer.length;i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
