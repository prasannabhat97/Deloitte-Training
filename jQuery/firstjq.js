$(document).ready(function(){
    alert("Hello World!!!!");

    $("p").text("hi");
    $("p").css({"color":"blue","background-color":"red"}).attr("title","sayHello");
    $("#txt1").val("hello");
    $("#btn1").click(
        function(){
           $("#txt1").val("hehehe");
        }
    )
    $("input").focus(
        function(){
            $(this).css("background-color","yellow");
      }      
    )
    $("input").blur(
        function(){
            $(this).css("background-color","white");
    })
    $("p").click(
        function(){
            $(this).hide();
        }
    ) 
});