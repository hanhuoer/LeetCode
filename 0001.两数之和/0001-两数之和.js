/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var i, j, len = nums.length
    for(i=0; i<len; i++){
        for(j=i+1; j<len; j++){
            if((nums[i]+nums[j]) == target){
                return [i, j]
            }
        }
    }
};