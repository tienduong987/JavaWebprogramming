/* global website */

function ClickHere(){
 var name = document.getElementById('name').value;
 var email = document.getElementById('email').value;
 var websize = document.getElementById('websize').value;
 var Message = document.getElementById('message').value;
 //check name
 if(name == ""){
     document.getElementById('errorname').innerHTML= 'vui lòng nhập đầy đủ họ và tên';
 }else{
     document.getElementById('errorname').innerHTML ='';
 }
 //check email
  if(email ==''){
     document.getElementById('erroremail').innerHTML= 'vui lòng nhập đúng định dạng đuôi @email.com';
 }else{
     document.getElementById('erroremail').innerHTML ='';
   }
   //check website
    if(website ==''){
     document.getElementById('errorwesite').innerHTML= 'vui lòng nhập website';
 }else{
     document.getElementById('erroremail').innerHTML ='';
   }
    if(message ==''){
     document.getElementById('errormessage').innerHTML= 'vui lòng nhập đúng định dạng @email.com';
 }else{
     document.getElementById('errormessage').innerHTML ='';
   }
   if(name && email && website && massage){
       info = 'Name la :' +name ;
       info += 'Email la :' +email;
       info += 'Website la:' +website ;
       info += 'Massage la :' +massage ;
       document.getElementById("kq").innerHTML = info;
   }
   
}