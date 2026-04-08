class Solution {
    /**
     * @param {number[]} arr
     * @return {number[]}
     */
    replaceElements(arr) {
        let num = -1;
        for(let i=arr.length-1; i>=0; i--){
            let temp = arr[i];
            arr[i] = num;
            num = Math.max(num, temp);
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
