function isPalindrome(x: number): boolean {
    let xArray = x.toString().split('')
    if(xArray.length === 1 ) return true
    
    const forLoopLength = Math.floor(xArray.length/2)
    for(let index = 0; index < forLoopLength; index++){
      if(xArray.pop() !== xArray.shift()){ 
          return false
          break
      }
    }
    return true
};