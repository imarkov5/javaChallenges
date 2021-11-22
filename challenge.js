function timeConversion(s) {
    // Write your code here
    let military = s.substr(2,6);
    let timeSignature = s.slice(8);
    let hours = parseInt(s.substr(0,2));
    if(hours == 12){
        hours = 0;
    }
    if(timeSignature == "PM"){
        s = (hours + 12).toString().concat(military);
    }else if (timeSignature == "AM" && hours == 0){
        s = '00'.concat(military);
    }
    let militaryTime = s.substr(0,8);
    return militaryTime;
    
}
console.log(timeConversion("12:15:45AM"));
console.log(timeConversion("00:15:45AM"));
console.log(timeConversion("12:15:45PM"));
console.log(timeConversion("07:05:45PM"));
console.log(timeConversion("08:15:45AM"));

function fizzBuzz(n) {
    // Write your code here
    for(let i = 1; i <= n; i++){
        if(i % 5 == 0 && i % 3 == 0){
            return "FizzBuzz";
        }else if(i%3 == 0){
            return "Fizz";
        }else if(i%5 == 0){
            return "Buzz";
        }else{
            return i;
        }
    }
}
console.log(fizzBuzz(8));

// find median in an unsorted array
function findMedian(arr){
    let temp;
    let median;
    for(let j = 0; j < arr.length; j ++){
            for(let i = 1; i < arr.length; i++ ){
                if(arr[i]<arr[i-1]){
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp; 
            }
        }
    }
    console.log(arr);
    if(arr.length%2 == 0){
        median = (arr[arr.length/2-1] + arr[arr.length/2])/2;
    }else{
        median = arr[(arr.length+1)/2-1];
    }
    return median;
}
console.log(findMedian([5,2,4,3,1]));
console.log(findMedian([0,1,2,3,4,5,6]));
console.log(findMedian([50,35,25,15,40,45,10,30]));
console.log(findMedian([20,100, 0, 14, 9, 35, 99, 4, 25, 101, 1]));

console.log("====================");

// find unique element in the array
function lonelyinteger(a){
    let unique = a.filter(function(value){
        return a.indexOf(value) === a.lastIndexOf(value)
      })
      
      return unique[0];

}
lonelyinteger([1,1,2,2,6])
