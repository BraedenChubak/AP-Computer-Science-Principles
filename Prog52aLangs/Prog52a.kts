print("Enter Length: ")
var l = readLine()
val length = l?.toInt()

print("Enter Width: ")
var w = readLine()
val width = w?.toInt()

var area = length * width
var perim = 2 * length + 2 * width

println("Area is $area")
println("Perimeter is $perim")