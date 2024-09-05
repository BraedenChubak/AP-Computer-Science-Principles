print("Enter Length: ")
var length = readLine()!!.toInt()

print("Enter Width: ")
var width = readLine()!!.toInt()

var area = length * width
var perim = 2 * length + 2 * width

println("Area is $area")
println("Perimeter is $perim")

/*
Enter Length: 13
Enter Width: 17
Area is 221
Perimeter is 60
*/