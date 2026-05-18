var max=6, min=1;
var randomNum1= Math.floor(Math.random() * (max - min + 1)) + min;
var randomNum2=Math.floor(Math.random() * (max - min + 1)) + min;

var link1, link2;
if(randomNum1===1){
     link1="images/dice1.png";
}
else if(randomNum1===2){
     link1="images/dice2.png";
}
else if(randomNum1===3){
     link1="images/dice3.png";
}
else if(randomNum1===4){
     link1="images/dice4.png";
}
else if(randomNum1===5){
     link1="images/dice5.png";
}
else{
     link1="images/dice6.png";
}

if(randomNum2===1){
     link2="images/dice1.png";
}
else if(randomNum2===2){
     link2="images/dice2.png";
}
else if(randomNum2===3){
     link2="images/dice3.png";
}
else if(randomNum2===4){
     link2="images/dice4.png";
}
else if(randomNum2===5){
     link2="images/dice5.png";1
}
else{
     link2="images/dice6.png";
}

document.querySelector(".img1").setAttribute("src" ,link1);
document.querySelector(".img2").setAttribute("src" ,link2);

if(randomNum1>randomNum2){
    document.querySelector("h1").textContent="🚩PLayer 1 wins";
}
if(randomNum1<randomNum2){
    document.querySelector("h1").textContent="Player 2 wins🚩";
}

if(randomNum1===randomNum2){
    document.querySelector("h1").textContent="Draw";
}