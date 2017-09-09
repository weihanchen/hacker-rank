# Hackerrank - String Mingling
defmodule Solution do
    defp read_list, do: IO.read(:stdio, :all) |> String.split(["-", "\n"])

    defp merge_char_list(list), do: Enum.map(list, fn e -> String.graphemes(e) end)

    def main() do
        read_list()
            |> merge_char_list
            |> List.zip
            |> Enum.map(fn {a, b} -> a <> b end)
            |> IO.puts
    end
end

Solution.main()