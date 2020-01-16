/**
 * @param {string} J
 * @param {string} S
 * @return {number}
 */
var numJewelsInStones = function(goodStone, myStone) {
    var count = 0
    for(var i=0; i<myStone.length; i++){
        for(var j=0; j<goodStone.length; j++){
            if(myStone[i] === goodStone[j]){count++}
        }
    }
    return count
};