# HackerRank - List Replication
defmodule Solution do
  # Because immutability in functional programming, so we cannot use imperative loop, then use recursively instead with.
  defp print(_, times) when times <= 0, do: nil

  defp print(msg, times) do
    IO.puts(msg)
    print(msg, times - 1)
  end

  def main(times) do
    values = IO.read(:stdio, :all)
      |> String.split([" ", "\n"])
    Enum.map(values, fn value -> print(value, times) end)
  end
end

n = IO.gets("") |> String.strip |> String.to_integer
Solution.main(n)
