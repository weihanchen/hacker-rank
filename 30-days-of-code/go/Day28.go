package main

import (
	"bufio"
	"fmt"
	"os"
	"regexp"
	"sort"
	"strings"
)

type ByChar []string

func (s ByChar) Len() int {
	return len(s)
}

func (s ByChar) Swap(i, j int) {
	s[i], s[j] = s[j], s[i]
}

func (s ByChar) Less(i, j int) bool {
	return strings.Compare(s[i], s[j]) < 0
}

func validate(mail string) bool {
	validFormat := regexp.MustCompile(`.*?@gmail.com`)
	return validFormat.MatchString(mail)
}

func main() {
	var n int
	fmt.Scanf("%d", &n)
	scanner := bufio.NewScanner(os.Stdin)
	names := make([]string, n)
	for i := 0; i < n; i++ {
		scanner.Scan()
		var (
			text       = scanner.Text()
			sArr       = strings.Split(text, " ")
			name, mail = sArr[0], sArr[1]
		)
		if validate(mail) {
			names[i] = name
		}
	}
	sort.Sort(ByChar(names))

	for _, name := range names {
		if len(name) > 0 {
			fmt.Println(name)
		}
	}
}
