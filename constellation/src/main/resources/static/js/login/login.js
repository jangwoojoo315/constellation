//$(document).ready(function() {
//	
//
//  
//  var animating = false,
//      submitPhase1 = 1100,
//      submitPhase2 = 400,
//      logoutPhase1 = 800,
//      $login = $(".login"),
//      $app = $(".app");
//  	  $signup=$(".up_btn");
//  function ripple(elem, e) {
//    $(".ripple").remove();
//    var elTop = elem.offset().top,
//        elLeft = elem.offset().left,
//        x = e.pageX - elLeft,
//        y = e.pageY - elTop;
//    var $ripple = $("<div class='ripple'></div>");
//    $ripple.css({top: y, left: x});
//    elem.append($ripple);
//  };
//  
//  $(document).on("click", ".login__submit", function(e) {
//    if (animating) return;
//    animating = true;
//    var that = this;
//    ripple($(that), e);
//    $(that).addClass("processing");
//    setTimeout(function() {
//      $(that).addClass("success");
//      setTimeout(function() {
//        $app.show();
//        $app.css("top");
//        $app.addClass("active");
//      }, submitPhase2 - 70);
//      setTimeout(function() {
//        $login.hide();
//        $login.addClass("inactive");
//        animating = false;
//        $(that).removeClass("success processing");
//      }, submitPhase2);
//    }, submitPhase1);
//  });
//  
//  $(document).on("click", ".app__logout", function(e) {
//    if (animating) return;
//    $(".ripple").remove();
//    animating = true;
//    var that = this;
//    $(that).addClass("clicked");
//    setTimeout(function() {
//      $app.removeClass("active");
//      $login.show();
//      $login.css("top");
//      $login.removeClass("inactive");
//    }, logoutPhase1 - 120);
//    setTimeout(function() {
//      $app.hide();
//      animating = false;
//      $(that).removeClass("clicked");
//    }, logoutPhase1);
//  });
//
//  
//});


window.onload=function(){
	
	var up_btn=document.getElementById('signup_btn');
	var cancel_btn=document.getElementById('cancel_btn');
	
	up_btn.addEventListener('click',function(){
		document.getElementById('profile').style.display='inline';
	});
	
	cancel_btn.addEventListener('click',function(){
		document.getElementById('profile').style.display='none';
	});
	
	var signup_btn=document.getElementById('submit_btn');
	var _userId=document.getElementById('userId');
	var _userAddress=document.getElementById('userAddress');
	var _userName=document.getElementById('userName');
	var _userPass=document.getElementById('userPass');
	
	signup_btn.addEventListener('click',function(){
		
		submituserinfo(_userId,_userAddress,_userName,_userPass);
	});
	function submituserinfo(_userId,_userAddress,_userName,_userPass){
		alert(_userId.value);
		var url='/signup_info';
		fetch(url,{
			method:"POST",
			headers: {
				'Content-Type': 'application/json;charset=utf-8'
				  },
			body:JSON.stringify(
					{
						userId:_userId.value,
						userAddress:_userAddress.value,
						userPass:_userPass.value,
						userName:_userName.value,
					}
			)
		})
	}
}