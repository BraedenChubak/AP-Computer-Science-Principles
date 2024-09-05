puts 'Enter Length: '
length = gets
puts 'Enter Width: '
width = gets
length = length.to_i
width = width.to_i

area = length * width
perim = 2 * length + 2 * width

puts "Area is #{area}"
puts "Perimeter is #{perim}"

=begin
Enter Length: 
10
Enter Width: 
21
Area is 210
Perimeter is 62
=end