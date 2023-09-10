import {showError} from './errorManager.js'
import {add} from './addData.js'
document.addEventListener('DOMContentLoaded', function () {
    const form = document.getElementById('input-form');
    const x_select = document.getElementById('x');


    function validate(){
        let x_value = parseFloat(x_select.value.replace(',', '.'));
        if (isNaN(x_value) || x_value <-3 || x_value>5 ){
            showError("x value must be between -3 and 5", 3000);
            return false;
        } else return true;
    }

    form.addEventListener('submit', function (event){
        const y_select = document.querySelectorAll('input[name="y"]:checked');
        const r_select = document.querySelectorAll('input[name="r"]:checked');
        if (y_select.length === 0 || r_select.length === 0){
            showError("fill in the values of all fields", 3000)
            return;
        }

        event.preventDefault();
        const x = x_select.value;
        const y = y_select[0].value;
        const r = r_select[0].value;

        const formData = new FormData(form);
        formData.append('x', x);
        formData.append('y', y);
        formData.append('r', r);

        if (!validate()) {
            return;
        }
        const xhr = new XMLHttpRequest();
        xhr.open('POST', 'server/index.php', true);
        xhr.onload = function () {
            if (xhr.status === 201 || xhr.status === 200) {
                const data = JSON.parse(xhr.responseText);
                add(data);

                form.reset();
            }else {
                console.error("error: " + xhr.status);
                showError("an error occurred while processing the request");
            }
        };
        xhr.send(formData)
    })
});