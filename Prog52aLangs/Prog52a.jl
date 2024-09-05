print("Enter Length: ")
length = readline()
length = parse(Int64, length)
print("Enter Width: ")
width = readline()
width = parse(Int64, width)
area = length * width
perim = 2 * length + 2 * width
println("Area is $area")
println("Perimeter is $perim")
#=
Enter Length: 41
Enter Width: 73
Area is 2993
Perimeter is 228
=#