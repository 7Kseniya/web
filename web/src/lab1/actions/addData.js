const table = document.getElementById('result-table');
export function displayResult(data){
    const row = document.createElement('tr');
    row.innerHTML = `
                        <td>${data.x}</td>
                        <td>${data.y}</td>
                        <td>${data.r}</td>
                        <td>${data.currentTime}</td>
                        <td>${data.executionTime}</td>
                        <td>${data.result}</td>`;
    table.appendChild(row);
}