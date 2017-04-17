# Hackerrank - Sum of Odd Elements
defmodule Solution do
    defp read_list, do: IO.read(:stdio, :all) |> String.split([" ", "\n"]) |> Enum.map(fn x -> String.to_integer(x) end)

    def main() do
        read_list()
            |> Enum.filter(fn x -> rem(x, 2) != 0 end)
            |> Enum.reduce(fn x, acc -> x + acc end)
            |> IO.puts
    end
end

Solution.main()