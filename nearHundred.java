public boolean nearHundred(int n) {
  int dif100;
  int dif200;
  
  dif100 = (100 - n);
  dif200 = (200 - n);
  dif100 = Math.abs(dif100);
  dif200 = Math.abs(dif200);
  
  if(dif100 <= 10 || dif200 <= 10)
  {
    return true;
  }
  return false;
}
