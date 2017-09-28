package main

import "fmt"

func odd(n uint64) bool {
	return n%2 != 0
}

func main() {
	var n uint64
	fmt.Scan(&n)
	if odd(n) || (n >= 6 && n <= 20) {
		fmt.Println("Weird")
	} else if (n >= 2 && n <= 5) || n > 20 {
		fmt.Println("Not Weird")
	}
}
