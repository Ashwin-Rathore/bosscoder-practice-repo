class ListNode {
  constructor(val = 0, next = null) {
    this.val = val;
    this.next = next;
  }
}

function arrayToList(nums) {
  let dummy = new ListNode(0);
  let current = dummy;
  for (let n of nums) {
    current.next = new ListNode(n);
    current = current.next;
  }
  return dummy.next;
}

function listToArray(node) {
  let result = [];
  while (node) {
    result.push(node.val);
    node = node.next;
  }
  return result;
}

let l1 = arrayToList([2, 4, 3]);
let l2 = arrayToList([5, 6, 4]);

var addTwoNumbers = function (l1, l2) {
  let dummy = new ListNode(0);
  let current = dummy;
  let carry = 0;

  while (l1 !== null || l2 !== null || carry !== 0) {
    let val1 = l1 ? l1.val : 0;
    let val2 = l2 ? l2.val : 0;
    let sum = val1 + val2 + carry;
    carry = Math.floor(sum / 10);

    current.next = new ListNode(sum % 10);
    current = current.next;

    if (l1) l1 = l1.next;
    if (l2) l2 = l2.next;
  }

  return dummy.next;
};

let resultList = addTwoNumbers(l1, l2);
console.log(listToArray(resultList)); // Output: [7, 0, 8]
