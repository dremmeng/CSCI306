// Authors: Drew Remmenga
// evenly spaced exercise
public boolean evenlySpaced(int a, int b, int c) {
  int ab = Math.abs(a - b);
  int bc = Math.abs(b - c);
  int ac = Math.abs(a - c);
  return (ab == bc && ac == ab + bc) || (ab == ac && bc == ab + ac) || (bc == ac && ab == ac + bc);
}
// Authors Chaptgpt
public boolean evenlySpaced(int a, int b, int c) {
        // Sort the numbers to find the smallest, middle, and largest
        int small = Math.min(a, Math.min(b, c));
        int large = Math.max(a, Math.max(b, c));
        int medium = a + b + c - small - large; // The remaining one is the medium
        
        // Check if the differences are equal
        return (medium - small) == (large - medium);
    }
/*

evenlySpaced(2, 4, 6) → true	true	OK	
evenlySpaced(4, 6, 2) → true	true	OK	
evenlySpaced(4, 6, 3) → false	false	OK	
evenlySpaced(6, 2, 4) → true	true	OK	
evenlySpaced(6, 2, 8) → false	false	OK	
evenlySpaced(2, 2, 2) → true	true	OK	
evenlySpaced(2, 2, 3) → false	false	OK	
evenlySpaced(9, 10, 11) → true	true	OK	
evenlySpaced(10, 9, 11) → true	true	OK	
evenlySpaced(10, 9, 9) → false	false	OK	
evenlySpaced(2, 4, 4) → false	false	OK	
evenlySpaced(2, 2, 4) → false	false	OK	
evenlySpaced(3, 6, 12) → false	false	OK	
evenlySpaced(12, 3, 6) → false	false	OK	
other tests
OK	
chat gpt
evenlySpaced(2, 4, 6) → true	true	OK	
evenlySpaced(4, 6, 2) → true	true	OK	
evenlySpaced(4, 6, 3) → false	false	OK	
evenlySpaced(6, 2, 4) → true	true	OK	
evenlySpaced(6, 2, 8) → false	false	OK	
evenlySpaced(2, 2, 2) → true	true	OK	
evenlySpaced(2, 2, 3) → false	false	OK	
evenlySpaced(9, 10, 11) → true	true	OK	
evenlySpaced(10, 9, 11) → true	true	OK	
evenlySpaced(10, 9, 9) → false	false	OK	
evenlySpaced(2, 4, 4) → false	false	OK	
evenlySpaced(2, 2, 4) → false	false	OK	
evenlySpaced(3, 6, 12) → false	false	OK	
evenlySpaced(12, 3, 6) → false	false	OK	
other tests
OK	

*/

// Authors: Drew Remmenga
// Plus Out
public String plusOut(String str, String word) {
      String res = "";
      int i = 0 ;
      while(i < str.length() ) {
         if (str.substring(i).startsWith(word)) {
            res = res + word;
            i = i + word.length();
         } else {
            res = res + "+";
            i++;
         }
      }

      return res;
}
// Authors Chatgpt
public String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        int wordLen = word.length();
        
        while (index < str.length()) {
            if (str.startsWith(word, index)) {
                // Add the word to the result
                result.append(word);
                index += wordLen;
            } else {
                // Add plus sign if the current part is not the word
                result.append('+');
                index++;
            }
        }
        
        return result.toString();
    }
}
/* 
plusOut("12xy34", "xy") → "++xy++"	"++xy++"	OK	
plusOut("12xy34", "1") → "1+++++"	"1+++++"	OK	
plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"	"++xy++xy+++xy"	OK	
plusOut("abXYabcXYZ", "ab") → "ab++ab++++"	"ab++ab++++"	OK	
plusOut("abXYabcXYZ", "abc") → "++++abc+++"	"++++abc+++"	OK	
plusOut("abXYabcXYZ", "XY") → "++XY+++XY+"	"++XY+++XY+"	OK	
plusOut("abXYxyzXYZ", "XYZ") → "+++++++XYZ"	"+++++++XYZ"	OK	
plusOut("--++ab", "++") → "++++++"	"++++++"	OK	
plusOut("aaxxxxbb", "xx") → "++xxxx++"	"++xxxx++"	OK	
plusOut("123123", "3") → "++3++3"	"++3++3"	OK	
other tests
OK	
chat gpt bad code
*/
// Authors Drew Remmenga
// Count clumps
public int countClumps(int[] nums) {
    int count = 0;
    for(int i = 0;i<nums.length-1;i++)
    {
        if(nums[i] == nums[i+1]&&(i==0||nums[i-1]!=nums[i]))
        {
            count++;
        }
    }
    return count;
}
// Authors Chatgpt
public int countClumps(int[] nums) {
        int clumps = 0;
        if (nums.length == 0) return clumps;

        boolean inClump = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (!inClump) {
                    // We found the start of a new clump
                    inClump = true;
                }
            } else {
                if (inClump) {
                    // We found the end of a clump
                    clumps++;
                    inClump = false;
                }
            }
        }
        
        // Check if we ended in a clump
        if (inClump) {
            clumps++;
        }

        return clumps;
    }
}
/*
countClumps([1, 2, 2, 3, 4, 4]) → 2	2	OK	
countClumps([1, 1, 2, 1, 1]) → 2	2	OK	
countClumps([1, 1, 1, 1, 1]) → 1	1	OK	
countClumps([1, 2, 3]) → 0	0	OK	
countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4	4	OK	
countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4	4	OK	
countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5	5	OK	
countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5	5	OK	
countClumps([]) → 0	0	OK	
other tests
OK	
Chat gpt bad code
*/
// Authors Drew Remmenga
// Fix 34
public int[] fix34(int[] nums) {
    int t=0;
    for(int i=0; i< nums.length ; i++){
        for(int j=0;j<nums.length ; j++){
            if(nums[i]==4 && nums[j]==3)
            {
                t=nums[j+1];
                nums[j+1]=nums[i];
                nums[i]=t;
            }
        }
    }
    return nums;
}
// Authors Chatgpt
    public int[] fix34(int[] nums) {
        int[] result = new int[nums.length];
        int[] fourPositions = new int[nums.length];
        int fourIndex = 0;
        
        // First, fill result array with `3`s and `4`s
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                result[i] = 3;
                // Mark position for `4` to place after this `3`
                fourPositions[fourIndex++] = i;
            }
        }
        
        // Place `4`s in positions immediately following `3`s
        int fourPosIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                // Find the next place to put `4`
                while (fourPosIndex < fourPositions.length && result[fourPositions[fourPosIndex]] != 3) {
                    fourPosIndex++;
                }
                if (fourPosIndex < fourPositions.length) {
                    result[fourPositions[fourPosIndex] + 1] = 4;
                }
            }
        }
        
        // Fill remaining positions with non `3` and `4` values
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 3 && nums[i] != 4) {
                while (index < nums.length && result[index] != 0) {
                    index++;
                }
                if (index < nums.length) {
                    result[index] = nums[i];
                }
            }
        }
        
        return result;
    }
/*
fix34([1, 3, 1, 4]) → [1, 3, 4, 1]	[1, 3, 4, 1]	OK	
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]	[1, 3, 4, 1, 1, 3, 4]	OK	
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]	[3, 4, 2, 2]	OK	
fix34([3, 2, 3, 2, 4, 4]) → [3, 4, 3, 4, 2, 2]	[3, 4, 3, 4, 2, 2]	OK	
fix34([2, 3, 2, 3, 2, 4, 4]) → [2, 3, 4, 3, 4, 2, 2]	[2, 3, 4, 3, 4, 2, 2]	OK	
fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) → [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]	[5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]	OK	
fix34([3, 1, 4]) → [3, 4, 1]	[3, 4, 1]	OK	
fix34([3, 4, 1]) → [3, 4, 1]	[3, 4, 1]	OK	
fix34([1, 1, 1]) → [1, 1, 1]	[1, 1, 1]	OK	
fix34([1]) → [1]	[1]	OK	
fix34([]) → []	[]	OK	
fix34([7, 3, 7, 7, 4]) → [7, 3, 4, 7, 7]	[7, 3, 4, 7, 7]	OK	
fix34([3, 1, 4, 3, 1, 4]) → [3, 4, 1, 3, 4, 1]	[3, 4, 1, 3, 4, 1]	OK	
fix34([3, 1, 1, 3, 4, 4]) → [3, 4, 1, 3, 4, 1]	[3, 4, 1, 3, 4, 1]	OK	
other tests OK
chat gpt bad code
*/