window.onload=function(){
	var lion=document.getElementById('lion');
	var stars=document.querySelectorAll('.winter_star');
	
	for(var i=0;i<stars.length;i++){
		console.log(stars[i].id);
		stars[i].addEventListener('click',function(){
			togglePopup(this.id);
		});
	}


	
	var close_btn=document.getElementById('close-btn');

	close_btn.addEventListener('click',function(){
		document.getElementById("popup-1").classList.toggle("active");		
	});
	function togglePopup(name){
		  document.getElementById("popup-1").classList.toggle("active");
		  
		  var url='/selectmemberlist/'+name;
		  fetch(url).then(function(response){
			  response.json().then(function(json){
				  
				  document.getElementById("logo_name").innerHTML=json[0]['logo_name'];
				  document.getElementById("logo").src=json[0]['logo_src'];
				  document.getElementById("movie").innerHTML=json[0]['movie_name'];
				  document.getElementById("movie").href=json[0]['movie_src'];
				  document.getElementById("main").innerHTML=json[0]['description'];

			  })
		  })
	}
	

}