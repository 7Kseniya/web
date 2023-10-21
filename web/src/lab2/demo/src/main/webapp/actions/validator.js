function showError(input, message) {
    const formField = input.parentElement;
    // add the error class
    formField.classList.remove('success');
    formField.classList.add('error');

    const error = formField.querySelector('small');
    error.textContent = message;
}

function showSuccess(input) {
    const formField = input.parentElement;
    // add the error class
    formField.classList.remove('error');
    formField.classList.add('success');

    const error = formField.querySelector('small');
    error.textContent = '';
}
function check_x() {
    let valid;

    const xButtons = document.querySelectorAll('input[name="x"]:checked');
    if (xButtons.length === 1) {
        showSuccess(xButtons[0]);
        valid = true;
    } else {
        showError(document.querySelector('input[name="x"]'), "Please, select any x value");
        valid = false;
    }
    return valid;
}

function check_y() {
    let valid;

    const yElement = document.getElementById("y");
    const y = yElement.value;
    if (isNaN(y) || isNaN(parseFloat(y))) {
        showError(yElement, "Please, enter number");
        valid = false;
    } else if (parseFloat(y) < -3 || parseFloat(y) > 3) {
        showError(yElement, "Please, enter number in range [-3; 3]");
        valid = false;
    } else {
        showSuccess(yElement);
        valid = true;
    }
    return valid;
}

function check_r() {
    let valid;

    const rButtons = document.querySelectorAll('input[name="r"]:checked');
    if (rButtons.length === 1) {
        showSuccess(rButtons[0]);
        valid = true;
    } else {
        showError(document.querySelector('input[name="r"]'), "Please, select any r value");
        valid = false;
    }
    return valid;
}

function validate_form() {
    let isXValid = check_x(), isYValid = check_y(), isRValid = check_r();
    return isXValid && isYValid && isRValid;
}