public int diff21(int n) {
  int finalTotal = 0;
  if(n > 21)
  {
    finalTotal = 2 * (n - 21); 
  }
  else
  {
    finalTotal = 21 - n;
  }
  return finalTotal;
  
}
