# Hackerrank - Reverse a List
defmodule Solution do
    defp read_list, do: IO.read(:stdio, :all) |> String.split([" ", "\n"]) |> Enum.map(fn x -> String.to_integer(x) end)
    
    defp reverse_list([], result) do
        result
    end 

    defp reverse_list([head | tail], result) do
        reversed = [head] ++ result
        reverse_list(tail, reversed)
    end

    defp reverse_list(list) do
        reverse_list(list, [])
    end

    def main() do
        read_list()
            |> reverse_list
            |> Enum.map(fn e -> IO.puts e end)
    end
end

Solution.main()