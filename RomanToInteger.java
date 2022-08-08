class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> romanToInteger = new HashMap<String, Integer>();
        romanToInteger.put("I",1);
        romanToInteger.put("V",5);
        romanToInteger.put("X",10);
        romanToInteger.put("L",50);
        romanToInteger.put("C",100);
        romanToInteger.put("D",500);
        romanToInteger.put("M",1000);


        int count =0;
        for (int i=0;i<s.length();i++){
            if (s.contains("IV")){
                s = s.replace("IV","IIII");
            }

            if (s.contains("IX")){
                s = s.replace("IX","IIIIIIIII");
            }

            if (s.contains("XL")){
                s = s.replace("XL","XXXX");
            }

            if (s.contains("XC")){
                s = s.replace("XC","XXXXXXXXX");
            }

            if (s.contains("CD")){
                s = s.replace("CD","CCCC");
            }

            if (s.contains("CM")){
                s = s.replace("CM","CCCCCCCCC");
            }

        }

        for (int i=0;i<s.length();i++){
            if (romanToInteger.keySet().contains(""+s.charAt(i))){
                count+=romanToInteger.get(""+s.charAt(i));
            }
        }
        return count;  
    }
}
