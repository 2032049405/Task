function myfunc() {

    var showLeft = document.getElementById('showLeft');

    var leftCont = document.getElementById('leftCont');

    var rightCont = document.getElementById('rightCont');

    if (rightCont.classList.contains("left-zero") == true) {

        rightCont.classList.remove("left-zero");

        rightCont.classList.add("main-pos");

        leftCont.classList.remove("left-pos");

        leftCont.classList.add("left-zero");

    }

    else {

        rightCont.classList.add("left-zero");

        leftCont.classList.add("left-pos");

        rightCont.classList.remove("main-pos");

        leftCont.classList.remove("left-zero");
    }
}
var simple=document.getElementById('abc');
simple.onclick=function () {
    window.location.href = './task-0202.html';
};