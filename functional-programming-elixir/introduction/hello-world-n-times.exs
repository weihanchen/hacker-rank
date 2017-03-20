defmodule Solution do
   def hello(n) do
      if (n > 0) do
         IO.puts "Hello World"
         hello(n-1)
      end
   end
end

{n, _} = IO.gets("") |> Integer.parse
   
Solution.hello n