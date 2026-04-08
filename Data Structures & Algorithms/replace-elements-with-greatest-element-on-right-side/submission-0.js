class Solution {
    /**
     * @param {number[]} arr
     * @return {number[]}
     */
    replaceElements(arr){
        
        for(let i=0; i<arr.length-1; i++){
            let num = -1;
            for(let j=i+1; j<arr.length; j++){
                num = Math.max(arr[j], num);
            }
            arr[i] = num;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
