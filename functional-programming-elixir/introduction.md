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