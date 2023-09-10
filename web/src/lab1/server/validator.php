<?php
const MIN = -3;
const MAX = 5;
const R_MIN = 1;

function validate($x, $y, $r): bool
{
    if (!(is_float($x) && is_int($y) && is_int($r))) {
        return false;
    } else {

        if (!($y >= MIN  && $y <= MAX)) {
            return false;
        }
        if (!($x >= MIN && $x <= MAX)) {
            return false;
        }
        if (!($r >= R_MIN && $r <= MAX)) {
            return false;
        }
        return true;
    }

}
function isHit($x, $y, $r): string
{
    if (check_circle($x, $y, $r) || check_rectangle($x, $y, $r) || check_triangle($x, $y, $r)){
        return "hit";
    } else return "miss";
}
function check_circle($x, $y, $r): bool
{
    if ($x>=0 && $y<=0 && pow($x, 2)+ pow($y, 2) <= pow($r, 2)) {
        return true;
    } else return false;
}
function check_rectangle($x, $y, $r): bool
{
    if ($x<=0 && $y<=0 && $x>=-$r && $y>=-$r/2){
        return true;
    } else return false;
}
function check_triangle($x, $y, $r): bool
{
    if ($x<=0 && $y>=0 && $x>=-$r && $y<=$r && abs($y - $x) <=$r/2) {
        return true;
    } else return false;
}
