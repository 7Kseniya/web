<?php
require_once 'validator.php';

header("Access-Control-Allow-Origin: *");

date_default_timezone_set('Europe/Moscow');
session_start();

if ($_SERVER['REQUEST_METHOD'] === 'POST'){
    $initialTime = microtime(true);
    $x = floatval($_POST['x']);
    $y = intval($_POST['y']);
    $r = intval($_POST['r']);

    if (validate($x, $y, $r)) {
        $result = isHit($x, $y, $r);
        $currentTime = date('H:i:s');
        $executionTime = number_format(($initialTime - $_SERVER['REQUEST_TIME_FLOAT'])*1000, 3);

        $receivedData = [
            'x' => $x, 'y' => $y, 'r' => $r,
            'currentTime' => $currentTime,
            'executionTime' => $executionTime,
            'result' => $result
        ];
        header('Content-Type: application/json');
        echo json_encode($receivedData);
        http_response_code(201);
    } else {
        echo json_encode(['error' => 'invalid data']);
        http_response_code(400);
    }
} else {
    echo json_encode(['error' => 'missing data']);
    http_response_code(400);
}



