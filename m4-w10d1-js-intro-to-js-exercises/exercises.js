function sumDouble(x, y) {
    if(x === y){
        return 2 * (x + y);
    }
    else{
        return x + y;
    }
}

function hasTeen(a, b, c){
    if((a > 12 && a < 20 )|| (b > 12 && b < 20) || (c > 12 && c < 20)){
        return true;
    }
    else{
        return false;
    }
}


function lastDigit(s, c){
    var s;
    var c;
    if(s % 10 == c % 10){
        return true;
    }
    else{
        return false;
    }
}

function seeColor(c){
    var c;
    if(c.substring(0,3)== "red"){
        return "red";
    }
    else if(c.substring(0,4) == "blue"){
        return "blue";
    }
    else{
       return "";
    }
}

function middleThree(str){
    var str;
    var a;
    if(str.length == 3){
        return str;
    }

    a = Math.round(str.length/2);
    return str.substring(a - 2, a + 1);
}

function frontAgain(str){
    var str;
    if(str.substring(0,2) == str.substring(str.length - 2, str.length)){
        return true;
    }
    else{
        return false;
    }
}

function alarmClock(num, boo){
    var num;
    var boo;
    if(boo == false){
        if(num == 0){
            return "10:00";
        }
        if(num > 0 && num < 6){
            return "7:00";
        }
        if(num == 6){
            return "10:00"
        }
    }
    else if (boo = true){
        if(num == 0){
            return "off";
        }
        if(num > 0 && num < 6){
            return "10:00";
        
        }
        if(num == 6){
            return "off"
        }
    }
    

}

function makeMiddle(nums){
    var nums;
    if(nums.length % 2 == 1 || nums.length < 2){
        var temp = [ ];
        return temp;
    }
    else{
        var newA;
        num1 = nums[nums.length / 2];
        num2 = nums[((nums.length /2 ) - 1)];
        newA = [num2, num1];
        return newA;
    }
}

function oddOnly(nums){
    var newNums = [];
    var nums;
    for(var i = 0; i < nums.length; i++){
        if(nums[i] % 2 == 1){
            newNums.push(nums[i]);
        }
        else{

        }
    }
    return newNums;
}

// function weave(nums1, nums2){
//     var nums1;
//     var nums2;
//     var newNums = [];
//     newNums.length = nums1.length + nums2.length;
//     if(nums1.length > nums2.length){
//         for(var i = 0; i < nums1.length; i++){
//             newNums[i+1] = nums1[i];
//             if(nums2[i] != undefined){
//                 newNums[i] = nums2[i];
//             }
//     }
//     }
//     else if(nums2.length > nums1.length){
//         for(var i = 0; i < nums2.length; i++){
//                 if(nums1[i] != undefined){
//                     newNums[i] = nums1[i];
//                 }
//                 newNums[i+1] = nums2[i];
//         }
//     }
//     return newNums;
// }

function cigarParty(num, boo){
    var num;
    var boo;
    if(boo == false && (num > 39 && num < 61)){
         return true;
    }
    if(boo == true && (num > 39)){
        return true;
    }
    else{
        return false;
    }
}

function stringSplosion(str){
    var str;
    var complete = str.substring (0,1);
    for(var i = 1; i < str.length; i++){
        var newS = str.substring(0, i + 1);
        complete = complete + newS;
    }
    return complete;
}

function fizzBuzz(num){
    var num;
    if(num % 15 == 0){
        return "FizzBuzz";
    }
    if(num % 5 == 0){
        return "Buzz";
    }
    if(num % 3 == 0){
        return "Fizz";
    }
    else{
        return num;
    }
}

function countValues(nums){
    var nums;
    var map = {};
    for(var i = 0; i < nums.length; i++){
       if(map[nums[i]] == undefined){
        map[nums[i]] = 0;
       }

       map[nums[i]]++;
    }
    return map;
}


function reverseArray(nums){
    var nums;
    nums.reverse();
    return nums;

}

function blackJack(num1, num2){
    var num1;
    var num2;

    if(num1 < 22 && num2 < 22){
        if(num1 > num2){
            return num1;
        }
        else if(num2 > num1){
            return num2;
        }
    }
    else if(num1 < 22 && num2 > 21){
        return num1;
    }
    else if(num2 < 22 && num1 > 21){
        return num2;
    }
}