package question.chap6.q1;

public class CalculateProduct {
  int product1(int a, int b) {
    int product = 0;
    boolean stop = false;
    while ( !stop ) {
      if (b == 0) {
        stop = true;
        continue;
      }
      product += a;
      b--;
    }
    return product;
  }
  int product2(int a, int b) {
    int product = 0;

    for (; b > 0 ; b--) {
      product += a;
    }
    return product;
  }
  int product3(int a, int b) {
    if (b == 0) {
      return 0;
    }
    return product2(a,b-1) + a;
  }
}
