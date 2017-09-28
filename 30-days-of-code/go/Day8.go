package main

import "fmt"

func main() {
	var n int
	fmt.Scanf("%d", &n)
	phoneBook := make(map[string]string)
	for i := 0; i < n; i++ {
		var (
			name  string
			phone string
		)
		fmt.Scan(&name)
		fmt.Scan(&phone)
		phoneBook[name] = phone
	}
	for i := 0; i < n; i++ {
		var name string
		fmt.Scan(&name)
		if phone, exists := phoneBook[name]; exists {
			fmt.Printf("%s=%s\n", name, phone)
		} else {
			fmt.Println("Not found")
		}
	}

}
