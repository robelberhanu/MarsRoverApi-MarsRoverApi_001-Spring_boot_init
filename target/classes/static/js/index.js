

let marsApiButtons = document.querySelectorAll("button[id*='marsApi']");

marsApiButtons.forEach(button => button.addEventListener('click', function (){
                                    const buttonId = this.id
                                    const roverId = buttonId.split('marsApi')[1]
                                    const apiData = document.getElementById('marsApiRoverData')
                                    apiData.value = roverId
                                    document.getElementById('frmRoverType').submit()

                                }))


// function to get Url parameter, ie rover type in this case
function getUrlParameter(name) {
    name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
    var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
    var results = regex.exec(location.search);
    return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
};

let marsRoverType = getUrlParameter("marsApiRoverData");

highlightBtnByRoverType(marsRoverType)

//update sol form button to match variable for request parameter
let marsSol = getUrlParameter('marsSol')
document.getElementById('marsSol').value = marsSol

// utility function to highlight buttons
function highlightBtnByRoverType(roverType){
    if (roverType == '')
        roverType = 'Opportunity'
    
    document.getElementById('marsApi'+roverType).classList.remove('btn-secondary')
    document.getElementById('marsApi'+roverType).classList.add('btn-primary')
}