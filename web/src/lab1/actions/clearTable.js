function clear() {
    const table = document.getElementById("result-table");
    const count = table.rows.length;
    for (let i = count-1; i > 0; i--){
        table.deleteRow(i);
    }
}

document.addEventListener("DOMContentLoaded", function () {
    const clearButton = document.getElementById("reset-btn");
    clearButton.addEventListener("click", function () {
        clear();
    });
});