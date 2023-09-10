const error = document.getElementById('error');

export function showError(message, delay){
    error.innerText = message;
    setTimeout(function (){
        error.innerText = "";
    }, delay);
}