<?php

// Включаем класс Validator
include 'Validator.php';
date_default_timezone_set('Europe/Moscow');

// Создаем экземпляр класса Validator
$validator = new Validator();

// Проверяем, получены ли параметры R и координаты точки
if (isset($_GET['r']) && isset($_GET['x']) && isset($_GET['y'])) {
    // Получаем значения параметров
    $x = intval($_GET['x']);
    $y = floatval($_GET['y']);
    $r = intval($_GET['r']);

    if ($validator->validate($x, $y, $r)) {
        $result = checkPoint($x, $y, $r);
    } else {
        $result = "validation error";
    }
} else {
    $result = "fill in all parameters";
}
function check_coords($x, $y, $r) {
    $flag = false;
    if ($x >= 0 && $y <= 0 && ) {
        $flag = true;
    }
    if ($x <= 0 && $y <= 0 && $x >= -$r && $y<=$r) {
        $flag = true;
    }
    if ($x <= 0 && $y >= 0 && $x >= -$r && pow($x, 2) + pow($y, 2) <= pow($r/2, 2)) {
        $flag = true;
    }
    return $flag;
}
