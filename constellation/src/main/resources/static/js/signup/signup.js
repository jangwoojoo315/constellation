window.onload=function(){
	var signup_btn=document.getElementById('signup_btn');
	var _userId=document.getElementById('userId');
	var _userPass=document.getElementById('userPass');
	var _userName=document.getElementById('userName');
	var _userPhon=document.getElementById('userPhon');
	
	signup_btn.addEventListener('click',function(){
		submituserinfo(_userId,_userPass,_userName,_userPhon);
	})
	function submituserinfo(_userId,_userPass,_userName,_userPhon){
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
						userPass:_userPass.value,
						userName:_userName.value,
						userPhon:_userPhon.value
					}
			)
		})
	}
}