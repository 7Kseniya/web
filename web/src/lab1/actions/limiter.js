const yCheckboxes = document.querySelectorAll('input[name="y"]');
const rCheckboxes = document.querySelectorAll('input[name="r"]');

yCheckboxes.forEach(checkbox => {
    checkbox.addEventListener('change', () => {
        yCheckboxes.forEach(y => {
            if (y !== checkbox) {
                y.checked = false;
            }
        });
    });
});

rCheckboxes.forEach(checkbox => {
    checkbox.addEventListener('change', () => {
        rCheckboxes.forEach(r => {
            if (r !== checkbox) {
                r.checked = false;
            }
        });
    });
});
