let nums = [1, 7, 7, 7, 7, 7, 7, 2];
let target = 7;
let newNum = [-1, -1];
var searchRange = function (nums, target) {

  if(nums.length==1) return [0,0];


  let l = 0;
  let r = nums.length;
  while (l <= r) {
    let mid = r - (r - l) / 2;
    if (nums[mid] == target ) {
      newNum[0] = mid;
      r = mid-1;
    } else if (nums[mid] > target) r = mid - 1;
    else l = mid + 1;
  }
  l = 0;
  r = nums.length;
  while (l <= r) {
    let mid = r - (r - l) / 2;
    if (nums[mid] == target ) {
      newNum[1] = mid;
      lo = mid+1;
    } else if (nums[mid] > target) r = mid - 1;
    else l = mid + 1;
  }

  return newNum;
};

console.log(searchRange(nums, target));
