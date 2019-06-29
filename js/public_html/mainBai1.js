/* global opt, num1, num2 */

function calc(opt){
    var num1Ele= document.getElementById('num1');
    var num1= parseFloat(num1Ele.value);
    
    var num2Ele = document.getElementById("num2");
    var num2 = parseFloat(num2Ele.value);

var kq = 0;
switch(opt){
    case '+':
        kq = num1 + num2;
        break;
    case '-' :
        kq = num1 - num2;
        break;
    case '*':
        kq = num1 * num2;
        break;
    case '/':
        kq = num1 / num2;
        break;
    }
    var rsEle= document.getElementById('rs');
    rsEle.value = kq; 
 }