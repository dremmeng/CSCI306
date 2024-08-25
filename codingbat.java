/*
ten run
Author Drew Remmenga
*/
public int[] tenRun(int[] nums) {
    for (int i=0; i<nums.length; i++) {
        if (nums[i] % 10 == 0){
            while (i<nums.length-1 && nums[i+1] % 10 != 0) {
                nums[i+1]=nums[i];
                i++;
                }
            }
    }
    return nums;
}
// Athor Chatpgt
    public int[] tenRun(int[] nums) {
        if (nums.length == 0) return nums;
        
        int lastTen = -1; // Track the last multiple of 10 seen
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                lastTen = nums[i];
            } else if (lastTen != -1) {
                nums[i] = lastTen;
            }
        }
        
        return nums;
    }
/*
tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]	[2, 10, 10, 10, 20, 20]	OK	
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]	[10, 10, 20, 20]	OK	
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]	[10, 10, 10, 20]	OK	
tenRun([1, 2, 50, 1]) → [1, 2, 50, 50]	[1, 2, 50, 50]	OK	
tenRun([1, 20, 50, 1]) → [1, 20, 50, 50]	[1, 20, 50, 50]	OK	
tenRun([10, 10]) → [10, 10]	[10, 10]	OK	
tenRun([10, 2]) → [10, 10]	[10, 10]	OK	
tenRun([0, 2]) → [0, 0]	[0, 0]	OK	
tenRun([1, 2]) → [1, 2]	[1, 2]	OK	
tenRun([1]) → [1]	[1]	OK	
tenRun([]) → []	[]	OK	
other tests
OK

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]	[2, 10, 10, 10, 20, 20]	OK	
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]	[10, 10, 20, 20]	OK	
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]	[10, 10, 10, 20]	OK	
tenRun([1, 2, 50, 1]) → [1, 2, 50, 50]	[1, 2, 50, 50]	OK	
tenRun([1, 20, 50, 1]) → [1, 20, 50, 50]	[1, 20, 50, 50]	OK	
tenRun([10, 10]) → [10, 10]	[10, 10]	OK	
tenRun([10, 2]) → [10, 10]	[10, 10]	OK	
tenRun([0, 2]) → [0, 0]	[0, 0]	OK	
tenRun([1, 2]) → [1, 2]	[1, 2]	OK	
tenRun([1]) → [1]	[1]	OK	
tenRun([]) → []	[]	OK	
other tests
OK	

*/
// Scores Increasing
// Author Drew Remmenga
public boolean scoresIncreasing(int[] nums) {
    for(int i = 0; i< nums.length-1;i++){
        if(nums[i]>nums[i+1]){
            return false;
            }
        }
    return true;
}
//Author Chatgpt
public boolean scoresIncreasing(int[] scores) {
        // Iterate through the array starting from the second element
        for (int i = 1; i < scores.length; i++) {
            // Check if the current score is less than the previous score
            if (scores[i] < scores[i - 1]) {
                return false; // Return false if a score is less than the previous score
            }
        }
        return true; // Return true if all scores are in non-decreasing order
    }
/*
scoresIncreasing([1, 3, 4]) → true	true	OK	
scoresIncreasing([1, 3, 2]) → false	false	OK	
scoresIncreasing([1, 1, 4]) → true	true	OK	
scoresIncreasing([1, 1, 2, 4, 4, 7]) → true	true	OK	
scoresIncreasing([1, 1, 2, 4, 3, 7]) → false	false	OK	
scoresIncreasing([-5, 4, 11]) → true	true	OK	

scoresIncreasing([1, 3, 4]) → true	true	OK	
scoresIncreasing([1, 3, 2]) → false	false	OK	
scoresIncreasing([1, 1, 4]) → true	true	OK	
scoresIncreasing([1, 1, 2, 4, 4, 7]) → true	true	OK	
scoresIncreasing([1, 1, 2, 4, 3, 7]) → false	false	OK	
scoresIncreasing([-5, 4, 11]) → true	true	OK	
*/
//Repeat End
// Drew Remmenga
public String repeatEnd(String str, int n) {
    String result = "";
    for(int i=0; i<str.length() && i<n; i++)
    {
        result+= str.substring(str.length()-n);
    }
    return result;
}
// Author chatgpt
public String repeatEnd(String str, int n) {
        // Edge case: If n is 0, return an empty string
        if (n == 0) return "";
        
        // Extract the last n characters of the string
        String endSubstring = str.substring(str.length() - n);
        
        // Repeat the extracted substring n times
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(endSubstring);
        }
        
        return result.toString();
    }
/*
repeatEnd("Hello", 3) → "llollollo"	"llollollo"	OK	
repeatEnd("Hello", 2) → "lolo"	"lolo"	OK	
repeatEnd("Hello", 1) → "o"	"o"	OK	
repeatEnd("Hello", 0) → ""	""	OK	
repeatEnd("abc", 3) → "abcabcabc"	"abcabcabc"	OK	
repeatEnd("1234", 2) → "3434"	"3434"	OK	
repeatEnd("1234", 3) → "234234234"	"234234234"	OK	
repeatEnd("", 0) → ""	""	OK	
other tests
OK	

repeatEnd("Hello", 3) → "llollollo"	"llollollo"	OK	
repeatEnd("Hello", 2) → "lolo"	"lolo"	OK	
repeatEnd("Hello", 1) → "o"	"o"	OK	
repeatEnd("Hello", 0) → ""	""	OK	
repeatEnd("abc", 3) → "abcabcabc"	"abcabcabc"	OK	
repeatEnd("1234", 2) → "3434"	"3434"	OK	
repeatEnd("1234", 3) → "234234234"	"234234234"	OK	
repeatEnd("", 0) → ""	""	OK	
other tests
OK
*/
// Can balance
//Author Drew Remmenga
public boolean canBalance(int[] nums) {
    int left = 0;
    int right = 0;
    for (int i = 0, j = nums.length - 1; i <= j;){
    if (left < right) {
        left += nums[i++];
        } 
    else {
        right += nums[j--];
        }
    }
    return (left == right);
}
// Author Chatgpt
public boolean canBalance(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        
        // Calculate the total sum of the array
        for (int num : nums) {
            totalSum += num;
        }
        
        // Traverse the array and check for balance
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            // Check if the left sum is equal to half of the total sum
            if (leftSum == totalSum - leftSum) {
                return true;
            }
        }
        
        return false;
    }
/*
CanBalance([1, 1, 1, 2, 1]) → true	true	OK	
canBalance([2, 1, 1, 2, 1]) → false	false	OK	
canBalance([10, 10]) → true	true	OK	
canBalance([10, 0, 1, -1, 10]) → true	true	OK	
canBalance([1, 1, 1, 1, 4]) → true	true	OK	
canBalance([2, 1, 1, 1, 4]) → false	false	OK	
canBalance([2, 3, 4, 1, 2]) → false	false	OK	
canBalance([1, 2, 3, 1, 0, 2, 3]) → true	true	OK	
canBalance([1, 2, 3, 1, 0, 1, 3]) → false	false	OK	
canBalance([1]) → false	false	OK	
canBalance([1, 1, 1, 2, 1]) → true	true	OK	
other tests
OK

canBalance([1, 1, 1, 2, 1]) → true	true	OK	
canBalance([2, 1, 1, 2, 1]) → false	false	OK	
canBalance([10, 10]) → true	true	OK	
canBalance([10, 0, 1, -1, 10]) → true	true	OK	
canBalance([1, 1, 1, 1, 4]) → true	true	OK	
canBalance([2, 1, 1, 1, 4]) → false	false	OK	
canBalance([2, 3, 4, 1, 2]) → false	false	OK	
canBalance([1, 2, 3, 1, 0, 2, 3]) → true	true	OK	
canBalance([1, 2, 3, 1, 0, 1, 3]) → false	false	OK	
canBalance([1]) → false	false	OK	
canBalance([1, 1, 1, 2, 1]) → true	true	OK	
other tests
OK	
*/