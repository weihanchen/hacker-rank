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

## List Replication
* read inputs
```elixir
IO.read(:all)
```
### Sample Input
```
3
1
2
3
4
```
### Sample Output
```
1
1
1
2
2
2
3
3
3
4
4
4
```