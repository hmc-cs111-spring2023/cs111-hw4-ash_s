def collatz(x: Int): Int = 
  if (x % 2 == 0) (x/2)
  else (3*x+1)

def collatzCount(x: Int): Int =
  if (x == 1) (0)
  else (collatzCount(collatz(x)) + 1) 
