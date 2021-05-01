window.onload=function(){
includeHTML(document.getElementById('header_box'),'header')
includeHTML(document.getElementById('nav_box'),'nav')
includeHTML(document.getElementById('footer_box'),'footer')
function includeHTML(divContainer, urlHTML) {
    let xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
    if (this.readyState == 4) {
        if (this.status == 200) { divContainer.innerHTML = this.responseText; }
        if (this.status == 404) { divContainer.innerHTML = "Page not found."; }
    }
}
xhttp.open("GET", urlHTML, true);
xhttp.send();
}
}