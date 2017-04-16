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
### Notes

* read inputs
```elixir
IO.read(:stdio, :all)
```
* loop
Because immutability in functional programming, so we cannot use imperative loop, then use recursively instead with.
```elixir
defp print(_, times) when times <= 0, do: nil

defp print(msg, times) do
    IO.puts(msg)
    print(msg, times - 1)
end
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

### [Track](https://www.hackerrank.com/challenges/fp-list-replication)
### [Solution](./introduction/list-replication.exs)

## Filter Array Implementation
The first line contains the delimiter X.
The next lines each contain an integer until eof as array B.
We should print all the integers from array B that are less then the given upper limit X.
### Notes
filter function when value >= upper_limit then exit otherwise do do_filter/2, the code like below:
```
defp do_filter(value, upper_limit) when value >= upper_limit, do: nil
defp do_filter(value, _) do
    IO.puts(value)
end
```
### Sample Input
```
3
2
7
5
1
3
0
```
### Sample Output
```
2
1
0
```

### [Track](https://www.hackerrank.com/challenges/fp-filter-array)
### [Solution](./introduction/filter-array.exs)

## Filter Positions in a List
list index in elixir should use `Enum.with_index` transorm like below:
```
Enum.with_index([1,2,3]) => [{100, 1}, {200, 2}, {300, 3}]
```
### Sample Input
```
2
5
3
4
```
### Sample Output
```
5
4
```
### [Track](https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list)
### [Solution](./introduction/filter-position.exs)

## Array Of N Elements
### Notes:
Inspects and writes the given item to the device
`IO.inspect [1,2,3]`
when list size too long should add some options like:
```
IO.inspect([1,2,3......], limit: :infinity)
```
### Sample Input
```
10
```
### Sample Output
```
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```