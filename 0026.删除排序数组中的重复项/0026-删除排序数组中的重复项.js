/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    var count = 1
    for(var i=1; i<nums.length; i++){
        if(nums[i] == nums[i-1]){
            continue
        }else{
            // pass
            nums[count++] = nums[i]
        }
    }
    return count
};