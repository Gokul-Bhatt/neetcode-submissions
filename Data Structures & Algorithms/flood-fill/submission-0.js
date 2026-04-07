class Solution {
    /**
     * @param {number[][]} image
     * @param {number} sr
     * @param {number} sc
     * @param {number} color
     * @return {number[][]}
     */
floodFill(image, sr, sc, color) {
    let oldc = image[sr][sc];
    if(oldc === color) return image;
    this.dfs(image,sr,sc,color,oldc);
    return image;
}
   dfs(image,sr,sc,color,oldc){
    if(sr<0 || sr >=image.length || sc<0 || sc>=image[0].length 
            || image[sr] [sc] !== oldc){
            return;
         }
    image[sr][sc] = color

    this.dfs(image, sr-1, sc, color, oldc)
    this.dfs(image, sr+1, sc, color, oldc)
    this.dfs(image, sr, sc-1, color, oldc)
    this.dfs(image, sr, sc+1, color, oldc)
}

    }
