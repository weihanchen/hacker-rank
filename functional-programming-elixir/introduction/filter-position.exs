# Hackerrank - Filter Positions in a List
defmodule Solution do
    defp read_list, do: IO.read(:stdio, :all) |> String.split([" ", "\n"]) |> Enum.map(fn x -> String.to_integer(x) end)

    def main() do
        read_list()
            |> Enum.with_index
            |> Enum.filter(fn {_, index} -> rem(index, 2) == 1 end)
            |> Enum.map(fn {value, _} -> IO.puts value end)
    end
end

Solution.main()