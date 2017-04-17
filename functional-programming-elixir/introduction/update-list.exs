# Hackerrank - Update List
defmodule Solution do
    defp read_list, do: IO.read(:stdio, :all) |> String.split([" ", "\n"]) |> Enum.map(fn x -> String.to_integer(x) end)
    def main() do
        read_list()
            |> Enum.map(fn x -> abs(x) end)
            |> Enum.map(fn x -> IO.puts x end)
    end
end

Solution.main()