package main

import (
  "fmt"
)

func main() {
	var length int
	var width int
	var area int
	var perim int

  	fmt.Print("Enter Length: ")
	fmt.Scan(&length)
	fmt.Print("Enter Width: ")
	fmt.Scan(&width)
	area = length * width
	perim = 2 * length + 2 * width
	fmt.Printf("Area is %v\n", area)
	fmt.Printf("Perimeter is %v\n", perim)
}
/*
Enter Length: 17
Enter Width: 31
Area is 527
Perimeter is 96
*/