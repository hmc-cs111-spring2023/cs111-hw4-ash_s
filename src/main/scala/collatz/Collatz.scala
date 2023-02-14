def collatz(x: Int): Int = 
  if (x % 2 == 0) (x/2)
  else (3*x+1)
