<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form</title>
</head>
<body>
  <div>
    <form method="post" id="form">
        <div class="form-field" id="select-x-value">
          <span>select x:</span>
          <input type="radio" id="x-4" name="x" value="-4"><label for="x-4">-4</label>
          <input type="radio" id="x-3" name="x" value="-3"><label for="x-3">-3</label>
          <input type="radio" id="x-2" name="x" value="-2"><label for="x-2">-2</label>
          <input type="radio" id="x-1" name="x" value="-1"><label for="x-1">-1</label>
          <input type="radio" id="x0" name="x" value="0"><label for="x0">0</label>
          <input type="radio" id="x1" name="x" value="1"><label for="x1">1</label>
          <input type="radio" id="x2" name="x" value="2"><label for="x2">2</label>
          <input type="radio" id="x3" name="x" value="3"><label for="x3">3</label>
          <input type="radio" id="x4" name="x" value="4"><label for="x4">4</label>
          <div>
            <small></small>
          </div>
        </div>
        <div class="form-field" id="select-y-value">
          <span>enter y:</span>
          <label for="y"></label><input type="text" maxlength="10" name="y" id="y" placeholder="should be in range [-3; 3]" required>
          <div>
            <small></small>
          </div>
        </div>
        <div class="form-field" id="select-r-value" onclick="check_r()">
          <span>select r:</span>
          <input type="radio" id="r1" name="r" value="1"><label for="r1">1</label>
          <input type="radio" id="r2" name="r" value="2"><label for="r2">2</label>
          <input type="radio" id="r3" name="r" value="3"><label for="r3">3</label>
          <input type="radio" id="r4" name="r" value="4"><label for="r4">4</label>
          <input type="radio" id="r5" name="r" value="5"><label for="r5">5</label>
          <div>
            <small></small>
          </div>
        </div>
        <div id="button-container">
          <input type="submit" id="submit" value="submit">
          <input type="reset" value="clear form">
          <input type="button" id="clearTable" value="clear table">
        </div>
    </form>
  </div>

</body>
</html>
