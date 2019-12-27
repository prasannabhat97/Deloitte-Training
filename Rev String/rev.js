function repCount(){
    var revStr="";
    var str=document.getElementById("text1").value.toLowerCase();
    var ca=0;
    var ce=0;
    var ci=0;
    var co=0;
    var cu=0;
    var tot=0;
    for(i=str.length-1;i>=0;i--){

        revStr=revStr+str[i];

        switch(str[i]){
            case "a":ca++;
                break;
            case "e":ce++;
                break;
            case "i":ci++;
                break;
            case "o":co++;
                break;
            case "u":cu++;
                break;
            defoult:
            break;
        }
        tot=ca+ce+ci+co+cu;
    }
    document.getElementById("result").innerHTML="rev String ="+revStr;
    document.getElementById("a").innerHTML="a"+" "+"="+" "+ca;
    document.getElementById("e").innerHTML="e"+" "+"="+" "+ce;
    document.getElementById("i").innerHTML="i"+" "+"="+" "+ci;
    document.getElementById("o").innerHTML="o"+" "+"="+" "+co;
    document.getElementById("u").innerHTML="u"+" "+"="+" "+cu;
    document.getElementById("tot").innerHTML="Total No of repetation ="+tot;
    
}
function changeColor(ele){
    ele.style.backgroundColor="yellow";
}
function chColor(ele){
    ele.style.backgroundColor="white";
}