function selected(element) {
    element.classList.toggle("highlight");
  }
function validate(){
  var ele=document.getElementsByClassName("highlight");
  
  if(ele.length==0){
    alert("Please select seat(s) to proceed !!");
  }
}