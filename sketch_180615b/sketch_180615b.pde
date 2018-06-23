void setup() {
  for (int i=100; i>10; i-=10) {
    if (i%20==0) {
      fill(#FF2E2E);
    } else {
      fill(#FFFFFF);
    }
    ellipse(50, 50, i, i);
  }
}