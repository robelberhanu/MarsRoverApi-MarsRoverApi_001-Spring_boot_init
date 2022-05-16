

let marsApiButtons = document.querySelector("button[id*='marsApi']")

marsApiButtons.forEach(button => button.addEventListener('click', function (){
                                    alert("clicked!")
                                }))