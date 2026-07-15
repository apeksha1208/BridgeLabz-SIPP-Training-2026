package TwoSum_SlidingWindow;

public class MinimumWindowSubstring{
    static String minWindowSubstring(String s,String t){
        int[] count=new int[128];
        for(char c:t.toCharArray()){
            count[c]++;
        }
        int left=0,start=0,minLen=Integer.MAX_VALUE;
        int required=t.length();
        for(int right=0;right<s.length();right++){
            if(count[s.charAt(right)]>0){
                required--;
            }
            count[s.charAt(right)]--;
            while(required==0){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    start=left;
                }
                count[s.charAt(left)]++;
                if(count[s.charAt(left)]>0){
                    required++;
                }
                left++;
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+minLen);
    }
    public static void main(String[] args){
        System.out.println(minWindowSubstring("ADOBECODEBANC","ABC"));
    }
}