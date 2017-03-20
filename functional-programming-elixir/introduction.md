Topic of Introduction
===
## Hello World N Times
### Notes
* read line as integer
```elixir
{n, _} = IO.gets("") |> Integer.parse
# or
n = IO.gets("") |> String.strip |> String.to_integer
```
### Sample Input
```
3
```
### Sample Output
```
Hello World
Hello World
Hello World
```
### [Track](https://www.hackerrank.com/challenges/fp-hello-world-n-times)
### [Solution](./introduction/hello-world-n-times.exs)