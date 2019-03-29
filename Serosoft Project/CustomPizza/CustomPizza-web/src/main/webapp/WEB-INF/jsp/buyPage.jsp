<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>BuyScreen</h1>
	<form action="buyPizza.do" method="post">
	<div>
		<div>
			<label>Choice of Crust</label>
			<select name="Choice of Crust">
				<option>Fresh Pan</option>
				<option>Thin</option>
				<option>Cheese brust</option>
			</select>
		<br>
		<br>
			<label style="left:2500;">Choice of Toppings</label> 
			<input type="checkbox" name="pepperoni" value="pepperoni"> <label>Pepperoni</label>
			<input type="checkbox" name="mushrooms" value="mushrooms"> <label>Mushrooms</label>
			<input type="checkbox" name="olives" value="olives"> <label>Olives</label>
		<br/>
			<input type="checkbox" name="red pepper" value="red pepper"> <label>Red pepper</label> 
			<input type="checkbox" name="paneer" value="paneer"> <label>Paneer</label> 
			<input type="checkbox" name="olives" value="olives"> <label>Olives</label>
		<br>
		<br>
			<label>Quantity</label> <select name="Quantity">
				<option>1</option>
				<option>2</option>
				<option>3</option>
				<option>4</option>
				<option>5</option>
				<option>6</option>
				<option>7</option>
				<option>8</option>
				<option>8</option>
				<option>10</option>
				<option>11</option>
				<option>12</option>
				<option>13</option>
				<option>14</option>
				<option>15</option>
				<option>16</option>
				<option>17</option>
				<option>18</option>
				<option>19</option>
				<option>20</option>
			</select>
		</div>
		<br/>
		<br/>
		<div>
			<button type="submit" name="action" value="calPrice" >Calculate Price</button>
		</div>
		<br>
		<div>
			<button type="submit">Price in RS</button>
			<button type="submit" name="action" value="buy">Buy</button>
		</div>
		<br>
		<br>
		</div>
	</form>
</body>
</html>