package main

import "fmt"

func even(n int) bool {
	return n%2 == 0
}

func main() {
	var T int
	fmt.Scan(&T)
	for i := 0; i < T; i++ {
		var text string
		fmt.Scan(&text)
		length := len(text)
		var (
			fword string
			lword string
		)
		for j := 0; j < length; j++ {
			if even(j) {
				fword += string(text[j])
			} else {
				lword += string(text[j])
			}
		}
		fmt.Printf("%s %s\n", fword, lword)
	}
}
