window.onload=function(){
	var lion=document.getElementById('lion');
	var close_btn=document.getElementById('close-btn');
	lion.addEventListener('click',function(){
		togglePopup();
		
	});
	close_btn.addEventListener('click',function(){
		togglePopup();
		
	});
	function togglePopup(){
		  document.getElementById("popup-1").classList.toggle("active");
		  document.getElementById("logo").src="../img/leo.gif";
		  document.getElementById("logo_name").innerHTML="사자자리";
		  document.getElementById("movie").innerHTML="신화 영상보기";
		  document.getElementById("movie").href="https://youtu.be/mi-dAyLndpw";
		  document.getElementById("main").innerHTML="하늘이 혼란스러워 별들이 자리를 떠나고 혜성이 자주 나타나던 때 달에서 유성 하나가 황금사자의 모습으로 네메아 골짜기에 떨어졌다.유성이 변하여 된 이 사자는 지구의 사자보다 훨씬 컸고, 성질도 포악하여 네메아 사람들에게 많은 고통을 주었다.그 당시 제우스와 알크메나 사이에서 태어난 헤르쿨레스는 제우스의 아내 헤라의 미움을 받아 12가지의 모험을 해야 했는데 그 중 첫 번째가 네메아 골짜기의 사자를 죽이는 일이었다. 헤르쿨레스는 활과 창, 방망이 등을 사용하여 사자와 싸워보았지만 어떤 무기로도 결코 사자를 이길 수 없었다. 헤르쿨레스는 무기를 버리고 사자와 뒤엉켜 생사를 가르는 격투를 벌인 끝에 사자를 물리칠 수 있었다.";
		  
	}
}