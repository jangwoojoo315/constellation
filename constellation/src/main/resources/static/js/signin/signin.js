
window.onload=function(){

	var signin_btn=document.getElementById('signin_btn');
	var _userId=document.getElementById('userId');
	var _userPass=document.getElementById('userPass');
	
	
	signin_btn.addEventListener('click',function(){
		submituserinfo(_userId,_userPass);

	})
	function submituserinfo(_userId,_userPass){
		var url='/signin_info';
		fetch(url,{
			method:"POST",
			headers: {
				'Content-Type': 'application/json;charset=utf-8'
				  },
			body:JSON.stringify(
					{
						userId:_userId.value,
						userPass:_userPass.value,
					}
			),
		}).then(res=>{
			alert("dddd");
			//var member_id = sesssionStorage.setItem("member");

			//alert(member_id);
		});

	}

}