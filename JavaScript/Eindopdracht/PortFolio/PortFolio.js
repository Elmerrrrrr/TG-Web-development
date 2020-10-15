const menuBtn = document.querySelector('.menu-btn');
var checkBox = document.getElementById('check-menu').checked;
var checkButton = document.getElementsByClassName('fa-times-circle');
let menuOpen = false;
menuBtn.addEventListener('click', function(){
    if(!menuOpen) {
        menuBtn.classList.add('open');
        menuOpen= true;
        
        } else{
            menuBtn.classList.remove('open');
            menuOpen = false;
        }
   
      
        
})

console.log(checkBox);

// checkBox.addEventListener('click', function(){
//     if(!menuOpen) {
//         menuBtn.classList.add('open');
//         menuOpen= true;
        
//         } else{
//             menuBtn.classList.remove('open');
//             menuOpen = false;
//         }
//         console.log(checkButton);
      
        
// })
